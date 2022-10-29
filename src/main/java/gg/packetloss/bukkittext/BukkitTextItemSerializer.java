package gg.packetloss.bukkittext;

import net.minecraft.nbt.CompoundTag;
import org.bukkit.craftbukkit.v1_19_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

class BukkitTextItemSerializer {
    private static CompoundTag toTag(ItemStack stack) {
        CompoundTag compound = new CompoundTag();
        CraftItemStack.asNMSCopy(stack).save(compound);
        return compound;
    }

    public static String toJSON(ItemStack stack) {
        return toTag(stack).toString();
    }
}
