package classes;
import java.lang.*;
import interfaces.ComputerPartsOperations;

public abstract class ComputerParts implements ComputerPartsOperations{
	
	private int productSN;
	private String name;
	private double availableQuantity;
	private double price;	
	
	public ComputerParts(){}
	public ComputerParts(int productSN, String name, double availableQuantity, double price){
		this.productSN = productSN;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;
	}

	public void setProductSN(int productSN){
		this.productSN = productSN;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setAvailableQuanity(double availableQuantity){
		this.availableQuantity = availableQuantity;
	}
	
	public int getProductSN(){
		return this.productSN;
	}
	
	public String getName(){
		return this.name;
	}
	public double getPrice(){
		return this.price;
	}
	public double getAvailableQuantity(){
		return this.availableQuantity;
	}
	
	public abstract void showInfo();
	
	public boolean addQuantity(int amount){
		
		boolean flag = false;
		if (availableQuantity>0) {
			availableQuantity = availableQuantity + amount;
			System.out.println("Product Added = " + amount);
			flag = true;
		}
		return flag;
	}

	public boolean sellQuantity(int amount){
		boolean flag = false;
		if (availableQuantity>0 && amount<=availableQuantity){
			availableQuantity = availableQuantity - amount;
			System.out.println("Product Sold = " + amount);
			flag = true;
		}
		return flag;
	}
}