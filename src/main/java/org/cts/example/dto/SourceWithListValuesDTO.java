package org.cts.example.dto;

import java.util.List;

/**
 *
 * @author Pradeep Deore
 */
public class SourceWithListValuesDTO {

	private List<Integer> myIntegers;
	private List<String> myStrings;

	/**
	 * @return the myIntegers
	 */
	public List<Integer> getMyIntegers() {
		return myIntegers;
	}

	/**
	 * @param myIntegers
	 *            the myIntegers to set
	 */
	public void setMyIntegers(List<Integer> myIntegers) {
		this.myIntegers = myIntegers;
	}

	/**
	 * @return the myStrings
	 */
	public List<String> getMyStrings() {
		return myStrings;
	}

	/**
	 * @param myStrings
	 *            the myStrings to set
	 */
	public void setMyStrings(List<String> myStrings) {
		this.myStrings = myStrings;
	}

}
