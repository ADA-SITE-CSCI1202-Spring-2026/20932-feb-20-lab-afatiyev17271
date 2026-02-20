import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices: ");
        int n = sc.nextInt();
        sc.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Enter part number: ");
            String partNumber = sc.nextLine();

            System.out.print("Enter description: ");
            String partDescription = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter price per item: ");
            double price = sc.nextDouble();
            sc.nextLine();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
        }

        System.out.println("\n--- Invoice Results ---");

        for (int i = 0; i < invoices.length; i++) {
            System.out.println("\nInvoice " + (i + 1));
            System.out.println("Part number: " + invoices[i].getPartNumber());
            System.out.println("Description: " + invoices[i].getPartDescription());
            System.out.println("Quantity: " + invoices[i].getQuantity());
            System.out.println("Price per item: " + invoices[i].getPricePerItem());
            System.out.println("Invoice amount: " + invoices[i].getInvoiceAmount());
        }
    }
}