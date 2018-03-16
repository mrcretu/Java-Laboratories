public class Jewel extends Item {
    Jewel(String name, int price){
        setName(name);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Jewel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
