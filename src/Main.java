import saleFlowers.FlowerStore;
import saleFlowers.FlowersLoader;

/**
 * Created by 1 on 09.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.sell(3,4,5);
        for(int i = 0; i < store.getBouquet().length; i++){
           store.getBouquet()[i].show();
        }

        System.out.print(",");
        store.sellSequence(3, 2, 4);
        for (int i = 0; i < store.getBouquet().length; i++) {
            store.getBouquet()[i].show();
        }
        System.out.println();
        System.out.println(" Сумма проданных цветов = " + store.getPurse());
        System.out.println();

        String way = "bouquet/makeBouquet.txt";
        FlowersLoader.load(way);

    }
}


