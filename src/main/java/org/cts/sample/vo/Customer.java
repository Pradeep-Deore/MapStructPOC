
package org.cts.sample.vo;

import java.util.Collection;

/**
 * @author Pradeep Deore
 */
public class Customer {

    private Long customerNumber;
    private String name;
    private Collection<OrderedItem> orderItems;
	
    /**
	 * @return the customerNumber
	 */
	public Long getCustomerNumber() {
		return customerNumber;
	}
	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the orderItems
	 */
	public Collection<OrderedItem> getOrderItems() {
		return orderItems;
	}
	/**
	 * @param orderItems the orderItems to set
	 */
	public void setOrderItems(Collection<OrderedItem> orderItems) {
		this.orderItems = orderItems;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", name=" + name + ", orderItems=" + orderItems + "]";
	}

    
}
