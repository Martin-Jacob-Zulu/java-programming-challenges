public class BMICalculator {
    double height;
    double mass;

    public BMICalculator() {
    }

    public BMICalculator(double height, double mass) {
        this.height = height;
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getBMICalculation() {
        return getMass() / Math.pow(getHeight(), 2);
    }

    public void printResults() {
        System.out.println(getBMICalculation());
        if (getBMICalculation() < 24.9) {
            System.out.println("Underweight");
        }
        else if (getBMICalculation() >= 24.9 && getBMICalculation() <= 29.9)
        {
            System.out.println("Normal");
        }
        else if (getBMICalculation() > 29.9)
        {
            System.out.println("Obese");
        }
        else {
            System.out.println("There was a problem, please try again");
        }
    }
}
