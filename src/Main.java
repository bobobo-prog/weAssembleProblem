import DTOs.Product;
import Impl.VendingMachine;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Products to choose from: ");
        vendingMachine.printInventory();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Insert coin");
            System.out.println("2. Select product");
            System.out.println("3. Stock Inventory");
            System.out.println("4. Show Inventory");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter coin value: ");
                    int coin = scanner.nextInt();
                    vendingMachine.insertCoin(coin);
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    String product = scanner.nextLine();
                    vendingMachine.selectProduct(product);
                    break;
                case 3:
                    System.out.println("Enter stock with price & quantity e.g: 10 Pepsi 25 ");
                    String stock = scanner.nextLine();
                    String [] arr = stock.split(" ");
                    Product temp = new Product(Integer.parseInt(arr[0]),Integer.parseInt(arr[2]));
                    vendingMachine.updateStock(arr[1],temp);
                    System.out.println("Stock Entered Successfully!");
                    break;
                case 4:
                    vendingMachine.printInventory();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
