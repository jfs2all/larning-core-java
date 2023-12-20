package com.careerit.lcj.day7;
class One {
    int a = 100;
    public One(){
        System.out.println("One");
    }
    void m1(){
        System.out.println("Hello from m1 of One");
    }

}
class Two extends  One{
    int a = 999;
    public Two(){
        System.out.println("Two");
    }
    @Override
    void m1(){
        System.out.println("Hello from m1 of Two");
    }

}
public class ConstructorChainExample {

    public static void main(String[] args) {
            One obj = new Two();
            obj.m1();
            System.out.println(obj.a);
    }
}
