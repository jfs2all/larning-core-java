package com.careerit.lcj.day7;

public class MyMathExample {


    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a,int b,int c){
        return a + b + c;
    }

    public String add(String firstName, String lastName){
         return firstName+" "+lastName;
    }

    public static void main(String[] args) {
        MyMathExample obj = new MyMathExample();
        System.out.println(obj.add("Krish","T"));
        System.out.println(obj.add(10,30));
    }


}
