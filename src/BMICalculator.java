public class BMICalculator {
    double mass;
    double height;


    //====================================This is a constructors section====================================

    //-------This is the default constructor----------
    public BMICalculator() {
    }

    //-------This is a custom constructor--------------
    public BMICalculator(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }


    //========================================This is a setters and getters section==========================

    public double getBMI() {
        return getMass() / Math.pow(getHeight(), 2);
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printResult() {
        if (getBMI() < 0.5) {
            System.out.println("The person is obese");
        } else if (getBMI() >= 0.5 && getBMI() <= 1.0) {
            System.out.println("The person is health.");
        } else if (getBMI() > 1) {
            System.out.println("The person is underweight.");
        } else {
            System.out.println("Something went wrong");
        }
    }

}
