import saleFlowers.*;

/**
 * Created by 1 on 09.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.sell(3,4,5);                  /*здесь вызывается букет цветов в формате все розы + все ромашки + все тюльпаны*/

        for(int i = 0; i < store.getBouquet().length; i++){
           store.getBouquet()[i].show();
        }

        System.out.print(",");
        store.sellSequence(3, 2, 4);
        for (int i = 0; i < store.getBouquet().length; i++) {
            store.getBouquet()[i].show();
        }
        System.out.println();
        System.out.println(" Сумма проданых цветов = " + store.getPurse());
        System.out.println();

        String way = "bouquet/makeBouquet.txt";
        Flowers[] flowers = FlowersLoader.load(way);
        for(int i = 0; i < flowers.length; i++){
            flowers[i].show();
        }
        System.out.println();
        String way1 = "bouquet/safeBouqet.txt";
        Flowers[] flowers1 = new Flowers[]{new Rose(), new Chamomile(), new Tulip(), new Rose(),new Tulip(),new Chamomile()};
        FlowersSaver.save(way1,flowers1);

    }
}


