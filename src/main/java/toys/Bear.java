package toys;

public class Bear extends Toys{
    public Bear(String name, int id, int frequency, int quantity) {
        super(name, id, frequency, quantity);
    }

    public Bear(int id) {
        super("Медвежонок", id, 1, 5);
    }
}
