import java.util.Scanner;

public class Main {
        public static void main( String[] args )
        {
            // Change the application so that it finds the average of two double values.
            Scanner keyboard = new Scanner(System.in);

            double num1, num2;

            System.out.print( "First temperature? " );
            num1 = keyboard.nextDouble();

            System.out.print( "Second temperature? " );
            num2 = keyboard.nextDouble();

            System.out.println("The max value is : " + Math.max(num1, num2));
        }
    }

