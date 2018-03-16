public class Vehicle extends Item implements Asset {
    private int performace;
    public float risk_factor;

    Vehicle(String name, int performace, int price){
        setName(name);
        setPerformace(performace);
        setPrice(price);
        setRisk();
    }

    public void setPerformace(int performace) {
        this.performace = performace;
    }

    public int computeProfit() {
        return performace/super.price;
    }
    public void setRisk(){
        risk_factor = financial_risk();
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "risk_factor = " + risk_factor +
                ", name = '" + name + '\'' +
                ", performance = '" + performace + '\'' +
                ", price = " + price +
                '}';
    }
}
