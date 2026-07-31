package arithmetic;

import java.util.Scanner;

interface Calculator {
void add(double a, double b);
void sub(double a, double b);
void mul(double a, double b);
void div(double a, double b);
}
class Operations implements Calculator {

    public void add(double a, double b) {
        System.out.println("Addition = " + (a + b));
    }

    public void sub(double a, double b) {
        System.out.println("Subtraction = " + (a - b));
    }

    public void mul(double a, double b) {
        System.out.println("Multiplication = " + (a * b));
    }

    public void div(double a, double b) {
        System.out.println("Division = " + (a / b));
    }
}

public class Arithmetic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Operations op = new Operations();

        System.out.print("Enter first number: ");
        double a = in.nextDouble();

        System.out.print("Enter second number: ");
        double b = in.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div): ");
        String choice = in.next();

        switch(choice) {
            case "add":
                op.add(a, b);
                break;

            case "sub":
                op.sub(a, b);
                break;

            case "mul":
                op.mul(a, b);
                break;

            case "div":
                op.div(a, b);
                break;

            default:
                System.out.println("Invalid operation");
        }
    }
}
