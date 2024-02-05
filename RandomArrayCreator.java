import java.util.Random ;
public class RandomArrayCreator {

    private int [] randomArray; 


    // constructor 

    public RandomArrayCreator (int size)
    {
        this.randomArray = randomArrayGeneration(size);
    }


    // method for creating a random array 
    private int [] randomArrayGeneration (int size) {

        Random rand = new Random();
        int [] createdArray = new int [size] ;
        for ( int i = 0; i < size ; i++)
        {
            createdArray [i] = rand.nextInt(101) ;
        }

        return createdArray;
    }

    // getter method 
    public int [] getRandomArray(){
        return this.randomArray;
    }
    
}
