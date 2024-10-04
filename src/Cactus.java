public class Cactus extends Plant{
    private final ESolution e = ESolution.CACTUS_AMOUNT;

    public Cactus(String name,String liquid, double height){
        super(name, height);
    }
    public double calculateLiquid(){
        return e.perDay + (e.perHeight * getHeight());
    }

    @Override
    public String toString() {
        return "\nVäxten behöver " + calculateLiquid() + "cl " + ELiquid.mineralvatten;
    }
}

