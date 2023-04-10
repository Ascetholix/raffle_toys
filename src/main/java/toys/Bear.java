package toys;

public class Bear extends Toys{

    public Bear(String name, int id,  int quantity) {
        super(name, id, quantity);
    }

    public Bear(int id) {
        super("Медвежонок", id,5);
    }

}
