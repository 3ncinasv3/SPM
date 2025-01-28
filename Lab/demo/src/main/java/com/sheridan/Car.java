package com.sheridan;

public class Car {
    private String make;
    private String model;
    private String color;
    private String carID;
    private int price;

    public Car(String make, String model, String color, String carID, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.carID = carID;
        this.price = price;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCarID() {
        return carID;
    }
    public void setCarID(String carID) {
        this.carID = carID;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
