package com.carOwnerShip;

public class SportsCar implements Car{

    String carOwnerName;
    Tyre tyre;
    public SportsCar(Tyre tyre){
        this.tyre=tyre;
    }

    @Override
    public void getInfo() {
        System.out.println(carOwnerName+ "Owns the sports car");
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
