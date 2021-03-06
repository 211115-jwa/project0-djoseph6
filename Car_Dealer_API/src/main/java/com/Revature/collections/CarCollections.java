package com.Revature.collections;

import java.util.HashSet;
import java.util.Set;

import com.Revature.beans.Car;
import com.Revature.data.CarCollectionDAO;

public class CarCollections implements CarCollectionDAO{
	
	Set<Car> carCollection = new HashSet<Car>();
	int currentIndex = 0;
	public static Set<Car> carsToCollect = new HashSet<Car>();
	
	public CarCollections() {
		Car car1 = new Car();
		carCollection.add(car1);
		currentIndex++;
		
	}
	
	public int create(Car carToAddToSet) {
		
		carToAddToSet.setId(currentIndex);
		carCollection.add(carToAddToSet);
		currentIndex++;
		return carToAddToSet.getId();
	}
	@Override
	public Car getById(int id) {
		for (Car car : carCollection) {
			if (car.getId() == id) {
				return car;
			}
		}
		return null;
		
	}
					
	@Override
	public Set<Car> getAll() {
		
		return carCollection;
	}
	@Override
	public void update(Car carToUpdate) {

		Car oldCarFields = getById(carToUpdate.getId());
		if (oldCarFields != null) {
			carCollection.remove(oldCarFields);
			carCollection.add(carToUpdate);
		}
		
	}
	@Override
	public void delete(Car carToDelete) {
		
			Car previousData = getById(carToDelete.getId());
			if (previousData != null) {
				carCollection.remove(previousData);
			}
		}
	@Override
	public Set<Car> getByMake(String make) {
		for (Car car : carCollection)
			if(car.getMake().equals(make)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByModel(String model) {
		for (Car car : carCollection)
			if(car.getModel().equals(model)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByYear(int year) {
		for (Car car : carCollection)
			if(car.getYear() == (year)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByVinNum(String vinNum) {
		for (Car car : carCollection)
			if(car.getVinNum().equals(vinNum)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByColor(String color) {
		for (Car car : carCollection)
			if(car.getColor().equals(color)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByCarType(String carType) {
		for (Car car : carCollection)
			if(car.getCarType().equals(carType)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByCarFuel(String carFuel) {
		for (Car car : carCollection)
			if(car.getCarFuel().equals(carFuel)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
	}	
	@Override	
	public Set<Car> getByDoors(int doors) {
		for (Car car : carCollection)
			if(car.getDoors() ==(doors)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByPrice(int price) {
		for (Car car : carCollection)
			if(car.getPrice() == (price)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByZeroTo60(double zeroTo60) {
		for (Car car : carCollection)
			if(car.getZeroTo60() == (zeroTo60)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByFuelRange(int fuelRange) {
		for (Car car : carCollection)
			if(car.getFuelRange() == (fuelRange)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
	
		return null;
		
	}
	@Override
	public Set<Car> getByEngineType(String engineType) {
		for (Car car : carCollection) {
			if(car.getEngineType().equals(engineType)) {
				carsToCollect.add(car);
				return carsToCollect;
			}
		}
		return null;
		
	}
	
	}


