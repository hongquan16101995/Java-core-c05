package baitap.btvn_31_07.service.impl;

import baitap.btvn_31_07.io.IOFile;
import baitap.btvn_31_07.model.Category;
import baitap.btvn_31_07.service.ICategoryService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryManage implements ICategoryService, IOFile<Category> {
    private final List<Category> categories;
    private final Scanner scanner;
    private final String PATH = "C:\\Users\\ADMIN\\Desktop\\Java-core-c05\\src\\baitap\\btvn_31_07\\io\\category";

    private static CategoryManage categoryManage;

    private CategoryManage(Scanner scanner) {
        this.scanner = scanner;
        categories = read(PATH);
        setIndex();
    }

    public static CategoryManage getInstance(Scanner scanner) {
        if (categoryManage == null) {
            categoryManage = new CategoryManage(scanner);
        }
        return categoryManage;
    }

    public List<Category> getCategories() {
        return categories;
    }

    private void setIndex() {
        if (!categories.isEmpty()) {
            int index = categories.get(0).getId();
            for (Category category : categories) {
                if (category.getId() > index) {
                    index = category.getId();
                }
            }
            Category.INDEX = index;
        } else {
            Category.INDEX = 0;
        }
    }

    private Category getCategory() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        return new Category(name);
    }

    @Override
    public void create() {
        categories.add(getCategory());
        write(categories, PATH);
    }

    @Override
    public void update() {
        Category category = findById();
        if (category != null) {
            System.out.println("Input new name: ");
            String name = scanner.nextLine();
            category.setName(name);
        }else {
            System.out.println("Not exist category have this id!");
        }
        write(categories, PATH);
    }

    @Override
    public Category findById() {
        System.out.println("Input id you want: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Category category : categories) {
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    @Override
    public void display() {
        if (!categories.isEmpty()) {
            for (Category category : categories) {
                System.out.println(category);
            }
        } else {
            System.out.println("Not exist category in list!");
        }
    }

    @Override
    public void write(List<Category> categories, String path) {
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(path))) {
            obj.writeObject(categories);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Category> read(String path) {
        List<Category> categoryList = new ArrayList<>();
        File file = new File(path);
        try  {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream obj = new ObjectInputStream(fileInputStream);
            if (obj.available() != -1) {
                categoryList =(List<Category>) obj.readObject();
            }
        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return categoryList;
    }
}
