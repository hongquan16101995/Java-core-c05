package baitap.btvn_31_07.service;

import baitap.btvn_31_07.model.Category;
import baitap.btvn_31_07.model.Product;

public interface IProductService extends IGenerateSerVice<Product> {

    void deleteById();
    void displayMaxPrice();

    void displayMinPrice();

    void searchByName();

    void searchByPrice();

    void displayByCategory(Category category);
}
