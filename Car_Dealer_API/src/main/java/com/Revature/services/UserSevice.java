package com.Revature.services;

import java.util.Set;

import com.Revature.beans.Car;

public interface UserSevice {
Set <Car> viewAllAvailableCars();
public void addNewCar(Car carToAdd);
public Car updateCarById(Car updatedCar, int id);
public Car viewCarById(int id);
Set <Car> viewAllCarsByMake(String make);
Set <Car> viewAllCarsByModel(String model);
}
