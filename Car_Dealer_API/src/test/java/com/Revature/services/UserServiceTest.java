package com.Revature.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Revature.beans.Car;

import com.Revature.data.CarCollectionDAO;
import com.Revature.data.postgres.CarPostgres;
import com.Revature.data.services.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private CarCollectionDAO cCDAO = new CarPostgres();
//overriding dao 

	private static Set<Car> mockCarCollection;
	private static Set<Car> mockEmptyCarCollection;

	@InjectMocks
	private UserSevice userServ = new UserServiceImpl();

	@BeforeAll
	public static void mockCarCollectionSetup() {
		mockCarCollection = new HashSet<Car>();
		mockEmptyCarCollection = new HashSet<Car>();

		for (int a = 0; a < 5; a++) {
			Car car = new Car();
			car.setId(a);
			if (a < 3) {
				car.setMake("BMW");
				mockCarCollection.add(car);
			}

			if (a < 2) {
				car.setModel("X5");
				mockCarCollection.add(car);
			} else {
				mockCarCollection.add(car);
			}
		}

	}
	

	@Test
	public void viewAllCarsWhenCarsNotNullTest() {

		when(cCDAO.getAll()).thenReturn(mockCarCollection);
		Set<Car> allCars = userServ.viewAllAvailableCars();
		
		assertNotNull(allCars);
	}
	
	@Test
	public void viewAllCarsWhenCarsAreNullTest() {
		Set<Car> setInput = new HashSet <Car>();
		Car carInput = new Car();
		setInput.add(carInput);
		when(cCDAO.getAll()).thenReturn(mockEmptyCarCollection);
		Set<Car> allCars = userServ.viewAllAvailableCars();
		
		assertNotEquals(allCars, setInput); //
	}

	@Test
	public void addNewCarTest() {
		Car carInput = new Car();
		carInput.setId(4);
		when(cCDAO.create(carInput)).thenReturn(5);
		userServ.addNewCar(carInput);
		mockCarCollection.add(carInput);
		
		assertEquals(carInput.getId() == 4, mockCarCollection.contains(carInput));
	}
	@Test
	public void updateByCarIdWhenIdExists() {
		Car carInput = new Car();
		int carIdInput = 7;
		//doNothing().when(cCDAO).update(Mockito.any(Car.class));
		Car carOuput = userServ.updateCarById(carInput, carIdInput);
		assertEquals(carInput, carOuput);

	}

	@Test
	public void viewCarByIdWhenCarExistsTest() {
		Car carInput = new Car();
		int intInput = 2;
		when(cCDAO.getById(intInput)).thenReturn(carInput);
		Car carOuput = userServ.viewCarById(intInput);
		
		assertEquals(carInput, carOuput);
	}

	@Test
	public void viewCarByIdWhenCarIsNullTest() {
		Car carInput = null;
		int intInput = 2;
		when(cCDAO.getById(intInput)).thenReturn(carInput);
		Car carOuput = userServ.viewCarById(intInput);
		
		assertNull(carOuput);
	}
	
	@Test
	public void viewAllCarsByMakeWhenMakeIsValidTest() {
		String make = "BMW";
		Set<Car> carsByMakeBMW = new HashSet<Car>();  //creating set for BMW Models
		for(Car carInput: mockCarCollection) {
			if(carInput.getMake().equals(make)) {
				carsByMakeBMW.add(carInput);
				}
			}
		when(cCDAO.getByMake(make)).thenReturn(carsByMakeBMW);
		Set<Car> carOuput = userServ.viewAllCarsByMake(make);
		
		assertEquals(carOuput, carsByMakeBMW);
	}
	@Test
	public void viewAllCarsByMakeWhenMakeIsInvalidTest() {
		String make = "Dodge";
		Set<Car> carsByMakeDodge = new HashSet<Car>();  //creating set for BMW Models
		for(Car carInput: mockCarCollection) {
			if(carInput.getMake().equals(make)) {
				carsByMakeDodge.add(carInput);
				}
			}
		when(cCDAO.getByMake(make)).thenReturn(carsByMakeDodge);
		Set<Car> carOuput = userServ.viewAllCarsByMake(make);
		
		assertTrue(carOuput.isEmpty());
	}
	@Test
	public void viewAllCarsByModeleWhenModelIsValidTest() {
		String model = "X5";
		Set<Car> carsByModelX5 = new HashSet<Car>();  //creating set for BMW Models
		for(Car carInput: mockCarCollection) {
			if(carInput.getModel().equals(model)) {
				carsByModelX5.add(carInput);
				}
			}
		when(cCDAO.getByMake(model)).thenReturn(carsByModelX5);
		Set<Car> carOuput = userServ.viewAllCarsByMake(model);
		
		assertEquals(carOuput, carsByModelX5);	
	}
	@Test
	public void viewAllCarsByModelWhenModelIsInvalidTest() {
		String model = "Durango";
		Set<Car> carsByModelDurango = new HashSet<Car>();  //creating set for BMW Models
		for(Car carInput: mockCarCollection) {
			if(carInput.getModel().equals(model)) {
				carsByModelDurango.add(carInput);
				}
			}
		when(cCDAO.getByMake(model)).thenReturn(carsByModelDurango);
		Set<Car> carOuput = userServ.viewAllCarsByMake(model);
		
		assertTrue(carOuput.isEmpty());
	}
	
}
