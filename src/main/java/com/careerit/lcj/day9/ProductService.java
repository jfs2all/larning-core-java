package com.careerit.lcj.day9;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products;

    public ProductService() {
        init();
    }

    public void showProducts(){
        if(products.isEmpty()){
            System.out.println("No products found");
        }
        for(Product product:products){
            System.out.println(product);
            System.out.println("-----------------------------------");
        }
    }

    public List<Product> getProductPriceBetween(double startPrice,double endPrice){

        List<Product> productInRangeList = new ArrayList<>();
        for(Product product:products){
            if(product.getPrice() >= startPrice && product.getPrice() <= endPrice){
                productInRangeList.add(product);
            }
        }
        return productInRangeList;

    }

    public List<Product> getProductByBrand(String brand){
        List<Product> productList = new ArrayList<>();
        // TODO
        return productList;
    }
    public List<String> getBandNames(){
        List<String> brandNames = new ArrayList<>();
        // TODO
        // Brand names should not be duplicated
        return brandNames;
    }


    private void init(){
        ObjectMapper objMapper = new ObjectMapper();
        try {
            products = objMapper.readValue(ProductService.class.getResourceAsStream("/products.json"),
                    new TypeReference<List<Product>>() {});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
