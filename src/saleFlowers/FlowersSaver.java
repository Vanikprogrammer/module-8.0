package saleFlowers;

import java.io.FileWriter;

/**
 * Created by 1 on 10.08.2017.
 */
public final class FlowersSaver {

    public static void save(String way, Flowers[]flowers){
        try{
            FileWriter writer = new FileWriter(way);


            for(int i = 0; i < flowers.length; i++){
                writer.write(flowers[i].toString() + " ");
                writer.flush();
            }



        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
