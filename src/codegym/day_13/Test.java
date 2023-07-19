package codegym.day_13;

import java.util.Scanner;

public class Test {
    static class Product {
        int id;
        String name;
        int price;

        public Product(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {
        Product product = new Product(1,"Nước", 10000);
        Scanner scanner = new Scanner(System.in);
        System.out.println(product);
        System.out.println("Nhập id bạn muon sửa: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên mới:");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            product.setName(name);
        }
        System.out.println("Nhập giá mới:");
        String price = scanner.nextLine();
        if (!price.isEmpty()) {
            int newPrice = Integer.parseInt(price);
            product.setPrice(newPrice);
        }
        System.out.println(product);
    }
}
