import java.util.Scanner;

public class Main {

    public static void main (String [] args ) {
        
        int arraySize = -1 ;
        Scanner input = new Scanner(System.in);
        
        boolean isValidSize = false;
        System.out.print("Enter the size of the array (between 0 and 100): ");

        while (!isValidSize) 
        {
        
            if (input.hasNextInt()) {
                arraySize = input.nextInt();

                if (arraySize >= 0 && arraySize <= 100) 
                {
                    isValidSize = true; 
                } 
                else
                {
                    System.out.print("Invalid size. Please enter a value between 0 and 100: ");
                }
            } 
            else 
            {
                System.out.print("Invalid input. Please enter an integer between 0 and 100: ");
                input.next(); 
            }
        }

        input.close();

        RandomArrayCreator newArray = new RandomArrayCreator(arraySize);


    }
}