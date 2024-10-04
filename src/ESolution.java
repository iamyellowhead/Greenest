public enum ESolution {
    CACTUS_AMOUNT(2, 0),
    PALM_AMOUNT( 0, 0.5),
    CARNIVOROUSPLANT_AMOUNT(0.1, 0.2 );

    public final double perDay;
    public final double perHeight;

    ESolution(double perDay, double perHeight) {
        this.perDay = perDay;
        this.perHeight = perHeight;
    }
}
