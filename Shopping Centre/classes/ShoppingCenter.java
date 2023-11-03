package classes;
import java.lang.*;
import interfaces.*;

public class ShoppingCenter implements ShoppingCenterParkingAreaOperations, ShoppingCenterShopOperations{
	private Shop shops[] = new Shop [500];
	private ParkingArea parkingAreas[] = new ParkingArea [50];

	public boolean insertShop(Shop s){
		boolean flag = false;
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == null)
			{
				shops[i] = s;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeShop(Shop s)
	{
		boolean flag = false;
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == s)
			{
				shops[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Shop searchShop(int shopNumber)
	{
		Shop s = null;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] != null)
			{
				if(shops[i].getShopNumber() == shopNumber)
				{
					s = shops[i];
					break;
				}
			}
		}
		return s;
	}

	public void showAllShops()
	{	
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] != null)
			{
				System.out.println("___________________________________________");
				shops[i].showDetails();
				shops[i].showAllComputerParts();
				System.out.println();
			}
		}
	}

	public boolean inseretParkingArea(ParkingArea pa){
		boolean flag = false;
		for(int i=0; i<parkingAreas.length; i++)
		{
			if(parkingAreas[i] == null)
			{
				parkingAreas[i] = pa;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeParkingArea(ParkingArea pa){
		boolean flag = false;
		for(int i=0; i<parkingAreas.length; i++)
		{
			if(parkingAreas[i] == pa)
			{
				parkingAreas[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public ParkingArea searchParkingArea(String areaNo){
		
		ParkingArea pa = null;		
		for(int i=0; i<parkingAreas.length; i++)
		{
			if(parkingAreas[i] != null)
			{
				if(parkingAreas[i].getAreaNo().equals(areaNo))
				{
					pa = parkingAreas[i];
					break;
				}
			}
		}
		return pa;
	}

	public void showAllParkingAreas(){

		System.out.println("___________________________________________");
		
		for(int i=0; i<parkingAreas.length; i++)
		{
			if(parkingAreas[i] != null)
			{
				System.out.println("Parking Area No: " + parkingAreas[i].getAreaNo());
				System.out.println("Parking Area Available Slots: " + parkingAreas[i].getAvailableSlots());
				System.out.println();
			}
		}
	}
}