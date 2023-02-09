package com.directi.training.srp.exercice_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private static final CarRepository carRepository= new CarRepository();

    public com.directi.training.srp.exercise.Car getBestCar()
    {
        List<Car> _carsDb = this.carRepository.get_carsDb();
        com.directi.training.srp.exercise.Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
