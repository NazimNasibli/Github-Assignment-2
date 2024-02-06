public class MinMax{
    //this method returns the biggest element in an integer array if the array does not contain any integers, it returns Integer.MIN_VALUE
    public static int maxOfArray(int [] numArray){
        int currentMax = Integer.MIN_VALUE;
        if(numArray.length == 0) return currentMax;
        
        for(int i: numArray){
            if(i > currentMax) currentMax = i;
        }
        return currentMax;
    }
    //this method returns the smallest element in an integer array if the array does not contain any integers, it return Integer.MAX_VALUE
    public static int minOfArray(int[] numArray){
        int currentmin = Integer.MAX_VALUE;
        if(numArray.length == 0) return currentmin;

        for(int i: numArray){
            if(i < currentmin) currentmin = i;
        }
        return currentmin;
    }
}