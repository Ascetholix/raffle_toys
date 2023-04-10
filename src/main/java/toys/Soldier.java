package toys;

public class Soldier extends Toys{
    public Soldier(String name, int id, int quantity) {
        super(name, id, quantity);
    }

    public Soldier(int id) {
        super("Солдатик", id,3);
    }

}
