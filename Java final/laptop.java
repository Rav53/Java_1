import java.util.ArrayList;

public class laptop {
    int itemID;
    String brand;
    String model;
    String os;
    int hdd;
    int ram;
    int vram;
    int cost;
    String colour;


    laptop (int itemID, String brand, String model, String os, int hdd, int ram, int vram, int cost, String colour) {
        this.itemID = itemID;
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.hdd = hdd;
        this.ram = ram;
        this.vram = vram;
        this.cost = cost;
        this.colour = colour;
    }
    public void bio() {
        System.out.println("==========================****************==============================");
        System.out.printf("Бренд: %s\n", brand);
        System.out.printf("Модель: %s\n", model);
        System.out.printf("Операционная система: %s\n", os);
        System.out.printf("Обьем HDD: %d\n", hdd);
        System.out.printf("Обьем RAM: %d\n", ram);
        System.out.printf("Обьем видеопамяти: %d\n", vram);
        System.out.printf("Цена: %d\n", cost);
        System.out.println("==========================****************==============================");
    }
    public static void searchByHDD(ArrayList<laptop> lapList, int param){
        for (laptop entry: lapList) {
            if(entry.hdd >= param){
                entry.bio();
            }
        }
    }
    public static void searchByRAM(ArrayList<laptop> lapList, int param){
        for (laptop entry: lapList) {
            if(entry.ram >= param){
                entry.bio();
            }
        }
    }
    public static void searchByVRAM(ArrayList<laptop> lapList, int param){
        for (laptop entry: lapList) {
            if(entry.vram >= param){
                entry.bio();
            }
        }
    }
    public static void searchByCost(ArrayList<laptop> lapList, int param){
        for (laptop entry: lapList) {
            if(entry.cost <= param){
                entry.bio();
            }
        }
    }
}