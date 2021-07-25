package org.example;

public class Vodafone implements Sim{

    @Override
    public void data() {
        System.out.println("Vodafone data");
    }

    @Override
    public void calling() {
        System.out.println("Vodafone calling");
    }
}
