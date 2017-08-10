package saleFlowers;

/**
 * Created by 1 on 08.08.2017.
 */
public class Tulip extends Flowers {
    private final int price = 45;

    @Override
    public void show() {
        System.out.print("Тюльпан");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
