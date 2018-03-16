import java.util.ArrayList;
import java.util.Random;

public class RandomAlgorithm implements Algorithm {

    public ArrayList<Item> items = new ArrayList<>();

    Random rand = new Random();

    public int get_random() {
        int random = rand.nextInt(2);
        return random;
    }

    public ArrayList<Item> solveProblem(Item[] ass_array, int mValue){
        ArrayList<Item> result = new ArrayList<>();
        int max_profit = 0;

        for(int iteration = 0; iteration < 1000; iteration++) {

            int copie = mValue; //copie pentru mValue

            for (int i = 0; i < ass_array.length; i++) { //parcurgem lista de iteme
                if (get_random() == 1) { //daca get_random returneaza 1(adauga) si nu 0(nu adauga)
                    if (copie - ass_array[i].price >= 0) { //verificam daca scazand din mValue pretul obiectului, nu depasim bugetul
                        items.add(ass_array[i]); //adaugam obiectul in lista de iteme
                        copie -= ass_array[i].price; // scadem din copie pretul obiectului
                    }
                }
            }
            int profit = 0;
            for (Item o : items) {
                profit += ((Asset) o).computeProfit();
                //System.out.println(o.name + "with computeProfit: " + ((Asset) o).computeProfit() + " and price: " + o.price);
            }
            //if(profit == 7) System.out.println(profit + " Found max");
            if(profit > max_profit)
            {
                result.removeAll(result);
                for(Item o : items){
                    result.add(o);
                }
                items.removeAll(items);
                max_profit = profit;
            }
            items.removeAll(items);
        }
            return result;
    }
        /*items.removeAll(items);*/
}
