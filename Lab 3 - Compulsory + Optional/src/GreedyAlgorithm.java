import java.util.*;
public class GreedyAlgorithm  implements Algorithm{

    public ArrayList<Item> solveProblem(Item[] assets_array, int mValue)
    {
        ArrayList<Item> items = new ArrayList<Item>(5);
        int i=0;
        while( i<assets_array.length && mValue > 0 )
        {
            while(assets_array[i].price>mValue && i<assets_array.length && mValue-assets_array[i].price >= 0) i++;
            if(mValue-assets_array[i].price>=0)
            {
                items.add(assets_array[i]);
                mValue-=assets_array[i].price;
            }
            i++;
        }
        return items;
    }
}
