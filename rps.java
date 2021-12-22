import java.util.Random;
import java.util.Scanner;

public class rps 
{ 
    public static void main(String[] args) 
    { 
        String[] arr={"rock" ,"paper","scissor"}; // The three options
        Random r=new Random(); 
        int randomNumber=r.nextInt(arr.length);
        String programsChoice = arr[randomNumber];
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Your input: ");
    

    String usersChoice = myObj.nextLine();  // Read user input
    boolean retval1 = usersChoice.equalsIgnoreCase(programsChoice); // Finding if the random number and user input is the same

    System.out.println("Program's choice: " +  programsChoice);
    System.out.println("User's choice: " + usersChoice);

    if (retval1) {
        System.out.println("Tie");
        System.exit(0);
    }

    if (usersChoice.equalsIgnoreCase("rock") & (programsChoice).equals("scissor") | usersChoice.equalsIgnoreCase("paper") & (programsChoice).equals("rock") | usersChoice.equalsIgnoreCase("scissor") & (programsChoice).equals("paper")) {
        System.out.println("You win! Great job! :)");
        myObj.close();
    }
    else 
    {
        System.out.println("You lose :(");
        myObj.close();
    }

} 
}
