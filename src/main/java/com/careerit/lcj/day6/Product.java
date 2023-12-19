package com.careerit.lcj.day6;

public class Product {

    private long pid;
    private String pname;
    private double price;
    private String brand;

    private int discountPercentage;

    public Product(long pid, String pname, double price, String brand, int discountPercentage) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }
    public Product(long pid, String pname, double price, String brand) {
        this(pid,pname,price,brand,0);
    }
    // Constructor overloading
    // 1. Constructor name should be same and parameter list should be different
    // 1. Number of parameters, type of parameters, order of parameters

    public void showProduct() {
        System.out.println("Product id :" + pid);
        System.out.println("Product name :" + pname);
        System.out.println("Product brand :" + brand);
        System.out.println("Product price :" + price);
        System.out.println("Product discount :" + discountPercentage);
        if (discountPercentage > 0) {
            double discountAmount = price * discountPercentage / 100;
            System.out.println("Discount amount :" + discountAmount);
            System.out.println("Discount price :" + (price - discountAmount));
        }
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
