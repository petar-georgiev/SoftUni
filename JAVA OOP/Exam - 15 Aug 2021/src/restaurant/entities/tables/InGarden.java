package restaurant.entities.tables;

public class InGarden extends BaseTable{
    private static final double CONSTANT_PRICE = 4.50;
    public InGarden(int number, int size) {
        super(number, size, CONSTANT_PRICE);
    }
}
