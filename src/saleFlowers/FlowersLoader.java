package saleFlowers;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by 1 on 10.08.2017.
 */
public final class FlowersLoader {

   private static FlowerStore store = new FlowerStore();

    public static Flowers[]load(String way){
        try{
            FileReader reader = new FileReader(way);
            BufferedReader br = new BufferedReader(reader);

            String []line1 = br.readLine().split(":");
            String []line2 = br.readLine().split(":");
            String []line3 = br.readLine().split(":");
            int rose = Integer.parseInt(line1[1]);
            int cham = Integer.parseInt(line2[1]);
            int tul = Integer.parseInt(line3[1]);

            store.sell(rose,cham,tul);

        }catch (Exception e){
            e.printStackTrace();
        }return store.getBouquet();
    }


}

