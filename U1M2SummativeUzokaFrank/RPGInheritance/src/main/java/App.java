public class App {
    public static void main(String[] args) {
Farmer MikeKnight = new Farmer("Mike Knight", 75, 100, 75, 10, 1);
Constable LebronJames = new Constable("Lebron James", 60, 100, 60, 20, 5, "La");
Warrior StephCurry = new Warrior("Steph Curry", 75, 100, 100, 50, 10,100);

        System.out.println(MikeKnight.getSpeed());
        System.out.println(MikeKnight.getAttackPower());
        System.out.println(MikeKnight.getHealth());
        System.out.println(MikeKnight.getName());
        System.out.println(MikeKnight.getStamina());
        System.out.println(MikeKnight.getStrength());
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println(LebronJames.getSpeed());
        System.out.println(LebronJames.getAttackPower());
        System.out.println(LebronJames.getHealth());
        System.out.println(LebronJames.getName());
        System.out.println(LebronJames.getStamina() + 1);
        System.out.println(LebronJames.getStrength());
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println(StephCurry.getSpeed());
        System.out.println(StephCurry.getAttackPower());
        System.out.println(StephCurry.getHealth());
        System.out.println(StephCurry.getName());
        System.out.println(StephCurry.getStamina());
        System.out.println(StephCurry.getStrength());


    }
}
