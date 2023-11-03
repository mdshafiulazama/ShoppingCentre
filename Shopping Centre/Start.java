/*
	Group Name: E02
	Project Name: Shopping Center Management System.

	Group Members Name:

	Name: Md. Shahriar Mahmud
	ID: 21-44498-1

	Name: Md Rased Hasan Rokon
	ID: 21-44574-1

	Name: Ahmed Tangil Hasnain Rahat
	ID: 21-44441-1
*/

import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String[] args){

		ShoppingCenter s = new ShoppingCenter();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("\n************************************************************************");
		System.out.println("\t\t\tWelcome to Unique Shopping Center");
		System.out.println("************************************************************************");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println("\t1. Parking Area Management");
			System.out.println("\t2. Shop Management");
			System.out.println("\t3. Shops Computer Parts Management");
			System.out.println("\t4. Product Stocks Management");
			System.out.println("\t5. Exit");
			
			System.out.println();
			Scanner sc1 = new Scanner(System.in);
			System.out.print("What is you choice: ");
			int choice = sc1.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chosen \"Parking Area Management\"");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Parking Area");
					System.out.println("\t2. Remove Existing Parking Area");
					System.out.println("\t3. Search an Parking Area");
					System.out.println("\t4. Show All Parking Area");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					Scanner sc2 = new Scanner(System.in);
					System.out.print("Enter you option: ");
					int option1 = sc2.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Insert New Parking Area\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc3 = new Scanner(System.in);
							System.out.print("Enter Area No: ");
							String areaNo1 = sc3.next();
							Scanner sc4 = new Scanner(System.in);
							System.out.print("Enter Available Slots: ");
							int availableSlots1 = sc4.nextInt();
							
							ParkingArea p1 = new ParkingArea();
							p1.setAreaNo(areaNo1);
							p1.setAvailableSlots(availableSlots1);
														
							if(s.inseretParkingArea(p1))
							{
								System.out.println();
								System.out.println(p1.getAreaNo() + " No Parking Area has been Inserted.");
							}
							else
							{
								System.out.println();
								System.out.println(p1.getAreaNo() + " No Parking Area can NOT be Inserted.");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Remove an Parking Area\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc5 = new Scanner(System.in);
							System.out.print("Enter Area No for Removing: ");
							String areaNo2 = sc5.next();
							
							ParkingArea p2 = s.searchParkingArea(areaNo2);
							
							if(p2 != null)
							{
								System.out.println("\n****** Parking Area Found for Removing *****\n");
								if(s.removeParkingArea(p2))
								{
									System.out.println();
									System.out.println(p2.getAreaNo() + " No Parking Area has been Removed");
								}
							}
							else
							{
								System.out.println();
								System.out.println("\n****** This Parking Area NOT Found and Can NOT be Removed *****");
							}
							System.out.println();
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Search an Parking Area\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc6 = new Scanner(System.in);
							System.out.print("Enter Area No for searching: ");
							String areaNo3 = sc6.next();
							
							ParkingArea p3 = s.searchParkingArea(areaNo3);
							
							if(p3 != null)
							{
								System.out.println("****** Parking Area Found ******");
								System.out.println();
								System.out.println("Parking Area No: " + p3.getAreaNo());
								System.out.println("Available Slots: " + p3.getAvailableSlots());							
							}
							else
							{
								System.out.println("****** Parking Area NOT Found ******");
							}
							System.out.println();
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Show All Parking Area\"");
							System.out.println("-------------------------------------------");
							
							s.showAllParkingAreas();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Go Back\"");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					break;
					
				case 2:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chosen \"Shop Management\"");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Shop");
					System.out.println("\t2. Remove Existing Shop");
					System.out.println("\t3. Search a Shop");
					System.out.println("\t4. Show All Shops");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					Scanner sc6o = new Scanner(System.in);
					System.out.print("Enter you option: ");
					int option2 = sc6o.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Insert New Shop\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc6v = new Scanner(System.in);
							System.out.print("Enter Shop Name: ");
							String name1 = sc6v.nextLine();
							Scanner sc7 = new Scanner(System.in);
							System.out.print("Enter Shop Number: ");
							int shopNumber1 = sc7.nextInt();							
							
														
							Shop s1 = new Shop(name1, shopNumber1);
							
							if(s.insertShop(s1))
							{
								System.out.println();
								System.out.println("Shop Number " + s1.getShopNumber() + " has been Inserted");
							}
							else
							{
								System.out.println();
								System.out.println("Shop Number " + s1.getShopNumber() + " Can NOT be Inserted");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Remove Existing Shop\"");
							System.out.println("-------------------------------------------");
							
							Scanner sc8 = new Scanner(System.in);
							System.out.print("Enter Shop Number for Removing: ");
							int shopNumber2 = sc8.nextInt();
							
							Shop s2 = s.searchShop(shopNumber2);
							
							if(s2 != null)
							{
								System.out.println("****** Shop Found for Removing ******");
								if(s.removeShop(s2))
								{
									System.out.println();
									System.out.println("Shop Number " + s2.getShopNumber() + " has been Removed");
								}
							}
							else
							{
								System.out.println();
								System.out.println("****** This Shop NOT Found and Can NOT be Removed ******");
							}
							System.out.println();
							
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Search a Shop\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc9 = new Scanner(System.in);
							System.out.print("Enter Shop Number for searching: ");
							int shopNumber3 = sc9.nextInt();
							
							Shop s3 = s.searchShop(shopNumber3);
							
							if(s3 != null)
							{
								System.out.println("****** Shop Found ******");
								s3.showDetails();
							}
							else
							{
								System.out.println();
								System.out.println("****** Shop NOT Found ******");
							}
							System.out.println();
														
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Show All Shops\"");
							System.out.println("-------------------------------------------");
							
							s.showAllShops();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Go Back\"");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					
					break;
				
				
				case 3:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chosen \"Shops Computer Parts Management\"");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Computer Parts for a Shop");
					System.out.println("\t2. Remove Existing Computer Parts for a Shop");
					System.out.println("\t3. Search a Computer Parts for a Shop");
					System.out.println("\t4. Show All Computer Parts for a Shop");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					Scanner sc10 = new Scanner(System.in);
					System.out.print("Enter you option: ");
					int option3 = sc10.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Insert New Computer Parts for a Shop\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc11 = new Scanner(System.in);
							System.out.print("Enter Shop Number: ");
							int shopNumber1 = sc11.nextInt();
							
							Shop s1 = s.searchShop(shopNumber1);
							
							if(s1 != null)
							{
								System.out.println("****** Valid Shop ******");
								
								System.out.println("Which type of Computer Parts do you want to Insert?");
								System.out.println("\t1. Motherboard");
								System.out.println("\t2. Processor");
								System.out.println("\t3. Ram");
								System.out.println("\t4. SSD");
								System.out.println("\t5. Graphics Card");
								System.out.println("\t6. Go Back");
								System.out.println();
								
								Scanner sc12 = new Scanner(System.in);
								System.out.print("Your Type: ");
								int type = sc12.nextInt();
								
								ComputerParts cp = null;
								
								if(type == 1)
								{
									System.out.println("----------------------------------");
									System.out.println("Inserting a Motherboard");
									System.out.println("----------------------------------");
															
									Scanner sc13 = new Scanner(System.in);
									System.out.print("Enter Product SN : ");
									int psn = sc13.nextInt();
									Scanner sc14 = new Scanner(System.in);
									System.out.print("Enter Product Name : ");
									String pn = sc14.nextLine();
									Scanner sc15 = new Scanner(System.in);
									System.out.print("Enter Available Quantity : ");
									int aq = sc15.nextInt();
									Scanner sc16 = new Scanner(System.in);
									System.out.print("Enter Product Price : ");
									double pp = sc16.nextDouble();
									Scanner sc17 = new Scanner(System.in);
									System.out.print("Enter Chipset Type: ");
									String ct = sc17.nextLine();

									Motherboard mb = new Motherboard(psn, pn, aq, pp, ct);
									
									cp = mb;
								}
								else if(type == 2)
								{
									System.out.println("----------------------------------");
									System.out.println("Inserting a Processor");
									System.out.println("----------------------------------");
									
									Scanner sc18 = new Scanner(System.in);
									System.out.print("Enter Product SN : ");
									int psn = sc18.nextInt();
									Scanner sc19 = new Scanner(System.in);
									System.out.print("Enter Product Name : ");
									String pn = sc19.nextLine();
									Scanner sc20 = new Scanner(System.in);
									System.out.print("Enter Available Quantity : ");
									int aq = sc20.nextInt();
									Scanner sc21 = new Scanner(System.in);
									System.out.print("Enter Product Price : ");
									double pp = sc21.nextDouble();
									Scanner sc22 = new Scanner(System.in);
									System.out.print("Enter Generation: ");
									int gn = sc22.nextInt();

									Processor pr = new Processor(psn, pn, aq, pp, gn);
									
									cp = pr;
								}
								else if(type == 3)
								{
									System.out.println("----------------------------------");
									System.out.println("Inserting a Ram");
									System.out.println("----------------------------------");
									
									Scanner sc23 = new Scanner(System.in);
									System.out.print("Enter Product SN : ");
									int psn = sc23.nextInt();
									Scanner sc24 = new Scanner(System.in);
									System.out.print("Enter Product Name : ");
									String pn = sc24.nextLine();
									Scanner sc25 = new Scanner(System.in);
									System.out.print("Enter Available Quantity : ");
									int aq = sc25.nextInt();
									Scanner sc26 = new Scanner(System.in);
									System.out.print("Enter Product Price : ");
									double pp = sc26.nextDouble();
									Scanner sc27 = new Scanner(System.in);
									System.out.print("Enter Bus Speed: ");
									int bs = sc27.nextInt();

									Ram ra = new Ram(psn, pn, aq, pp, bs);
									
									cp = ra;
								}
								else if(type == 4)
								{
									System.out.println("----------------------------------");
									System.out.println("Inserting a SSD");
									System.out.println("----------------------------------");
									
									Scanner sc28 = new Scanner(System.in);
									System.out.print("Enter Product SN : ");
									int psn = sc28.nextInt();
									Scanner sc29 = new Scanner(System.in);
									System.out.print("Enter Product Name : ");
									String pn = sc29.nextLine();
									Scanner sc30 = new Scanner(System.in);
									System.out.print("Enter Available Quantity : ");
									int aq = sc30.nextInt();
									Scanner sc31 = new Scanner(System.in);
									System.out.print("Enter Product Price : ");
									double pp = sc31.nextDouble();
									Scanner sc32 = new Scanner(System.in);
									System.out.print("Enter PCI Generation: ");
									int pgn = sc32.nextInt();

									SSD ss = new SSD(psn, pn, aq, pp, pgn);
									
									cp = ss;
								}
								else if(type == 5)
								{
									System.out.println("----------------------------------");
									System.out.println("Inserting a Graphics Card");
									System.out.println("----------------------------------");
									
									Scanner sc33 = new Scanner(System.in);
									System.out.print("Enter Product SN : ");
									int psn = sc33.nextInt();
									Scanner sc34 = new Scanner(System.in);
									System.out.print("Enter Product Name : ");
									String pn = sc34.nextLine();
									Scanner sc35 = new Scanner(System.in);
									System.out.print("Enter Available Quantity : ");
									int aq = sc35.nextInt();
									Scanner sc36 = new Scanner(System.in);
									System.out.print("Enter Product Price : ");
									double pp = sc36.nextDouble();
									Scanner sc37 = new Scanner(System.in);
									System.out.print("Enter VRAM: ");
									String vram = sc37.nextLine();

									GraphicsCard gc = new GraphicsCard(psn, pn, aq, pp, vram);
									
									cp = gc;
								}
								else if(type == 6)
								{
									System.out.println("----------------------------------");
									System.out.println("Going Back.....");
									System.out.println("----------------------------------");
								}
								else
								{
									System.out.println("----------------------------------");
									System.out.println("Invalid Type");
									System.out.println("----------------------------------");
								}
								
								if(cp != null)
								{
									if(s1.insertComputerParts(cp))
									{
										System.out.println("Computer Parts "+ cp.getProductSN()+" has been inserted for " + s1.getShopNumber());
									}
									else
									{
										System.out.println("Computer Parts "+ cp.getProductSN()+" can NOT be inserted for " + s1.getShopNumber());
									}
								}
							}
							else
							{
								System.out.println();
								System.out.println("### Invalid Shop.. Computer Parts Can NOT be Inserted ###");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Remove Existing Computer Parts for a Shop\"");
							System.out.println("-------------------------------------------\n");							

							Scanner sc38 = new Scanner(System.in);
							System.out.print("Enter Shop Number: ");
							int shopNumber2 = sc38.nextInt();
							
							Shop s2 = s.searchShop(shopNumber2);
							
							if(s2 != null)
							{
								System.out.println("****** Valid Shop ******");
																																								
								Scanner sc39 = new Scanner(System.in);
								System.out.print("\nEnter Product SN for Removing: ");
								int psn1 = sc39.nextInt();
									
								ComputerParts cp1 = s2.searchComputerParts(psn1);

								if(cp1 != null){
									System.out.println();
									System.out.println("****** Computer Parts Found for Removing ******");
										
									if (s2.removeComputerParts(cp1)){
										System.out.println();
										System.out.println("Product SN " + cp1.getProductSN() + " has been Removed");
									}
									else{
										System.out.println();
										System.out.println("Product SN " + cp1.getProductSN() + " has NOT been Removed");
									}									
								}
								else{
										System.out.println();
										System.out.println("****** Computer Parts NOT Found and Can NOT be Removed ******");
									}
							}
							else
							{
								System.out.println();
								System.out.println("****** Invalid Shop.. Computer Parts Can NOT be Removed ******");
							}
							System.out.println();
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Search a Computer Parts for a Shop\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc40 = new Scanner(System.in);
							System.out.print("Enter Shop Number: ");
							int shopNumber3 = sc40.nextInt();
							
							Shop s3 = s.searchShop(shopNumber3);
							
							if(s3 != null)
							{
								System.out.println("****** Valid Shop ******");
																																								
								Scanner sc41 = new Scanner(System.in);
								System.out.print("Enter Product SN for Searching: ");
								int psn2 = sc41.nextInt();
									
								ComputerParts cp2 = s3.searchComputerParts(psn2);

								if(cp2 != null){

									System.out.println();
									System.out.println("****** Computer Parts Found ******");
									cp2.showInfo();																	
								}
								else{

									System.out.println();
									System.out.println("****** Computer Parts NOT Found ******");
								}
							}
							else
							{
								System.out.println();
								System.out.println("****** Invalid Shop. Computer Parts Can NOT be Searched ******");
							}
							System.out.println();							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Show All Computer Parts for a Shop\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc42 = new Scanner(System.in);
							System.out.print("Enter Shop Number: ");
							int shopNumber4 = sc42.nextInt();
							
							Shop s4 = s.searchShop(shopNumber4);
							
							if(s4 != null)
							{
								System.out.println("****** Shop Found ******");
								s4.showDetails();
								s4.showAllComputerParts();
							}
							else
							{
								System.out.println("****** Invalid Shop ******");
							}
							System.out.println();
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose \"Go Back\"");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					break;
					
				case 4:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chosen \"Product Stocks Management\"");
					System.out.println("-------------------------------------------\n");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Add Quantity");
					System.out.println("\t2. Sell Quantity");
					System.out.println("\t3. Show All Deals");
					System.out.println("\t4. Go Back");
					
					System.out.println();
					Scanner sc43 = new Scanner(System.in);
					System.out.print("Enter you option: ");
					int option4 = sc43.nextInt();
					
					switch(option4)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Add Quantity\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc44 = new Scanner(System.in);
							System.out.print("Enter Shop Number: ");
							int shopNumber1 = sc44.nextInt();
							
							Shop s1 = s.searchShop(shopNumber1);
							
							if(s1 != null)
							{
								System.out.println("****** Valid Shop ******");
								
								Scanner sc45 = new Scanner(System.in);
								System.out.print("Enter Product SN : ");
								int psn = sc45.nextInt();
							
								ComputerParts cp = s1.searchComputerParts(psn);
								
								if(cp != null)
								{
									System.out.println();
									System.out.println("****** Valid Computer Parts ******");
									
									System.out.println();
									System.out.println("Available Quantity : " + cp.getAvailableQuantity());
									
									Scanner sc46 = new Scanner(System.in);
									System.out.print("Enter the amount of Parts Added Quantity : ");
									int paq = sc46.nextInt();
									
									if(cp.addQuantity(paq))
									{
										System.out.println();
										System.out.println("****** Quantity Added Successfully ******");
										System.out.println("New Available Quantity : " + cp.getAvailableQuantity());
										frwd.writeInFile("Shop No " + s1.getShopNumber() + " has Added " + paq + " product of " + cp.getProductSN());										
									}
									else
									{
										System.out.println();
										System.out.println("****** Invalid Amount ******");
									}									
								}
								else
								{
									System.out.println();
									System.out.println("****** Invalid Computer Parts ******");
								}
							}
							else
							{
								System.out.println();
								System.out.println("****** Invalid Shop ******");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Sell Quantity\"");
							System.out.println("-------------------------------------------\n");
							
							Scanner sc47 = new Scanner(System.in);
							System.out.print("Enter Shop Number: ");
							int shopNumber2 = sc47.nextInt();
							
							Shop s2 = s.searchShop(shopNumber2);
							
							if(s2 != null)
							{
								System.out.println("****** Valid Shop ******");
								
								Scanner sc48 = new Scanner(System.in);
								System.out.print("Enter Product SN : ");
								int psn = sc48.nextInt();
							
								ComputerParts cp = s2.searchComputerParts(psn);
								
								if(cp != null)
								{
									System.out.println("****** Valid Computer Parts ******");
									
									System.out.println();
									System.out.println("Available Quantity : " + cp.getAvailableQuantity());
									
									Scanner sc49 = new Scanner(System.in);
									System.out.print("Enter the amount of Parts Sold Quantity : ");
									int psq = sc49.nextInt();
									
									if(cp.sellQuantity(psq))
									{
										System.out.println();
										System.out.println("****** Quantity Sold Successfully ******");
										System.out.println("New Available Quantity : " + cp.getAvailableQuantity());
										frwd.writeInFile("Shop No " + s2.getShopNumber() + " has Sold " + psq + " product of " + cp.getProductSN());										
									}
									else
									{
										System.out.println();
										System.out.println("****** Invalid Amount ******");
									}									
								}
								else
								{
									System.out.println();
									System.out.println("****** Invalid Computer Parts ******");
								}
							}
							else
							{
								System.out.println();
								System.out.println("****** Invalid Shop ******");
							}
							System.out.println();
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Show All Deals\"");
							System.out.println("-------------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chosen \"Go Back\"");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();					
					break;
					
				case 5:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to \"Exit\"");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
					
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("-------------------------------------------");
					
					break;
			}
		}
	}
}