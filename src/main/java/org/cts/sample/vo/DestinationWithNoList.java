
package org.cts.sample.vo;

/**
 * @author Pradeep Deore
 * 
 */
public class DestinationWithNoList {

	private Integer myInteger;
	private String myString;

	/**
	 * @return the myInteger
	 */
	public Integer getMyInteger() {
		return myInteger;
	}

	/**
	 * @param myInteger
	 *            the myInteger to set
	 */
	public void setMyInteger(Integer myInteger) {
		this.myInteger = myInteger;
	}

	/**
	 * @return the myString
	 */
	public String getMyString() {
		return myString;
	}

	/**
	 * @param myString
	 *            the myString to set
	 */
	public void setMyString(String myString) {
		this.myString = myString;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DestinationWithNoList [myInteger=" + myInteger + ", myString=" + myString + "]";
	}

}
