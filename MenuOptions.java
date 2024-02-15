
public class MenuOptions{

    public static void listOptions(){
        System.out.println("1- Find the min and max of the array\n"+
                           "2- Find the average of the array and the individual differences of numbers in the array from the average\n"+
                           "3- Find the sum of odd and even indexed numbers in the array\n"+
                           "4- Exit\n");
    }

    public static boolean proccessUserChoice(int choice){
        int arraySize = GetInput.getArraySize();

        RandomArrayCreator arrayCreator = new RandomArrayCreator(arraySize);
        int[] newArray = arrayCreator.getRandomArray();

        System.out.println("askdhjfbasdkfjhb");
        switch(choice){
            case 1:
                //find min max
                System.out.printf("The min of the array is: %d\nThe max of the array is: %d\n", MinMax.minOfArray(newArray), MinMax.maxOfArray(newArray));
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

}