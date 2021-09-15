import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Useful variables
        double userHeight = 0.0;
        double userMass = 0.0;
        
        String userEntry;

        // Initialise the Scanner class
        Scanner input = new Scanner(System.in);

        // Request input from the user
        System.out.print("Please enter your height in meters: ");
        userEntry = input.nextLine();

        // Deal with the input mismatch exception
        while (checkUserInput(userEntry)) 
        {
            System.out.print("Please input a valid number for height in meters: ");
            userEntry = input.nextLine();
        }
        userHeight = Double.parseDouble(userEntry);


        System.out.print("Please enter your mass in kilograms: ");
        userEntry = input.nextLine();

        while (checkUserInput(userEntry)) {
            System.out.print("Please input a valid number for mass in kilograms: ");
            userEntry = input.nextLine();
        }
        userMass = Double.parseDouble(userEntry);

        // Call the calculator class
        BMICalculator calc = new BMICalculator();
        calc.setHeight(userHeight);
        calc.setMass(userMass);
        calc.printResult();
    }
    
    // Function to help you escape the input mismatch issues
    public static boolean checkUserInput(String userEntry)
    {
        boolean hasString = false;

        int index = 0;
        while (index < userEntry.length())
        {
            if(!(userEntry.charAt(index) >= '0' && userEntry.charAt(index) <= '9'))
            {
                hasString = true;
            }
            index++;
        }

        return hasString;
    }
}
