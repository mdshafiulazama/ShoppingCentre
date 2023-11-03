package classes;
import java.lang.*;

public class SSD extends ComputerParts{

    private int pciGeneration;
	
	public SSD(){}
	public SSD(int productSN, String name, double availableQuantity, double price, int pciGeneration){
		
		super(productSN, name, availableQuantity, price);
		this.pciGeneration = pciGeneration;
	}

    public void setPciGeneration(int pciGeneration)
    {
        this.pciGeneration = pciGeneration;
    }
    
    public int getPciGeneration()
    {
        return pciGeneration;
    }
	
	public void showInfo(){
		System.out.println("ProductSN : "+getProductSN());
		System.out.println("Name : "+getName());
		System.out.println("Price : "+getPrice());
		System.out.println("Available Quantity : "+getAvailableQuantity());
		System.out.println("PciGeneration : "+getPciGeneration());
	}
}