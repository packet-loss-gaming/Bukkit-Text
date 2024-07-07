package gg.packetloss.bukkittext;

import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

class BukkitTextItemSerializer {
    private static RegistryAccess.Frozen getRegistry() {
        return MinecraftServer.getServer().registryAccess();
    }

    private static CompoundTag toTag(ItemStack stack) {
        CompoundTag compound = new CompoundTag();
        CraftItemStack.asNMSCopy(stack).save(getRegistry(), compound);
        return compound;
    }

    public static String toJSON(ItemStack stack) {
        return toTag(stack).toString();
    }
}
