package toys;

public class Soldier extends Toys{
    public Soldier(String name, int id, int frequency, int quantity) {
        super(name, id, frequency, quantity);
    }

    public Soldier(int id) {
        super("Солдатик", id, 2, 10);
    }
}
