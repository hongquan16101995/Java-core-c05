package baitap.btvn_11_07;

import java.util.Scanner;

public class ProductManage {

    private Product[] products;
    private final Scanner scanner;

    public ProductManage(Scanner scanner) {
        products = new Product[0];
        this.scanner = scanner;
    }

    public void addProduct() {
        System.out.println("Enter id: ");
        //Integer là 1 lớp Wrapper
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter description: ");
        String description = scanner.nextLine();
        Product product = new Product(id, name, price, quantity, description);

        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[newProducts.length - 1] = product;
        products = newProducts;
    }

    public void updateProduct() {
        if (checkEmpty()) {
            System.out.println("Enter id your want to update: ");
            int id = Integer.parseInt(scanner.nextLine());
            int index = getIndex(id);
            if (index != -1) {
                System.out.println("Enter new name: " + products[index].getName());
                String name = scanner.nextLine();
                products[index].setName(name);
                System.out.println("Enter new price: " + products[index].getPrice());
                double price = Double.parseDouble(scanner.nextLine());
                products[index].setPrice(price);
                System.out.println("Enter new quantity: " + products[index].getQuantity());
                int quantity = Integer.parseInt(scanner.nextLine());
                products[index].setQuantity(quantity);
                System.out.println("Enter new description: " + products[index].getDescription());
                String description = scanner.nextLine();
                products[index].setDescription(description);
            } else {
                System.out.println("Not exist product have id!!!");
            }
        } else {
            System.out.println("Not exist products in store!!!");
        }
    }

    public void deleteProduct() {
        if (checkEmpty()) {
            System.out.println("Enter id your want to remove: ");
            int id = Integer.parseInt(scanner.nextLine());
            int index = getIndex(id);
            if (index != -1) {
                Product[] newProducts = new Product[products.length - 1];
                int newIndex = 0;
                for (Product product : products) {
                    if (product.getId() != id) {
                        newProducts[newIndex] = product;
                        newIndex++;
                    }
                }
                products = newProducts;
            } else {
                System.out.println("Not exist product have id!!!");
            }
        } else {
            System.out.println("Not exist products in store!!!");
        }
    }

    public void displayAllProduct() {
        if (checkEmpty()) {
            System.out.println("List product is: ");
            for (Product product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("Not exist products in store!!!");
        }
    }

    public void minPrice() {
        if (checkEmpty()) {
            double min = products[0].getPrice();
            for (Product product : products) {
                if (product.getPrice() < min) {
                    min = product.getPrice();
                }
            }
            System.out.println("Product have min price is: ");
            for (Product product : products) {
                if (product.getPrice() == min) {
                    System.out.println(product);
                }
            }
        }
    }

    public void maxPrice() {
        if (checkEmpty()) {
            double max = products[0].getPrice();
            for (Product product : products) {
                if (product.getPrice() > max) {
                    max = product.getPrice();
                }
            }
            System.out.println("Product have max price is: ");
            for (Product product : products) {
                if (product.getPrice() == max) {
                    System.out.println(product);
                }
            }
        }
    }

    public void minQuantity() {
        if (checkEmpty()) {
            int min = products[0].getQuantity();
            for (Product product : products) {
                if (product.getQuantity() < min) {
                    min = product.getQuantity();
                }
            }
            System.out.println("Product have min quantity is: ");
            for (Product product : products) {
                if (product.getQuantity() == min) {
                    System.out.println(product);
                }
            }
        }
    }

    public void maxQuantity() {
        if (checkEmpty()) {
            int max = products[0].getQuantity();
            for (Product product : products) {
                if (product.getQuantity() > max) {
                    max = product.getQuantity();
                }
            }
            System.out.println("Product have max quantity is: ");
            for (Product product : products) {
                if (product.getQuantity() == max) {
                    System.out.println(product);
                }
            }
        }
    }

    public void totalMoneyOfProducts() {
        double total = 0;
        if (checkEmpty()) {
            for (Product product : products) {
                total += product.getPrice() * product.getQuantity();
            }
        }
        System.out.println("Total money of product is: " + total);
    }

    private boolean checkEmpty() {
        return products.length != 0;
    }

    private int getIndex(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
