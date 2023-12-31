package baitap.btvn_31_07.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static long serialUID = 12345678;
    public static int INDEX = 0;
    private int id;
    private String name;
    private double price;

    private Category category;

    public Product() {
    }

    public Product(String name, double price, Category category) {
        this.id = ++INDEX;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product(int id, String name, double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
