import java.util.Scanner;

public class GetInput{
    
    final static int numberOfChoices = 4;

    private static int arraySize = -1 ;

    public static int getArraySize(){
        return arraySize;
    }
        
    static Scanner input = new Scanner(System.in);

    public static int getUserChoice(){
        
        int inp = 0;

        boolean validInp = false;
        System.out.printf("Pick an option from 1 to %d: ", numberOfChoices);

        while(!validInp){

            if(input.hasNextInt()){
                inp = input.nextInt();

                if(inp >= 1 && inp <= numberOfChoices){
                    validInp = true;
                }
                else{
                    System.out.printf("Invalid choice. Please pick an option from 1 to %d:", numberOfChoices);
                }
            }
            else{
                System.out.printf("Invalid input. Please pick an integer from 1 to %d:", numberOfChoices);
                input.next();
            }
        }
    
        // inp = input.nextInt();

        return inp;
    }

    public static void getArraySizeInput() {
        
        boolean isValidSize = false;
        System.out.print("Enter the size of the array (between 0 and 100): ");

        while (!isValidSize) 
        {
        
            if (input.hasNextInt()) {
                arraySize = input.nextInt();

                if (arraySize > 0 && arraySize <= 100) 
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
    }
}