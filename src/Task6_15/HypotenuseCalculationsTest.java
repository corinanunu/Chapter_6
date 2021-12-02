package Task6_15;

public class HypotenuseCalculationsTest {
    public static void main(String[] args) {


        HypotenuseCalculations triangle1 =  new HypotenuseCalculations(3.0, 4.0);
        HypotenuseCalculations triangle2 = new HypotenuseCalculations(5.0, 12.0);
        HypotenuseCalculations triangle3 = new HypotenuseCalculations(8.0, 15.0);


        System.out.println("Triangle1");
        System.out.printf("Side1 = %.2f\n", triangle1.getSide1());
        System.out.printf("Side2 = %.2f\n", triangle1.getSide2());
        System.out.printf("Hypotenuses = %.2f\n", calculateHypotenuse(triangle1.getSide1(), triangle1.getSide2()));

        System.out.println();

        System.out.println("Triangle2");
        System.out.printf("Side1 = %.2f\n", triangle2.getSide1());
        System.out.printf("Side2 = %.2f\n", triangle2.getSide2());
        System.out.printf("Hypotenuses = %.2f\n", calculateHypotenuse(triangle2.getSide1(), triangle2.getSide2()));

        System.out.println();

        System.out.println("Triangle3");
        System.out.printf("Side1 = %.2f\n", triangle3.getSide1());
        System.out.printf("Side2 = %.2f\n", triangle3.getSide2());
        System.out.printf("Hypotenuses = %.2f\n", calculateHypotenuse(triangle3.getSide1(), triangle3.getSide2()));

        System.out.println();
        System.out.println("Calculate with class Math.hypot");
        System.out.printf("Hypotenuses of triangle1 = %.2f\n", Math.hypot(triangle1.getSide1(), triangle1.getSide2()));
        System.out.printf("Hypotenuses of triangle2 = %.2f\n", Math.hypot(triangle2.getSide1(), triangle2.getSide2()));
        System.out.printf("Hypotenuses of triangle3 = %.2f\n", Math.hypot(triangle3.getSide1(), triangle3.getSide2()));
    }

    public static double calculateHypotenuse(double side1, double side2){
        double hyp = 0.0;
        hyp = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hyp;
    }
}