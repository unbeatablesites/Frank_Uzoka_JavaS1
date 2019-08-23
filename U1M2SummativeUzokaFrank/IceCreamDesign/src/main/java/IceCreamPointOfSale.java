public class IceCreamPointOfSale {

    private String price;
    private int scoopCost;
    private int addTopping;
    private int bogo;
    private double promotionDiscount;
    private boolean addTax;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getScoopCost() {
        return scoopCost;
    }

    public void setScoopCost(int scoopCost) {
        this.scoopCost = scoopCost;
    }

    public int getAddTopping() {
        return addTopping;
    }

    public void setAddTopping(int addTopping) {
        this.addTopping = addTopping;
    }

    public int getBogo() {
        return bogo;
    }

    public void setBogo(int bogo) {
        this.bogo = bogo;
    }

    public double getPromotionDiscount() {
        return promotionDiscount;
    }

    public void setPromotionDiscount(double promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    public boolean isAddTax() {
        return addTax;
    }

    public void setAddTax(boolean addTax) {
        this.addTax = addTax;
    }

    public IceCreamPointOfSale(String price, int scoopCost, int addTopping, int bogo, double promotionDiscount, boolean addTax) {
        this.price = price;
        this.scoopCost = scoopCost;
        this.addTopping = addTopping;
        this.bogo = bogo;
        this.promotionDiscount = promotionDiscount;
        this.addTax = addTax;


    }
}
