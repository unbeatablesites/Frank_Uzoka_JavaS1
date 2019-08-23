
public class ObjectMain {
    public static void main(String[] args) {
        CalculatorObject calculations = new CalculatorObject();
//                  methods Using Int
        System.out.println("Add Method (1+1) = " + calculations.add(1,1));
        System.out.println("Subtract Method (23-52) = " + calculations.subtract(23,52));
        System.out.println("Multiplication Method (34*2) = " + calculations.multiply(34,2));
        System.out.println("Division Method (12/3) = " + calculations.divide(12,3));
        System.out.println("Division Method (12/7) = " + calculations.divide(12,7));
        //                  methods Using Double
        System.out.println("Addition Method With Double  (3.4 + 2.3) = " + calculations.addDouble(3.4,2.3));
        System.out.println("Multiplication Method With Double  (6.7*4.4) = " + calculations.multiplyDouble(6.7,4.4));
        System.out.println ("Subtraction Method With Double  (5.5-0.5) = " + calculations.subtractDouble(5.5,0.5));
        System.out.println("Division Method With Double  (10.8/2.2) = " + calculations.divideDouble(10.8,2.2));



    }
}