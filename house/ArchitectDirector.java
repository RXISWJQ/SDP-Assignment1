package house;

public class ArchitectDirector {
    public void buildStarterWoodenHouse(HouseBuilder builder) {
        builder.setWallMaterial("Oak Planks")
               .setRoofType("Cobblestone Stairs")
               .addFurniture("Red Bed")
               .addFurniture("Crafting Table")
               .addFurniture("Double Chest")
               .setLighting("Torches")
               .setGarden(true);
    }

    public void buildModernStoneHouse(HouseBuilder builder) {
        builder.setWallMaterial("Smooth Quartz Blocks")
               .setRoofType("Glass Slab")
               .addFurniture("Black Bed")
               .addFurniture("Armor Stand")
               .setLighting("Lanterns")
               .setGarden(false);
    }
}