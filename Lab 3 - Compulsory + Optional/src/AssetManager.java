import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class AssetManager {

        private int poz = 0;
        private Item[] items_array;
        private ArrayList<Item> it_array;
        private Item[] assets_items;
        private ArrayList<Item> array;



        AssetManager(){
            items_array = new Item[6];
            it_array = new ArrayList<>(6);
            array = new ArrayList<>(6);
        }


        public void add(Item ... args){
            for(int i = 0; i < args.length; i++){ //imi parcurge argumentele primite
                items_array[poz] = args[i];
                poz += 1;
            }
        }

        public String getItems(){
            String string = new String();
            Arrays.sort(items_array, new Comparator<Object>() {
                @Override
                public int compare(Object o1, Object o2) {
                    Item i1 = ( Item ) o1;
                    Item i2 = ( Item ) o2;
                    return i1.getName().compareTo(i2.getName());
                }
            });
            for(int i = 0; i < items_array.length; i++){
                it_array.add(items_array[i]);
                string += items_array[i].name;
                string += "\n";
            }
            return string;
        }


    public String getAssets(){


            int size = 0;
            for(int i = 0; i < items_array.length; i++)
            {
                if(items_array[i] instanceof Asset) size++;
            }
            assets_items = new Item[size];
            //size = 0;
            size--;
            for(int i = 0; i < items_array.length; i++){
                if(items_array[i] instanceof Asset) {
                    assets_items[size] = items_array[i];
                    size--;
                }
            }

            //sort assets_items (items that implements computeProfit method) asceding way
            Arrays.sort(assets_items, new Comparator<Object>() {
             @Override
             public int compare(Object o1, Object o2) {
                 Asset a1 = (Asset) o1;
                 Asset a2 = (Asset) o2;
                 if(a1.computeProfit() < a2.computeProfit()) return 1;
                 else if (a1.computeProfit()==a2.computeProfit()) return 0;
                 return -1;
             }
         });
         return toString(assets_items);
        }

    public Portofolio createPortofolio(Algorithm algorithm, int maxValue){

        Portofolio solution = new Portofolio();

        array = algorithm.solveProblem(assets_items,maxValue);

        for(Item o : array){
            solution.add(o);
        }
        return solution;
    }

    public String toString(Item[] array) {
        String string = new String();
        string += "\nList of items: \n";
        for(int i = 0; i < array.length; i++){
            string += array[i];
            string += "\n";
        }
        return string;
    }
    }
