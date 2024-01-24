import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Initialize array variables for 10 students
        String[] names = new String[10];
        int[] rollNumbers = new int[10];

        // Get input from user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.println("Enter roll number of student " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
        }

        // Display names and roll numbers of students
        try {
            for (int i = 0; i < names.length; i++) {
                System.out.println("Name: " + names[i]);
                System.out.println("Roll number: " + rollNumbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
