package com.Revature.data;

import java.util.Set;

import com.Revature.beans.Car;

public interface CarCollectionDAO extends GenericDAO<Car> {

	public Car getByMake(String make);
	public Car getByModel(String model);
	public Car getByYear(int year);
	public Car getByVinNum(String vinNum);
	public Car getByColor(String color);
	public Car getByCarType(String carType);
	public Car getByCarFuel(String carFuel);
	public Car getByDoors(int doors);
	public Car getByPrice(int price);
	public Car getByZeroTo60(double zeroTo60);
	public Car getByFuelRange(int fuelRange);
	public Car getByEngineType(String engineType);
}
