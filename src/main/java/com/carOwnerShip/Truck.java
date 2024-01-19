package com.carOwnerShip;

public class Truck implements Car {
    String carOwnerName;
    Tyre tyre;
    public Truck(Tyre tyre){
        this.tyre=tyre;
    }
    @Override
    public void getInfo() {
        System.out.println(carOwnerName+" owns a truck");
        tyre.getInfo();

    }

    @Override
    public void setOwnerName(String name) {
        this.carOwnerName=name;

    }

    @Override
    public String getOwnerName() {
        return carOwnerName;
    }
}
