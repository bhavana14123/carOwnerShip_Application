package com.carOwnerShip;

public class NormalCar implements Car{

    String carOwnerName;
    Tyre tyre;
    public NormalCar(Tyre tyre){
        this.tyre=tyre;

    }
    @Override
    public void getInfo() {
        System.out.println(carOwnerName+" owns a normal car");
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
