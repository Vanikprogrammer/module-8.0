package saleFlowers;

/**
 * Created by 1 on 08.08.2017.
 */
public class FlowerStore {
   private Flowers []bouquet;
   private int purse = 0;
   private Rose ros = new Rose();
   private Chamomile chamomil = new Chamomile();
   private Tulip tul = new Tulip();

    public Flowers[] sell(int rose, int charmomile, int tulip){
        purse += (rose * ros.getPrice()) + (charmomile * chamomil.getPrice()) + (tulip * tul.getPrice());
        bouquet = new Flowers[rose + charmomile + tulip];
        for(int i = 0; i < bouquet.length; i++){
            if(i < rose){bouquet[i] = new Rose();}
            if(i >= rose && i < rose + charmomile){bouquet[i] = new Chamomile();}
            if(i >= rose + charmomile){bouquet[i] = new Tulip();}
        }

        return bouquet;

    }
    public Flowers[] sellSequence(int rose, int charmomile, int tulip){
        purse += (rose * ros.getPrice()) + (charmomile * chamomil.getPrice()) + (tulip * tul.getPrice());
        bouquet = new Flowers[rose + charmomile + tulip];
        for(int i = 0; i < bouquet.length; i++){
            if(rose > 0){
                bouquet[i++] = new Rose();
                rose--;
            }if(charmomile > 0){
                bouquet[i++] = new Chamomile();
                charmomile--;
            }if(tulip > 0){
                bouquet[i++] = new Tulip();
                tulip--;
            }
            i--;
        }

        return bouquet;
    }

    public Flowers[] getBouquet() {
        return bouquet;
    }

    public int getPurse() {
        return purse;
    }
}
