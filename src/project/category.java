package project;

import java.util.ArrayList;
import java.util.List;

public class category {
	private String name;
	private String description;
	public int code;
	private List<product> items; 
	/**
	 * generate a new category
	 * @param name
	 * @param description
	 * @param code
	 */
	public category(String name, String description, int code){
		this.name = name;
		this.description = description;
		this.code = code;
		this.items = new ArrayList<product>();
	}
	/**
	 * add a product into this category
	 * @param product
	 */
	public void addProduct(product product){
		items.add(product);
	}
	/**
	 * remove the product into this category
	 * @param product
	 */
	public void removeProduct(product product){
		items.add(product);
	}
	/**
	 * change the description of this category
	 * @param newName
	 */
	public void changeName(String newName){
		name = newName;
	}
	/**
	 * change the code of this category
	 * @param text
	 */
	public void changeDesctiption(String text){
		description = text;
	}
	
	public void changeCode(int newCode){
		code = newCode;
	}
}

	