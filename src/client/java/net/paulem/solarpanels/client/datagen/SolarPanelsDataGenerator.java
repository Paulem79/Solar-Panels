package net.paulem.solarpanels.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.paulem.solarpanels.SolarPanels;
import org.jspecify.annotations.Nullable;

public class SolarPanelsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(SolarPanelsModelProvider::new);
    }

    @Override
    public @Nullable String getEffectiveModId() {
        return SolarPanels.MOD_ID;
    }
}