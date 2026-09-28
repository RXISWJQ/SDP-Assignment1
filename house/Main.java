package house;

public class Main {
    public static void main(String[] args) {
        ArchitectDirector architect = new ArchitectDirector();

        MinecraftHouseBuilder houseBuilder = new MinecraftHouseBuilder();
        architect.buildStarterWoodenHouse(houseBuilder);
        House house = houseBuilder.getResult();

        BuildInstructionBuilder guideBuilder = new BuildInstructionBuilder();
        architect.buildStarterWoodenHouse(guideBuilder);
        String guide = guideBuilder.getResult();

        System.out.println(house);
        System.out.println();
        System.out.println(guide);
    }
}