package org.cts.sample.vo;

import java.math.BigDecimal;

/**
 * @author Pradeep Deore (438423)
 * @Date 12/3/2016 Source file a sample example to understand the concept and
 *       Implementation of mapStruct Easily
 */

public class SourceFile {

	private BigDecimal bigDecimal2;

	private BigDecimal bigDecimal3;

	private BigDecimal bigDecimal2UnConstrained;

	/**
	 * @return the bigDecimal2
	 */
	public BigDecimal getBigDecimal2() {
		return bigDecimal2;
	}

	/**
	 * @param bigDecimal2 the bigDecimal2 to set
	 */
	public void setBigDecimal2(BigDecimal bigDecimal2) {
		this.bigDecimal2 = bigDecimal2;
	}

	/**
	 * @return the bigDecimal3
	 */
	public BigDecimal getBigDecimal3() {
		return bigDecimal3;
	}

	/**
	 * @param bigDecimal3 the bigDecimal3 to set
	 */
	public void setBigDecimal3(BigDecimal bigDecimal3) {
		this.bigDecimal3 = bigDecimal3;
	}

	/**
	 * @return the bigDecimal2UnConstrained
	 */
	public BigDecimal getBigDecimal2UnConstrained() {
		return bigDecimal2UnConstrained;
	}

	/**
	 * @param bigDecimal2UnConstrained the bigDecimal2UnConstrained to set
	 */
	public void setBigDecimal2UnConstrained(BigDecimal bigDecimal2UnConstrained) {
		this.bigDecimal2UnConstrained = bigDecimal2UnConstrained;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Source [bigDecimal2=" + bigDecimal2 + ", bigDecimal3=" + bigDecimal3 + ", bigDecimal2UnConstrained="
				+ bigDecimal2UnConstrained + "]";
	}

	

}
