import java.util.ArrayList;

public class Main {

    public static ArrayList <Integer> sumOfIndexes(int[] arr)
    {
        ArrayList <Integer> sums = new ArrayList<>();
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 == 0) // even indexes
            {
                even += arr[i]; //Updating sum
            }
            else // odd indexes
            {
                odd += arr[i]; //Updating sum
            }
        }
        sums.add(even); sums.add(odd);
        return sums;
    }
    public static void main(String[] args) {

        // Deneme
        int [] arr = {1, 7, 3, 10, 21, 10};
        System.out.println("Even Index Sum: " + sumOfIndexes(arr).get(0) + " Odd Index Sum: " + sumOfIndexes(arr).get(1));
    }
}