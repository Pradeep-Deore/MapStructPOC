
package org.cts.example.dto;

import java.util.List;

/**
 * @author Pradeep Deore
 */
public class CustomerDto {

    private Long customerNumber;
    private String customerName;
    private List<OrderedItemDto> orders;
	
    
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
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the orders
	 */
	public List<OrderedItemDto> getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<OrderedItemDto> orders) {
		this.orders = orders;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerDto [customerNumber=" + customerNumber + ", customerName=" + customerName + ", orders=" + orders + "]";
	}
    
    
    
}
