package project;

public class linkedItem {
	protected double price;
	protected double quantity;
	protected String name;
	protected product product;
	/**
	 * generate a new LinkedItem
	 * @param product
	 * @param quantity
	 */
	public linkedItem(product product, double quantity){
		this.product = product;
		this.quantity = quantity;
		this.price = product.getPrice()*quantity;
		this.name = product.getName();
	}
	/**
	 * the quantity of this product increase
	 * @param qty
	 */
	public void addQuantity(double qty){
		quantity += qty;
	}
	/**
	 * the quantity of this product decrease
	 * @param qty
	 */
	public void removeQuantity(double qty){
		quantity -= qty;
	}
	
	@Override
	public boolean equals(Object o){
		if(this.product.equals(((product)o))){
			return true;
		}
		else return false;
	}
}
