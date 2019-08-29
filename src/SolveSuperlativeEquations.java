import java.util.Scanner;

public class SolveSuperlativeEquations {
    public static void main(String[] args) {
        System.out.println("Solve Superlative Equations");
        System.out.println("Given a equation as 'a * x + b = c' please enter constants :");
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("a : ");
        a = scanner.nextDouble();
        System.out.println("b : ");
        b = scanner.nextDouble();
        System.out.println("c : ");
        c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = %f!\n" + answer);
        } else {
            if (b == 0){
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
