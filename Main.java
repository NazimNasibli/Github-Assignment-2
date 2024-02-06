public class Main {    

    public static void main (String [] args ) {
        
        MenuOptions.getArraySizeInput();

        MenuOptions.listOptions();

        boolean keepGoing = true;

        while(keepGoing){
            int userChoice = MenuOptions.getUserChoice();
            keepGoing = MenuOptions.proccessUserChoice(userChoice);

        }
    }

}