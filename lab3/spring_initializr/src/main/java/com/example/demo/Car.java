package com.example.demo;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;

    private String maker;
    private String model;

    public Car () {}

    public Car(String maker, String model) {
        this.maker = maker;
        this.model = model;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carId.equals(car.carId) && Objects.equals(maker, car.maker) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, maker, model);
    }

    public void setCarId(Long carId) { this.carId = carId; }

    public void setMaker(String maker) { this.maker = maker; }

    public void setModel(String model)  { this.model = model; }

    public Long getCarId() { return carId; }

    public String getMaker() { return maker; }

    public String getModel() { return model; }


    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
