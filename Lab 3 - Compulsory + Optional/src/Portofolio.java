import java.util.ArrayList;

//it represents the solution for the problem
public class Portofolio  {
    ArrayList<Item> portofolio;
    Portofolio(){
        portofolio = new ArrayList<>(5);
    }

    public void add(Item item){
        portofolio.add(item);
    }

    @Override
    public String toString() {
        String string = new String();
        string += "\n";
        for(int i = 0; i < portofolio.size(); i++){
            string += i+1 + ": " + portofolio.get(i).name;
            string += "\n";
        }
        return string;
    }
}
