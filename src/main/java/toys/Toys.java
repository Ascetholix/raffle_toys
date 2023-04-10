package toys;

public abstract class  Toys {
    protected String name;
    protected int id;
    protected int quantity;
    protected static int count;

    public Toys(String name, int id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return this.name;
    }
}
