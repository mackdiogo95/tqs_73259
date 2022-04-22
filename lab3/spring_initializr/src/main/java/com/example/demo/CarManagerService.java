package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class CarManagerService implements CarRepository{

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car findByCarId(Long carId) {
        return null;
    }


    @Override
    public List<Car> findAll() {
        return null;
    }


}
