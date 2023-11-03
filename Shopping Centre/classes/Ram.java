package classes;
import java.lang.*;

public class Ram extends ComputerParts{

    private int busSpeed;
	
	public Ram(){}
	public Ram(int productSN, String name, double availableQuantity, double price, int busSpeed){
		super(productSN, name, availableQuantity, price);
		this.busSpeed = busSpeed;
	}

    public void setBusSpeed(int busSpeed)
    {
        this.busSpeed = busSpeed;
    }
    public int getBusSpeed()
    {
        return busSpeed;
    }
	
	public void showInfo(){
		System.out.println("ProductSN : "+getProductSN());
		System.out.println("Name : "+getName());
		System.out.println("Price : "+getPrice());
		System.out.println("Available Quantity : "+getAvailableQuantity());
		System.out.println("Bus Speed : "+getBusSpeed());
	}
}