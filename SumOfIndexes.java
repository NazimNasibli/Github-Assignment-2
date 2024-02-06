public class SumOfIndexes {
    
    //instance variables
    private static int oddSum = 0;
    private static int evenSum = 0;
 

    //constructor
    public SumOfIndexes ()
    {

    }

    //get methods
    public static int getOddSum()
    {
        return oddSum;
    }

    public static int getEvenSum()
    {
        return evenSum;
    }

    //other methods
    public static void updateIndexSum(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 == 0)
            {
                evenSum += arr[i]; //updating the even sum by checking the index
            }
            else //for odd indexes
            {
                oddSum += arr[i]; //updating the odd sum by checking the index
            }
        }
    }
}
