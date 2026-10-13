import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NO1: ");
        int a = sc.nextInt();

        System.out.print("Enter no2: ");
        int b = sc.nextInt();

        System.out.print("Enter choice (1:+, 2:-, 3:*, 4:/): ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
	     