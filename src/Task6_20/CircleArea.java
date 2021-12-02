package Task6_20;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.print("Enter the radius --> ");
        radius = input.nextDouble();
        System.out.println("The Area of a circle wiht radius = "+radius+" is --> "+circleArea(radius));
    }

    public static double circleArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }
}