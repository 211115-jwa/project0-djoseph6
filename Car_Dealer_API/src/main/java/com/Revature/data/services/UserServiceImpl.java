package com.Revature.data.services;

import java.util.Set;

import com.Revature.beans.Car;
import com.Revature.data.CarCollectionDAO;
import com.Revature.data.postgres.CarPostgres;
import com.Revature.services.UserSevice;

public class UserServiceImpl implements UserSevice{
private CarCollectionDAO cCDao = new CarPostgres();
	
	@Override
	public Set<Car> viewAllAvailableCars() {
		return cCDao.getAll();
	}

	@Override
	public void addNewCar(Car carToAdd) {
		 cCDao.create(carToAdd);
		System.out.println("UserNewCar has been added.");
	}

	@Override
	public Car updateCarById(Car updatedCar, int id) {
		if (updatedCar != null && updatedCar.getId() == id) {
		cCDao.update(updatedCar);
		System.out.println("The car has been updated");
		}
		return updatedCar;
		
		//add else statement with exception
	}

	@Override
	public Car viewCarById(int id) {
		Car carInDBToView = cCDao.getById(id);
		//if (carInDBToView.equals(null))	
		return carInDBToView;	
	}

	@Override
	public Set<Car> viewAllCarsByMake(String make) {
	
		return cCDao.getByMake(make);
	}

	@Override
	public Set<Car> viewAllCarsByModel(String model) {
		
		return cCDao.getByModel(model);
	}

}
