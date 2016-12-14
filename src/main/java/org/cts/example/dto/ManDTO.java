package org.cts.example.dto;

public class ManDTO {

	private Long numberOfLegs;
	private Long numberOfStomachs;
	/**
	 * @return the numberOfLegs
	 */
	public Long getNumberOfLegs() {
		return numberOfLegs;
	}
	/**
	 * @param numberOfLegs the numberOfLegs to set
	 */
	public void setNumberOfLegs(Long numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	/**
	 * @return the numberOfStomachs
	 */
	public Long getNumberOfStomachs() {
		return numberOfStomachs;
	}
	/**
	 * @param numberOfStomachs the numberOfStomachs to set
	 */
	public void setNumberOfStomachs(Long numberOfStomachs) {
		this.numberOfStomachs = numberOfStomachs;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ManDTO [numberOfLegs=" + numberOfLegs + ", numberOfStomachs=" + numberOfStomachs + "]";
	}
	
	

}
