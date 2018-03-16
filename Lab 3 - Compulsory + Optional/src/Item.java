public class Item {
    public String name;
    public int price;

    Item(){
        this.name = "";
        this.price = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }



}
