package Task6_16;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        int counter = 0;

        while(counter != -1){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter one number:");
            int num1 = input.nextInt();
            System.out.print("Enter a second number:");
            int num2 = input.nextInt();

            boolean result = isMultiple(num1,num2);

            if(result = true){
                System.out.println(num2 + " is a multiple of " + num1);
            }
            else{
                System.out.println(num2 + " is not a multiple of " + num1);
            }

            System.out.print("Enter data --> 0 or --> -1 for Exit >  ");
            counter = input.nextInt();
            System.out.println();
        }
    }

    public static boolean isMultiple (int x , int y){
        if(y % x == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}