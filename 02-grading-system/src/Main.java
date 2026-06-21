import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradingSystem gradingSystem = new GradingSystem();

        System.out.print("Enter the numeric score (0-100): ");
        double score = scanner.nextDouble();

        try {
            char grade = gradingSystem.getGrade(score);
            System.out.println("The letter grade is: " + grade);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
