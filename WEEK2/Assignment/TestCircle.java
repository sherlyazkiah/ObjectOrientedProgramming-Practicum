package WEEK2.Assignment;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.print("Enter the radius of the circle: ");
        circle.r = sc.nextDouble();

        circle.displayResult();

        sc.close();
    }
}
