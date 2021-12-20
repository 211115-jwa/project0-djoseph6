package com.Revature.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

import com.Revature.beans.Car;
import com.Revature.collections.CarCollections;


public class CarCollectionDAOTest {

private CarCollectionDAO cCDao = new CarCollections();
@Test
public void createTest1() {
	Car carInput = new Car();
	int createOutput = cCDao.create(carInput);
	assertNotEquals(0, createOutput);
	// checks to see if when adding car to collection, car is added in the right index
	}
@Test
public void createTest2() {
	Car carInput = new Car();
	int createOutput = cCDao.create(carInput);
	assertEquals(1, createOutput);
	// use person dao to test that create method is not null
}

@Test
public void getByIDWhenIdExists() {
	int idInput = 0;
	Car carOutput = cCDao.getById(idInput);
	assertEquals(0, carOutput.getId());
	}
@Test
public void getByIDWhenIdDoesntExists() {
	int idInput = 1;
	Car carOutput = cCDao.getById(idInput);
	assertNull(carOutput);
	}
@Test
public void getAllTest() {
	CarCollections cCInput = new CarCollections();
	assertNotEquals(cCInput, cCDao.getAll());
	}
@Test
public void getByMakeWhenMakeExists() {
	String makeInput = "Unknown";
	 Set<Car> carOutput = cCDao.getByMake(makeInput);
	 assertNotNull(carOutput);
	}
@Test
public void getByMakeWhenMakeDoesntExists() {
	String makeInput = "BMW";
	 Set<Car> carOutput = cCDao.getByMake(makeInput);
	assertNull(carOutput);
	}
@Test
public void getByModelWhenModelExists() {
	String modelInput = "Unknown";
	Set<Car> carOutput = cCDao.getByModel(modelInput);
	assertNotNull(carOutput);
	}
@Test
public void getByModeleWhenModelDoesntExists() {
	String modelInput = "X5";
	Set<Car> carOutput = cCDao.getByModel(modelInput);
	assertNull(carOutput);
	}
@Test
public void getByYearWhenYearExists() {
	int yearInput = 0000;
	Set<Car> carOutput = cCDao.getByYear(yearInput);
	assertNotNull(carOutput);
	}
@Test
public void getByYearWhenYearDoesntExists() {
	int yearInput = 0001;
	Set<Car> carOutput = cCDao.getByYear(yearInput);
	assertNull(carOutput);
	}
@Test
public void getByVinNumWhenVinExists() {
	String vinInput = "A0000000000000000";
	Set<Car> carOutput = cCDao.getByVinNum(vinInput);
	assertNotNull(carOutput);
	}
@Test
public void getByVinNumWhenVinDoesntExists() {
	String vinInput = "A0000000000000001";
	Set<Car> carOuput = cCDao.getByVinNum(vinInput);
	assertNull(carOuput);
	}
@Test
public void getByColorWhenColorExists() {
	String colorInput = "Unknown";
	Set<Car> carOutput = cCDao.getByColor(colorInput);
	assertNotNull(carOutput);
	}
@Test
public void getByColorWhenColorDoesntExists() {
	String colorInput = "Blue";
	Set<Car> carOutput = cCDao.getByColor(colorInput);
	assertNull(carOutput);
	}
@Test 
public void getByCarTypeWhenCarTypeExists() {
		String carTypeInput = "Unknown";
		Set<Car> carOutput = cCDao.getByCarType(carTypeInput);
		assertNotNull(carOutput);
	}
@Test 
public void getByCarTypeWhenCarTypeDoesntExists() {
		String carTypeInput = "Sedan";
		Set<Car> carOutput = cCDao.getByCarType(carTypeInput);
		assertNull(carOutput);
	}
@Test
public void getByCarFuelWhenCarFuelExists() {
	String carFuel = "Unknown";
	Set<Car> carOutput = cCDao.getByCarFuel(carFuel);
	assertNotNull(carOutput);
	}
@Test
public void getByCarFuelWhenCarFuelDoesntExists() {
	String carFuel = "Gas";
	Set<Car> carOutput = cCDao.getByCarFuel(carFuel);
	assertNull(carOutput);
	}
@Test
public void getByDoorsWhenDoorsExists() {
	int doorInput = 2;
	Set<Car> carOutput = cCDao.getByDoors(doorInput);
	assertNotNull(carOutput);
	}
@Test
public void getByDoorsWhenDoorsDoesntExists() {
	int doorInput = 1;
	Set<Car> carOutput = cCDao.getByDoors(doorInput);
	assertNull(carOutput);
	}
@Test
public void getByPriceWhenPriceExists() {
	int priceInput = 0;
	Set<Car> carOutput = cCDao.getByPrice(priceInput);
	assertNotNull(carOutput);
	}
@Test
public void getByPriceWhenPriceDoesntExists() {
	int priceInput = 1;
	Set<Car> carOutput = cCDao.getByPrice(priceInput);
	assertNull(carOutput);
	}
@Test
public void getByZeroTo60WhenZeroTO60Exists() {
	double zeroto60Input = 0.0;
	Set<Car> carOutput = cCDao.getByZeroTo60(zeroto60Input);
	assertNotNull(carOutput);
	}

@Test
public void getByZeroTo60WhenZeroTO60DoesntExists() {
	double zeroto60Input = 1;
	Set<Car> carOutput = cCDao.getByZeroTo60(zeroto60Input);
	assertNull(carOutput);
	}
@Test
public void getByFuelRangeWhenFuelRangeExists() {
	int fuelInput = 0;
	Set<Car> carOutput = cCDao.getByFuelRange(fuelInput);
	assertNotNull(carOutput);
	}
@Test
public void getByFuelRangeWhenFuelRangeDoesntExists() {
	int fuelInput = 1;
	Set<Car> carOutput = cCDao.getByFuelRange(fuelInput);
	assertNull(carOutput);
	}
@Test
public void getByEngineTypeWhenEngineTypeExists() {
	String engineInput = "Unknown";
	Set<Car> carOutput = cCDao.getByEngineType(engineInput);
	assertNotNull(carOutput);
	}
@Test
public void getByEngineTypeWhenEngineTypeDoesntExists() {
	String engineInput = "I4";
	Set<Car> carOuput = cCDao.getByEngineType(engineInput);
	assertNull(carOuput);
	}
}
