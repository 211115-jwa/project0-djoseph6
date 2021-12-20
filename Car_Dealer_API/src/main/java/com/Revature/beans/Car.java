package com.Revature.beans;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private String vinNum;
	private String color;
	private String carType;
	private String carFuel;
	private String engineType;
	private int doors;
	private int id;
	private int price;
	private double zeroTo60;
	private int fuelRange;
	
	
	public Car() {
		
		id = 0;
		color = "Unknown";
		year = 0000;
		make = "Unknown";
		model = "Unknown";
		vinNum = "A0000000000000000";
		carType = "Unknown";
		carFuel = "Unknown";
		engineType = "Unknown";
		doors = 2;
		fuelRange = 0;	
		zeroTo60 = 0;
		price = 0;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVinNum() {
		return vinNum;
	}

	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarFuel() {
		return carFuel;
	}

	public void setCarFuel(String carFuel) {
		this.carFuel = carFuel;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public int getFuelRange() {
		return fuelRange;
	}

	public void setFuelRange(int fuelRange) {
		this.fuelRange = fuelRange;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carFuel == null) ? 0 : carFuel.hashCode());
		result = prime * result + ((carType == null) ? 0 : carType.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + doors;
		result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
		result = prime * result + fuelRange;
		result = prime * result + id;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + ((vinNum == null) ? 0 : vinNum.hashCode());
		result = prime * result + year;
		long temp;
		temp = Double.doubleToLongBits(zeroTo60);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carFuel == null) {
			if (other.carFuel != null)
				return false;
		} else if (!carFuel.equals(other.carFuel))
			return false;
		if (carType == null) {
			if (other.carType != null)
				return false;
		} else if (!carType.equals(other.carType))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (doors != other.doors)
			return false;
		if (engineType == null) {
			if (other.engineType != null)
				return false;
		} else if (!engineType.equals(other.engineType))
			return false;
		if (fuelRange != other.fuelRange)
			return false;
		if (id != other.id)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (vinNum == null) {
			if (other.vinNum != null)
				return false;
		} else if (!vinNum.equals(other.vinNum))
			return false;
		if (year != other.year)
			return false;
		if (Double.doubleToLongBits(zeroTo60) != Double.doubleToLongBits(other.zeroTo60))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  "Car " +id+ ": " +color+ " " +year+ " " +make+ " " +model;
	}
	
	
}
