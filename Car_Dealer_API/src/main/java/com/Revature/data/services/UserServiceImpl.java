package com.Revature.data.services;

import java.util.Set;

import com.Revature.beans.Car;
import com.Revature.data.CarCollectionDAO;
import com.Revature.services.UserSevice;

public class UserServiceImpl implements UserSevice{
private CarCollectionDAO cCDao;
	
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
		
		
		return null;
	}

	@Override
	public Set<Car> viewAllCarsByModel(String model) {
		// TODO Auto-generated method stub
		return null;
	}

}
