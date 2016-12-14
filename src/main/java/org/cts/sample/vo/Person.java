package org.cts.sample.vo;

/**
 * @author Pradeep Deore
 */

public class Person {

	private String Name;
	private int numberOfBankAccounts;
	private String car;

	/**
	 * 
	 */
	public Person() {

	}

	/**
	 * @param name
	 * @param numberOfBankAccounts
	 * @param car
	 * 
	 */
	public Person(String name, int numberOfBankAccounts, String car) {
		super();
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
	public String getCar() {
		return car;
	}

	/**
	 * @param car
	 *            the car to set
	 */
	public void setCar(String car) {
		this.car = car;
	}

}
