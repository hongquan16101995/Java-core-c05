package baitap.btvn_11_07;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManage productManage = new ProductManage(scanner);

        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Add product");
            System.out.println("2. Update product by id");
            System.out.println("3. Remove product by id");
            System.out.println("4. Display all product");
            System.out.println("5. Display product max price");
            System.out.println("6. Display product min price");
            System.out.println("7. Display product max quantity");
            System.out.println("8. Display product min quantity");
            System.out.println("9. Display total money of store");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManage.addProduct();
                    break;
                case 2:
                    productManage.updateProduct();
                    break;
                case 3:
                    productManage.deleteProduct();
                    break;
                case 4:
                    productManage.displayAllProduct();
                    break;
                case 5:
                    productManage.maxPrice();
                    break;
                case 6:
                    productManage.minPrice();
                    break;
                case 7:
                    productManage.maxQuantity();
                    break;
                case 8:
                    productManage.minQuantity();
                    break;
                case 9:
                    productManage.totalMoneyOfProducts();
                    break;
            }
        } while (choice != 0);
    }
}
