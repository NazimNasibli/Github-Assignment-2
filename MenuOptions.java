import java.util.*;

public class MenuOptions{

    static Scanner input = new Scanner(System.in);

    final static int numberOfChoices = 4;

    private static int arraySize = -1 ;

    public static int getArraySize(){
        return arraySize;
    }

    public static void listOptions(){
        System.out.println("1- Find the min and max of the array\n"+
                           "2- Find the average of the array and the individual differences of numbers in the array from the average\n"+
                           "3- Find the sum of odd and even indexed numbers in the array\n"+
                           "4- Exit\n");
    }

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

    public static boolean proccessUserChoice(int choice){
        RandomArrayCreator arrayCreator = new RandomArrayCreator(arraySize);
        int[] newArray = arrayCreator.getRandomArray();

        switch(choice){
            case 1:
                //find min max
                return true;

            case 2:
                //find ave
                int ave = ArrayAverage.calculateAverage(newArray);
                System.out.println("The average of the array is: " + ave);
                int[] differences = ArrayAverage.calculateDifferences(newArray);
                System.out.print("The differences of the numbers in the array from the average:\n" + "{ ");
                for(int i=0; i<arraySize-1; i++)
                    System.out.print(differences[i] + ", ");
                System.out.print(differences[arraySize-1] + " }\n");
                return true;

            case 3:
                //find odd even sums
                SumOfIndexes.updateIndexSum(arrayCreator.getRandomArray());
                System.out.println("The sum of even indexed numbers: " + SumOfIndexes.getEvenSum() + "\n" + "The sum of odd indexed numbers: " + SumOfIndexes.getOddSum() + "\n");
                return true;

            case 4:
                System.out.println("Exiting the program...");
                return false;

        }
        return false;
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