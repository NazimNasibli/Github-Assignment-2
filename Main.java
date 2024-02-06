public class Main {    

    public static void main (String [] args ) {
        
        GetInput.getArraySizeInput();

        MenuOptions.listOptions();

        boolean keepGoing = true;

        while(keepGoing){
            int userChoice = GetInput.getUserChoice();
            keepGoing = MenuOptions.proccessUserChoice(userChoice);

        }
    }

}