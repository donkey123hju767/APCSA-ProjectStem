import java.util.Arrays;
import java.util.Scanner;

public class StudentGradesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 2: Create an array to store grades
        double[] grades = new double[numStudents];

        // Step 3: Input grades
        System.out.println("Enter the grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Step 4: Calculate the average grade
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        double average = total / numStudents;

        // Step 5: Find the highest and lowest grades
        double highest = grades[0];
        double lowest = grades[0];
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        // Step 6: Sort the grades
        Arrays.sort(grades);

        // Step 7: Display the results
        System.out.println("\nResults:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Grades in ascending order: " + Arrays.toString(grades));

        scanner.close();
    }
}
