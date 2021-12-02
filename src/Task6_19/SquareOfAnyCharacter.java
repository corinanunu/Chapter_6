package Task6_19;

import java.util.Scanner;

public class SquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side;
        System.out.print("Enter the side of square --> ");
        side = input.nextInt();
        System.out.print("Enter the fill Character --> ");
        char fill = input.next().charAt(0);
        squareOfAsterisks(side, fill);
    }
    public static void squareOfAsterisks(int side, char fill){
        for ( int m = 0; m < side; ++m ) {
            for ( int n = 0; n < side; ++n ){
                System.out.print(fill);
            }
            System.out.println( );
        }
    }
}
