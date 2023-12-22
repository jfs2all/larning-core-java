package com.careerit.lcj.day9;

import java.util.List;

public class ProductManager {
    public static void main(String[] args) {

        ProductService productService = new ProductService();
        productService.showProducts();
        // Product in the range of 80000 to 100000
        List<Product> products = productService.getProductPriceBetween(80000, 100000);
        System.out.println("In the given range you have " + products.size() + " products");
        products.forEach(System.out::println);
    }
}
