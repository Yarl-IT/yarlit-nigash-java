
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks for subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks for subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks for subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        int average = total / 3;

        if (average >= 75) {
            System.out.println("Grade: A");
        } else if (average >= 60) {
            System.out.println("Grade: B");
        } else if (average >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}