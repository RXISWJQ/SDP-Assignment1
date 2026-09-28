package house;

import java.util.Collections;
import java.util.List;

public class House {
    private final String wallMaterial;
    private final String roofType;
    private final List<String> furniture;
    private final String lighting;
    private final boolean hasGarden;

    House(String wallMaterial, String roofType, List<String> furniture, String lighting, boolean hasGarden) {
        this.wallMaterial = wallMaterial;
        this.roofType = roofType;
        this.furniture = Collections.unmodifiableList(furniture);
        this.lighting = lighting;
        this.hasGarden = hasGarden;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public String getRoofType() {
        return roofType;
    }

    public List<String> getFurniture() {
        return furniture;
    }

    public String getLighting() {
        return lighting;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    @Override
    public String toString() {
        return "MinecraftHouse[walls=" + wallMaterial + ", roof=" + roofType +
               ", furniture=" + furniture + ", lighting=" + lighting +
               ", garden=" + hasGarden + "]";
    }
}