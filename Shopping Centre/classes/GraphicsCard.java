package classes;
import java.lang.*;

public class GraphicsCard extends ComputerParts{
	
    private String vram;
	
	public GraphicsCard(){}
	public GraphicsCard(int productSN, String name, double availableQuantity, double price, String vram){
		super(productSN, name, availableQuantity, price);
		this.vram = vram;
	}

    public void setVram(String Vram)
    {
        this.vram = Vram;
    }
    public String getVram()
    {
        return vram;
    }
	
	public void showInfo(){
		System.out.println("ProductSN : "+getProductSN());
		System.out.println("Name : "+getName());
		System.out.println("Price : "+getPrice());
		System.out.println("Available Quantity : "+getAvailableQuantity());
		System.out.println("VRAM : "+getVram());
	}
}