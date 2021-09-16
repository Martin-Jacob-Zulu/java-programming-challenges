import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) throws Exception {

        double userHeight = 0.0;
        double userMass = 0.0;

        Scanner input = new Scanner(System.in);

        boolean done = false;

        while (!done) {
            try {
                System.out.print("Please enter your height in meters: ");
                userHeight = input.nextDouble();

                System.out.print("Please enter your mass in kilograms: ");
                userMass = input.nextDouble();
                done = true;
            } catch (InputMismatchException e) {
                String str = input.nextLine();
            }
        }
        
        BMICalculator calc1 = new BMICalculator();
        calc1.setHeight(userHeight);
        calc1.setMass(userMass);
        calc1.getBMICalculation();
        calc1.printResults();

    }

}
