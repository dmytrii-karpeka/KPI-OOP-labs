package lab_4;


import java.util.Arrays;
import java.util.Comparator;


public class Main {
    /**
     * C11 = 5 - define a class Clothes consisting at least from 5 fields
     *
     */
    public static void main(String[] args) {
        Clothes[] cloth = new Clothes[4];

        cloth[0] = new Clothes("jeans", "trousers", 32, "jeans");
        cloth[1] = new Clothes("jacket", "outerwear", 48, "cashmere");
        cloth[2] = new Clothes("pumped up kicks", "shoes", 39, "leather");
        cloth[3] = new Clothes("jacket", "outerwear", 43, "wool");

        System.out.println("---Basic output---\n");
        for (Clothes clothes : cloth) {
            System.out.println(clothes);
        }

        Arrays.sort(cloth, Comparator.comparing(Clothes::getName));

        System.out.println("\n---Sorting by name alphabetically---\n");
        for (Clothes clothes : cloth) {
            System.out.println(clothes.getName());
        }

        Arrays.sort(cloth, Comparator.comparing(Clothes::getSize));

        System.out.println("\n---Sorted by size reversed---\n");
        for (Clothes clothes : cloth) {
            System.out.println(clothes.getSize());
        }
    }
}
