public class IceCreamFactory {

    private String IceCreamflavor;
    private String kindOfIcecream;
    private String summerLogo;
    private String iceCreamBucket;
    private int expences;
    private int payRoll;
    private int leaseCost;
    private boolean systemDown;
    private boolean runningPromotion;

    public IceCreamFactory(String iceCreamflavor, String kindOfIcecream, String summerLogo, String iceCreamBucket, int expences, int payRoll, int leaseCost, boolean systemDown, boolean runningPromotion) {
        IceCreamflavor = iceCreamflavor;
        this.kindOfIcecream = kindOfIcecream;
        this.summerLogo = summerLogo;
        this.iceCreamBucket = iceCreamBucket;
        this.expences = expences;
        this.payRoll = payRoll;
        this.leaseCost = leaseCost;
        this.systemDown = systemDown;
        this.runningPromotion = runningPromotion;
    }

    public String getIceCreamflavor() {
        return IceCreamflavor;
    }

    public String getKindOfIcecream() {
        return kindOfIcecream;
    }

    public String getSummerLogo() {
        return summerLogo;
    }

    public String getIceCreamBucket() {
        return iceCreamBucket;
    }

    public int getExpences() {
        return expences;
    }

    public int getPayRoll() {
        return payRoll;
    }

    public int getLeaseCost() {
        return leaseCost;
    }

    public boolean isSystemDown() {
        return systemDown;
    }

    public boolean isRunningPromotion() {
        return runningPromotion;
    }
}
