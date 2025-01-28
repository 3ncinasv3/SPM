package com.sheridan;
import java.util.ArrayList;

public class CarHelper {

    public ArrayList<Car> cars = new ArrayList<Car>();

    public void addCarToInventory(Car car) {
            if (car != null && cars.contains(car) == false) {
                cars.add(car);
            }
    }

    public void removeCarFromInventory(Car car) {
        if (car != null && cars.contains(car)) {
            cars.remove(car);
        }
    }
}
