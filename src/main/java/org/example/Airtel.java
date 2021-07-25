package org.example;

public class Airtel implements Sim{
    //will print this when object is created by ApplicationContext in Mobile.main
    public Airtel(){
        System.out.println("Airtel constructor called");
    }
    @Override
    public void data() {
        System.out.println("Airtel data");
    }

    @Override
    public void calling() {
        System.out.println("Airtel calling");
    }
}
