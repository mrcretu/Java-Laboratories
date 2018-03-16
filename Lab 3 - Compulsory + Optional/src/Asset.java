public interface Asset {
    public int computeProfit();
    default float financial_risk(){
        return (float) 1.0/computeProfit();
    }
}
