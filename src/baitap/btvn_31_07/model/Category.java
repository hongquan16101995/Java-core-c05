package baitap.btvn_31_07.model;

import java.io.Serializable;

public class Category implements Serializable {
    private static long serialUID = 12345678;
    public static int INDEX = 0;
    private int id;
    private String name;

    public Category() {
    }

    public Category(String name) {
        this.id = ++INDEX;
        this.name = name;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
