package org.cts.example.dto;

import org.cts.example.sampleEnum.CarType;

/**
 * @author Pradeep Deore
 */
public class PersonDTO {

	private String Name;
	private int numberOfBankAccounts;
	// CarType is Enum Here
	private CarType car;

	/**
	 * 
	 */
	public PersonDTO() {

	}

	/**
	 * @param name
	 * @param numberOfBankAccounts
	 * @param carType
	 */
	public PersonDTO(String name, int numberOfBankAccounts, CarType car) {

		Name = name;
		this.numberOfBankAccounts = numberOfBankAccounts;
		this.car = car;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the numberOfBankAccounts
	 */
	public int getNumberOfBankAccounts() {
		return numberOfBankAccounts;
	}

	/**
	 * @param numberOfBankAccounts
	 *            the numberOfBankAccounts to set
	 */
	public void setNumberOfBankAccounts(int numberOfBankAccounts) {
		this.numberOfBankAccounts = numberOfBankAccounts;
	}

	/**
	 * @return the car
	 */
	public CarType getCar() {
		return car;
	}

	/**
	 * @param car
	 *            the car to set
	 */
	public void setCar(CarType car) {
		this.car = car;
	}

}
