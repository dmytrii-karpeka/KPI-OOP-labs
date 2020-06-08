package lab4;

public class Clothes {
    private String name;
    private String type;        //type of clothing (for ex. jacket, trousers, t-shirt...)
    private int size;        //for ex.: slim fit, fit, medium, extra large
    private String material;    //silk, cotton, denim, leather, etc

    /**
     *
      @param name - name of particular piece of clothing
     * @param type - which part of body it belongs
     * @param size - measure for all clothing (imagine, there unique system with certain measurement
     *            for all type of clothing.
     *             Also, there are no limits in size. Program suits for all bodies)
     * @param material - what product consist of (imagine, there only ONE material was necessary for production)
     */
    public Clothes(String name, String type, int size, String material/*, String brand*/) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.material = material;
//        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "name=" + name +
                ", type=" + type +
                ", size=" + size +
                ", material=" + material +
                '}';
    }
}
