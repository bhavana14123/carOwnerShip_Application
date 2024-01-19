package com.carOwnerShip;

public class SportsTyre implements Tyre {
    @Override
    public void getInfo() {
        System.out.println("This is a Sports Tyre");

    }

    @Override
    public String tyreType() {
        return "Sports Tyre";
    }
}
