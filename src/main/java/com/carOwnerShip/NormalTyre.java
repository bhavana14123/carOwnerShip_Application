package com.carOwnerShip;

public class NormalTyre implements Tyre{

    @Override
    public void getInfo() {
        System.out.println("This is the Normal tyre");
    }

    @Override
    public String tyreType() {
        return "Normal Tyre";
    }
}
