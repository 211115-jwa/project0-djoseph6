package com.Revature.data;

import java.util.Set;

import com.Revature.beans.Car;

public interface CarCollectionDAO extends GenericDAO<Car> {

	public Set <Car> getByMake(String make);
	public Set <Car> getByModel(String model);
	public Set <Car> getByYear(int year);
	public Set <Car> getByVinNum(String vinNum);
	public Set <Car> getByColor(String color);
	public Set <Car> getByCarType(String carType);
	public Set <Car> getByCarFuel(String carFuel);
	public Set <Car> getByDoors(int doors);
	public Set <Car> getByPrice(int price);
	public Set <Car> getByZeroTo60(double zeroTo60);
	public Set <Car> getByFuelRange(int fuelRange);
	public Set <Car> getByEngineType(String engineType);
}
