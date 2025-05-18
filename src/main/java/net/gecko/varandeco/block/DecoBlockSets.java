package net.gecko.varandeco.block;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.Map;
import java.util.stream.Stream;

public record DecoBlockSets(
        String name,
        BlockSoundGroup soundType,
        SoundEvent doorClose,
        SoundEvent doorOpen,
        SoundEvent trapdoorClose,
        SoundEvent trapdoorOpen,
        SoundEvent pressurePlateClickOff,
        SoundEvent pressurePlateClickOn,
        SoundEvent buttonClickOff,
        SoundEvent buttonClickOn) {

    private static final Map<String, BlockSetType> VALUES = new Object2ObjectArrayMap<>();

    public static final BlockSetType DEEPSLATE = registerBlockSets(new BlockSetType("deepslate",
                    BlockSoundGroup.DEEPSLATE,
                    SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final BlockSetType POLISHED_DEEPSLATE = registerBlockSets(new BlockSetType("polished_deepslate",
            BlockSoundGroup.POLISHED_DEEPSLATE,
                    SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final BlockSetType BLACKSTONE = registerBlockSets(new BlockSetType("blackstone",
                    BlockSoundGroup.STONE,
                    SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final BlockSetType COPPER = registerBlockSets(new BlockSetType("copper",
                    BlockSoundGroup.COPPER,
                    SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));

    public static final BlockSetType CACUTS = registerBlockSets(new BlockSetType("cactus"));
    public static final BlockSetType WOODEN = registerBlockSets(new BlockSetType("wooden"));

    private static BlockSetType registerBlockSets(BlockSetType blockSetType) {
        VALUES.put(blockSetType.name(), blockSetType);
        return blockSetType;
    }
    public static Stream<BlockSetType> stream() {
        return VALUES.values().stream();
    }
}
