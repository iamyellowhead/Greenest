public class CarnivorousPlant extends Plant {
    private final ESolution e = ESolution.CARNIVOROUSPLANT_AMOUNT;
    public CarnivorousPlant(String name, String liquid, double height){
        super(name, height);
    }

    public double calculateLiquid(){
        return e.perDay + (e.perHeight * getHeight());
    }

    @Override
    public String toString() {
        return "\nVäxten behöver " + calculateLiquid() + "l " + ELiquid.proteindryck;
    }
}
