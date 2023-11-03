package classes;

import java.lang.*;
import interfaces.ShopOperations;


public class Shop implements ShopOperations
{
	private String name;
	private int shopNumber;
	private ComputerParts computerParts[] = new ComputerParts[200];
		
	public Shop()
	{
		System.out.println("Default Called");
	}
	public Shop(String name, int shopNumber)
	{
		this.name = name;
		this.shopNumber = shopNumber;
	}
	
	public void setName(String name){this.name = name;}
	public void setShopNumber(int shopNumber){this.shopNumber = shopNumber;}
	
	public String getName(){return name;}
	public int getShopNumber(){return shopNumber;}
	
	public void showDetails()
	{
		System.out.println();
		System.out.println("Shop Name: " + name);
		System.out.println("Shop Number: " + shopNumber);
		System.out.println();
	}
	
	public boolean insertComputerParts(ComputerParts cp)
	{
		boolean flag = false;
		for(int i=0; i<computerParts.length; i++)
		{
			if(computerParts[i] == null)
			{
				computerParts[i] = cp;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeComputerParts(ComputerParts cp)
	{
		boolean flag = false;
		for(int i=0; i<computerParts.length; i++)
		{
			if(computerParts[i] == cp)
			{
				computerParts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;	
	}
	public void showAllComputerParts()
	{
		System.out.println("___________________________________________");
		for(int i=0; i<computerParts.length; i++)
		{
			if(computerParts[i] != null)
			{
				computerParts[i].showInfo();
				System.out.println();
			}
		}
	}
	public ComputerParts searchComputerParts(int productSN)
	{
		ComputerParts cp = null;
		for(int i = 0; i<computerParts.length; i++)
		{
			if(computerParts[i] != null)
			{
				if(computerParts[i].getProductSN() == productSN)
				{
					cp = computerParts[i];
					break;
				}
			}
		}
		return cp;
	}
}