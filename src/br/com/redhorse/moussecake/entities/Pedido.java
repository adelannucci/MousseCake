/**
 * 
 */
package br.com.redhorse.moussecake.entities;

/**
 * @author andreluizvannucci
 *
 */
public class Pedido {
	
	private String item;
	private boolean status;
	
	
	
	/**
	 * @param item
	 * @param status
	 */
	public Pedido(String item, boolean status) {
		super();
		this.item = item;
		this.status = status;
	}
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
}
