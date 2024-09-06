package WEEK2.Assignment;

public class Circle {
    public double phi = 3.14;
    public double r;

    public double calcArea(){
        return phi*r*r; // Area formula: πr²
    }

    public double calcCircumference(){
        return 2*phi*r; // Circumference formula: 2πr
    }

    public void displayResult(){
        System.out.println("Radius        : " + r);
        System.out.println("Area          : " + calcArea());
        System.out.println("Circumference : " + calcCircumference());
    }
}
