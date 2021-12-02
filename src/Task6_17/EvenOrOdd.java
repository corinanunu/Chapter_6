package Task6_17;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        int counter = 0;
        int number;

        Scanner input = new Scanner(System.in);


        while(counter != -1){
            System.out.print("Enter the number --> ");
            number = input.nextInt();

            boolean result =  isEven(number);
            if(result == true){
                System.out.printf("Number - %d is even\n\n", number);
            }else{
                System.out.printf("Number - %d is odd\n\n", number);
            }
            System.out.print("Enter data --> 0 or --> -1 for Exit >  ");
            counter = input.nextInt();
            System.out.println();
        }

    }

    public static boolean isEven(int x){
        if(x % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}