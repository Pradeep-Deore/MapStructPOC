package org.cts.example.dto;

/**
 * @author Pradeep Deore
 */
public class OrderedItemDto {

    public String name;
    public Long quantity;
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
	 * @return the quantity
	 */
	public Long getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderedItemDto [name=" + name + ", quantity=" + quantity + "]";
	}
    
    
}
