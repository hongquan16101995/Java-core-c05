package baitap.btvn_31_07;

import baitap.btvn_31_07.service.impl.CategoryManage;
import baitap.btvn_31_07.service.impl.ProductManage;
import baitap.btvn_31_07.system.MenuCategory;
import baitap.btvn_31_07.system.MenuProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuCategory menuCategory = new MenuCategory();
        MenuProduct menuProduct = new MenuProduct();
        CategoryManage categoryManage = new CategoryManage(scanner);
        ProductManage productManage = new ProductManage(scanner,categoryManage);
        do {
            System.out.println("Menu");
            System.out.println("1. Menu product");
            System.out.println("2. Menu category");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuProduct.menu(productManage);
                    break;
                case 2:
                    menuCategory.menu(categoryManage);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
