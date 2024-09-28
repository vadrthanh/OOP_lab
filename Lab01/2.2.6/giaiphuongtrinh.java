import java.util.Scanner;

public class giaiphuongtrinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu for choosing the type of equation
        System.out.println("Choose an equation to solve:");
        System.out.println("1. First-degree equation with one variable (ax + b = 0)");
        System.out.println("2. System of first-degree equations with two variables");
        System.out.println("3. Second-degree equation with one variable (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveSystemOfLinearEquations(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Solves the first-degree linear equation ax + b = 0
    public static void solveLinearEquation(Scanner scanner) {
        System.out.println("Solving ax + b = 0");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter constant b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a valid equation (a cannot be 0).");
        } else {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        }
    }

    // Solves a system of two first-degree equations with two variables
    public static void solveSystemOfLinearEquations(Scanner scanner) {
        System.out.println("Solving the system of equations:");
        System.out.println("a11 * x1 + a12 * x2 = b1");
        System.out.println("a21 * x1 + a22 * x2 = b2");

        // Input coefficients for the first equation
        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();

        // Input coefficients for the second equation
        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();

        // Calculate determinants
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        // Check for solutions
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The solution is: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Solves the quadratic equation ax^2 + bx + c = 0
    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("Solving ax^2 + bx + c = 0");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter constant c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a valid quadratic equation (a cannot be 0).");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two real roots: x1 = " + root1 + ", x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The equation has one real root (double root): x = " + root);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }
    }
}
