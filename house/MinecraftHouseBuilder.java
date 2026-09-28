package house;

import java.util.ArrayList;
import java.util.List;

public class MinecraftHouseBuilder implements HouseBuilder {
    private String wallMaterial;
    private String roofType;
    private final List<String> furniture = new ArrayList<>();
    private String lighting;
    private boolean hasGarden;

    @Override
    public MinecraftHouseBuilder setWallMaterial(String material) {
        this.wallMaterial = material;
        return this;
    }

    @Override
    public MinecraftHouseBuilder setRoofType(String roofType) {
        this.roofType = roofType;
        return this;
    }

    @Override
    public MinecraftHouseBuilder addFurniture(String item) {
        if (item != null && !item.isBlank()) {
            this.furniture.add(item);
        }
        return this;
    }

    @Override
    public MinecraftHouseBuilder setLighting(String lighting) {
        this.lighting = lighting;
        return this;
    }

    @Override
    public MinecraftHouseBuilder setGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House getResult() {
        if (wallMaterial == null || wallMaterial.isBlank()) {
            throw new IllegalStateException("House must have walls material.");
        }
        if (roofType == null || roofType.isBlank()) {
            throw new IllegalStateException("House must have a roof type.");
        }
        return new House(wallMaterial, roofType, furniture, lighting, hasGarden);
    }
}