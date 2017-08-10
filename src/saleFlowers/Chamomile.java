package saleFlowers;

/**
 * Created by 1 on 08.08.2017.
 */
public class Chamomile extends Flowers {
    private final int price = 70;

    @Override
    public void show() {
        System.out.print("Ромашка");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
