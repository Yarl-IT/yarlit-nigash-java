import java.util.Scanner;

class Atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int balance = 10000;
        char choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");

            System.out.print("Choose option: ");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int dep = scan.nextInt();

                    if (dep > 0) {
                        balance += dep;
                        System.out.println("Updated Balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int wd = scan.nextInt();

                    if (wd > 0 && wd <= balance) {
                        balance -= wd;
                        System.out.println("Updated Balance: " + balance);
                    } else {
                        System.out.println("Invalid amount or insufficient balance!");
                    }
                    break;

                default:
                    System.out.println("Invalid option");
            }

            System.out.print("Do you want another operation? (y/n): ");
            choice = scan.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you! Have a nice day.");
        scan.close();
    }
}