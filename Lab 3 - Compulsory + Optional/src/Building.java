public class Building extends Item implements Asset {
    private int area;
    public float risk_factor;

    Building(String name, int area, int price){
        setName(name);
        setArea(area);
        setPrice(price);
        setRisk();
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int computeProfit() {
        return area / super.price;
    }

    public void setRisk(){
        risk_factor = financial_risk();
    }

    @Override
    public String toString() {
        return "Building {" +
                "risk_factor = " + risk_factor +
                ", name = '" + name + '\'' +
                ", area = '" + area + '\'' +
                ", price = " + price +
                '}';
    }
}
