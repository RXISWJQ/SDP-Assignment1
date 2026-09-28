package house;

public class BuildInstructionBuilder implements HouseBuilder {
    private final StringBuilder guide = new StringBuilder("=== MINECRAFT HOUSE BUILDING GUIDE ===\n");
    private int step = 1;

    @Override
    public BuildInstructionBuilder setWallMaterial(String material) {
        guide.append(step++).append(". Build 4-block high walls using ").append(material).append(".\n");
        return this;
    }

    @Override
    public BuildInstructionBuilder setRoofType(String roofType) {
        guide.append(step++).append(". Construct a ").append(roofType).append(" roof on top.\n");
        return this;
    }

    @Override
    public BuildInstructionBuilder addFurniture(String item) {
        guide.append(step++).append(". Place interior item: ").append(item).append(".\n");
        return this;
    }

    @Override
    public BuildInstructionBuilder setLighting(String lighting) {
        guide.append(step++).append(". Place ").append(lighting).append(" to prevent mob spawning.\n");
        return this;
    }

    @Override
    public BuildInstructionBuilder setGarden(boolean hasGarden) {
        if (hasGarden) {
            guide.append("(*) Extra: Fence off an outside area and plant wheat/carrots.\n");
        }
        return this;
    }

    public String getResult() {
        return guide.toString();
    }
}