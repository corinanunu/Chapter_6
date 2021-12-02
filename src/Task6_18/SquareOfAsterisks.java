package Task6_18;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side;
        System.out.print("Enter the side of square --> ");
        side = input.nextInt();
        squareOfAsterisks(side);
    }

    public static void squareOfAsterisks(int side){
        for ( int m = 0; m < side; ++m ) {
            for ( int n = 0; n < side; ++n ){
                System.out.print( "*" );
            }
            System.out.println( );
        }
    }
}