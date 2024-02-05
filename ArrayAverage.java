public class ArrayAverage {

    // Methods for calculating average and differences
    public static int calculateAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        
        return sum / array.length;
    }

    public static int[] calculateDifferences(int[] array) {
        int average = calculateAverage(array);
        int[] newArr = new int[array.length];
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = array[i] - average;
        }
        return newArr;
    }
}