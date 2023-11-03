package classes;
import java.lang.*;

public class Processor extends ComputerParts{
	
    private int generation;
	
	public Processor(){}
	public Processor(int productSN, String name, double availableQuantity, double price, int generation){
		super(productSN, name, availableQuantity, price);
		this.generation = generation;
	}
	
	public void setGeneration(int pciGeneration){
		this.generation = pciGeneration;
	}
	public int getGeneration(){
		return generation;
	}
	
	public void showInfo(){
		System.out.println("ProductSN : "+getProductSN());
		System.out.println("Name : "+getName());
		System.out.println("Price : "+getPrice());
		System.out.println("Available Quantity : "+getAvailableQuantity());
		System.out.println("Generation : "+getGeneration());
	}
}