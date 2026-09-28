package house;

public interface HouseBuilder {
    HouseBuilder setWallMaterial(String material);
    HouseBuilder setRoofType(String roofType);
    HouseBuilder addFurniture(String item);
    HouseBuilder setLighting(String lighting);
    HouseBuilder setGarden(boolean hasGarden);
}