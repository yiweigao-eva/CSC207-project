package project;

public class product {
	private String name;
	private double price;
	private String description;
	private category category;
	private double quantity;
	private String imagePath;

	
	public product(String name, double price, double quantity){
		this.name = name;
		this.price = price;
		this.description = "";
		this.imagePath = "";
		this.quantity = quantity;
		this.category = null;
	}
	
	/**
	 * genterate a new product
	 * @param name
	 * @param price
	 * @param description
	 * @param image
	 * @param quantity
	 * @param cag
	 */
	public product(String name, double price, String description, String image, double quantity, category cag){
		this.name = name;
		this.price = price;
		this.description = description;
		this.imagePath = image;
		this.quantity = quantity;
		this.category = cag;
	}
	/**
	 * change the price of the product
	 * @param newPrice
	 * @param userState
	 */
	public void changePrice(double newPrice, String userState){
		if(userState == "Adminstor"){
			price = newPrice;
		}
		else{
			Exception e = new AccessDenied("You don't have access to this action, please login or login as an adminstor");
		}
	}
	
	/**
	 * change the name of product
	 * @param newName
	 * @param userState
	 */
	public void changeName(String newName, String userState){
		if(userState == "Adminstor"){
			name = newName;
		}
		else{
			Exception e = new AccessDenied("You don't have access to this action, please login or login as an adminstor");
		}
	}
	
	/**
	 * change the name of product
	 * @param text
	 * @param userState
	 */
	public void changeDescription(String text, String userState){
		if(userState == "Adminstor"){
			description = text;
		}
		else{
			Exception e = new AccessDenied("You don't have access to this action, please login or login as an adminstor");
		}
	}
	/**
	 * change the category of product
	 * @param newCate
	 * @param userState
	 */
	public void changeCategory(category newCate, String userState){
		if(userState == "Adminstor"){
			category = newCate;
		}
		else{
			Exception e = new AccessDenied("You don't have access to this action, please login or login as an adminstor");
			
		}
		
	}
	/**
	 * change the quantity of product
	 * @param newQuantity
	 * @param userState
	 */
	public void changeQuantity(double newQuantity, String userState){
		System.out.println(userState == "Adminstor");
		if(userState == "Adminstor"){
			System.out.println("should not");
			quantity = newQuantity;
		}
		else{
			System.out.println("yes");
			throw new AccessDenied("You don't have access to this action, please login or login as an adminstor");
		}
		
	}
	/**
	 * change the Image Path of product
	 * @param path
	 * @param userState
	 */
	public void changeImage(String path, String userState){
		if(userState == "Adminstor"){
			imagePath = path;
		}
		else{
			Exception e = new AccessDenied("You don't have access to this action, please login or login as an adminstor");
		}
		
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}
}
