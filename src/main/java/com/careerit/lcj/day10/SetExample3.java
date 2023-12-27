package com.careerit.lcj.day10;

import com.careerit.lcj.day6.one.A;
import com.careerit.lcj.day9.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample3 {

    public static void main(String[] args) {

        SetExample3 obj = new SetExample3();
        List<Product> products = obj.getProducts();
        System.out.println("Total products :" + products.size());
        List<String> brands = getBrandName(products);
        System.out.println(brands);
    }

    private static List<String> getBrandName(List<Product> products) {
        Set<String> brandSet = new HashSet<>();
        for (Product product : products) {
            brandSet.add(product.getBrand());
        }
        return new ArrayList<>(brandSet);
    }

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        try {
            ObjectMapper objMapper = new ObjectMapper();
            products = objMapper.readValue(SetExample3.class.getResourceAsStream("/products.json"), new TypeReference<List<Product>>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
