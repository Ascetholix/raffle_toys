package toys;

public class Barbie extends Toys{
    public Barbie(String name, int id, int frequency, int quantity) {
        super(name, id, frequency, quantity);
    }

    public Barbie(int id) {
        super("Барби", id, 1,20);
    }
}
