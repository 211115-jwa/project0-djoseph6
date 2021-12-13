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
	 Car carOutput = cCDao.getByMake(makeInput);
	assertEquals("Unknown", carOutput.getMake());
	}
@Test
public void getByMakeWhenMakeDoesntExists() {
	String makeInput = "BMW";
	 Car carOutput = cCDao.getByMake(makeInput);
	assertNull(carOutput);
	}
@Test
public void getByModelWhenModelExists() {
	String modelInput = "Unknown";
	Car carOutput = cCDao.getByModel(modelInput);
	assertEquals("Unknown", carOutput.getModel());
	}
@Test
public void getByModeleWhenModelDoesntExists() {
	String modelInput = "X5";
	Car carOutput = cCDao.getByModel(modelInput);
	assertNull(carOutput);
	}
@Test
public void getByYearWhenYearExists() {
	int yearInput = 0000;
	Car carOutput = cCDao.getByYear(yearInput);
	assertEquals(0000, carOutput.getYear());
	}
@Test
public void getByYearWhenYearDoesntExists() {
	int yearInput = 0001;
	Car carOutput = cCDao.getByYear(yearInput);
	assertNull(carOutput);
	}
@Test
public void getByVinNumWhenVinExists() {
	String vinInput = "A0000000000000000";
	Car carOuput = cCDao.getByVinNum(vinInput);
	assertEquals("A0000000000000000", carOuput.getVinNum());
	}
@Test
public void getByVinNumWhenVinDoesntExists() {
	String vinInput = "A0000000000000001";
	Car carOuput = cCDao.getByVinNum(vinInput);
	assertNull(carOuput);
	}
@Test
public void getByColorWhenColorExists() {
	String colorInput = "Unknown";
	Car carOuput = cCDao.getByColor(colorInput);
	assertEquals("Unknown", carOuput.getColor());
	}
@Test
public void getByColorWhenColorDoesntExists() {
	String colorInput = "Blue";
	Car carOuput = cCDao.getByColor(colorInput);
	assertNull(carOuput);
	}
@Test 
public void getByCarTypeWhenCarTypeExists() {
		String carTypeInput = "Unknown";
		Car carOutput = cCDao.getByCarType(carTypeInput);
		assertEquals("Unknown", carOutput.getCarType());
	}
@Test 
public void getByCarTypeWhenCarTypeDoesntExists() {
		String carTypeInput = "Sedan";
		Car carOutput = cCDao.getByCarType(carTypeInput);
		assertNull(carOutput);
	}
@Test
public void getByCarFuelWhenCarFuelExists() {
	String carFuel = "Unknown";
	Car carOuput = cCDao.getByCarFuel(carFuel);
	assertEquals("Unknown", carOuput.getCarFuel());
	}
@Test
public void getByCarFuelWhenCarFuelDoesntExists() {
	String carFuel = "Gas";
	Car carOuput = cCDao.getByCarFuel(carFuel);
	assertNull(carOuput);
	}
@Test
public void getByDoorsWhenDoorsExists() {
	int doorInput = 2;
	Car carOuput = cCDao.getByDoors(doorInput);
	assertEquals(2, carOuput.getDoors());
	}
@Test
public void getByDoorsWhenDoorsDoesntExists() {
	int doorInput = 1;
	Car carOuput = cCDao.getByDoors(doorInput);
	assertNull(carOuput);
	}
@Test
public void getByPriceWhenPriceExists() {
	int priceInput = 0;
	Car carOutput = cCDao.getByPrice(priceInput);
	assertEquals(0, carOutput.getPrice());
	}
@Test
public void getByPriceWhenPriceDoesntExists() {
	int priceInput = 1;
	Car carOutput = cCDao.getByPrice(priceInput);
	assertNull(carOutput);
	}
@Test
public void getByZeroTo60WhenZeroTO60Exists() {
	double zeroto60Input = 0.0;
	Car carOuput = cCDao.getByZeroTo60(zeroto60Input);
	assertEquals(0.0, carOuput.getZeroTo60(), 0);
	}

@Test
public void getByZeroTo60WhenZeroTO60DoesntExists() {
	double zeroto60Input = 1;
	Car carOuput = cCDao.getByZeroTo60(zeroto60Input);
	assertNull(carOuput);
	}
@Test
public void getByFuelRangeWhenFuelRangeExists() {
	int fuelInput = 0;
	Car carOuput = cCDao.getByFuelRange(fuelInput);
	assertEquals(0, carOuput.getFuelRange());
	}
@Test
public void getByFuelRangeWhenFuelRangeDoesntExists() {
	int fuelInput = 1;
	Car carOuput = cCDao.getByFuelRange(fuelInput);
	assertNull(carOuput);
	}
@Test
public void getByEngineTypeWhenEngineTypeExists() {
	String engineInput = "Unknown";
	Car carOuput = cCDao.getByEngineType(engineInput);
	assertEquals("Unknown", carOuput.getEngineType());
	}
@Test
public void getByEngineTypeWhenEngineTypeDoesntExists() {
	String engineInput = "I4";
	Car carOuput = cCDao.getByEngineType(engineInput);
	assertNull(carOuput);
	}
}
