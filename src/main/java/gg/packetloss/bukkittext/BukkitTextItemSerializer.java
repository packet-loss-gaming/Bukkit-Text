package gg.packetloss.bukkittext;

import net.minecraft.nbt.NBTTagCompound;
import org.bukkit.craftbukkit.v1_17_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

class BukkitTextItemSerializer {
    private static NBTTagCompound toTag(ItemStack stack) {
        NBTTagCompound compound = new NBTTagCompound();
        CraftItemStack.asNMSCopy(stack).save(compound);
        return compound;
    }

    public static String toJSON(ItemStack stack) {
        return toTag(stack).toString();
    }

}
