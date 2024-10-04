public class Palm extends Plant{
    private final ESolution e = ESolution.PALM_AMOUNT;
    public Palm(String name, String liquid, double height){
        super(name, height);
    }
    public double calculateLiquid(){
        return e.perDay + (e.perHeight * getHeight());
    }

    @Override
    public String toString() {
        return "\nVäxten behöver " + calculateLiquid() + "l " + ELiquid.kranvatten;
    }
}
