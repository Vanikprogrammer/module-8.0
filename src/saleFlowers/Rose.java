package saleFlowers;

/**
 * Created by 1 on 08.08.2017.
 */
public class Rose extends Flowers {
    private final int price = 100;

    @Override
    public void show() {
        System.out.print("Роза");
    }
    @Override
    public int getPrice() {
        return price;
    }
}
