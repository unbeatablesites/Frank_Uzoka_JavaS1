public class App {
    public static void main(String[] args) {
        ShippingAddress shippingAddress = new ShippingAddress("740 Bellemeade ave Ne", "740 Bellemeade ave Ne", "Atlanta", "Georgia", "30318");
        BillingAddress billingAddress = new BillingAddress("740 Bellemeade ave Ne", "740 Bellemeade ave Ne", "Atlanta", "Georgia", "30318");
        RewardsMember rewardsMember = new RewardsMember(true);
        Customer customer = new Customer("Frank", "Uzoka", "777-777-7777", "Java@GT.com", rewardsMember, shippingAddress, billingAddress);

    }

}