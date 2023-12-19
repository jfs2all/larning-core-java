package com.careerit.lcj.day6;

public class ProductManager {

    public static void main(String[] args) {

            Product product1 = new Product(10001,"Lenovo Thinkpad",45000,"Lenovo",10);
            Product product2 = new Product(10002,"Dell Inspiron",35000,"Dell",0);
            Product product3 = new Product(10003,"HP Pavilion",55000,"HP",15);
            Product product4 = new Product(10004,"Macbook Pro",95000,"Apple",10);
            Product product5 = new Product(10005,"Macbook Air",75000,"Apple",0);
            Product product6 = new Product(10006,"Asus Zenbook",65000,"Asus",5);
            Product product7 = new Product(10007,"Acer Aspire",55000,"Acer",0);
            Product product8 = new Product(10008,"Lenovo Ideapad",45000,"Lenovo",10);
            Product product9 = new Product(10009,"Dell Vostro",35000,"Dell",0);
            Product product10 = new Product(10010,"HP Envy",55000,"HP",15);

            Product[] products = new Product[]{product1,product2,product3,product4,product5,product6,product7,product8,product9,product10};

            // print all the product names

            for(Product product:products) {
                System.out.println(product.getPname());
            }


    }
}
