import java.util.Scanner;

class ShoppingBill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = price * quantity;

        if (total > 5000) {
            total = total - (total * 0.10);
            System.out.println("Discount applied (10%)");
        }

        System.out.println("Total Bill Amount: " + total);

        sc.close();
    }
}
