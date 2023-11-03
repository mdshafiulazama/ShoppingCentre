package classes;
import java.lang.*;

public class Motherboard extends ComputerParts{

    private String chipsetType;
	
	public Motherboard(){}
	public Motherboard(int productSN, String name, double availableQuantity, double price, String chipsetType){
		
		super(productSN, name, availableQuantity, price);
		this.chipsetType = chipsetType;
	}

    public void setChipsetType(String chipsetType)
    {
        this.chipsetType = chipsetType;
    }
    public String getChipsetType()
    {
        return chipsetType;
    }
	
	public void showInfo(){
		
		System.out.println("Name : "+getName());
		System.out.println("ProductSN : "+getProductSN());
		System.out.println("Chipset Type : "+getChipsetType());
		System.out.println("Price : "+getPrice());
		System.out.println("Available Quantity : "+getAvailableQuantity());
	}
}