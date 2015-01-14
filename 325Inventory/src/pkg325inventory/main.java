/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg325inventory;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kyle Mason
 */
public class main {
    
    public static void main(String[] args)
    {
        Clerk clrk = new Clerk("0930","Salise");
        Salesman one = new Salesman("0931", "Driane", 33.00f);
        Salesman two = new Salesman("0932", "Ana", 12.00f);
        Salesman three = new Salesman("0933", "Bryan", 99.00f);
        Salesman four = new Salesman("0934", "John", 76.00f);
        Owner owner = new Owner("KYLE");
        Inventory inv = new Inventory();
        
        while(true)
        {
            System.out.println("On-line Sales Inventory");
            System.out.println("Enter ID: ");
            Scanner input = new Scanner(System.in);
            
            if(input.equals("0930"))
            {
                int exit = 0;
                while(exit == 0)
                {
                    System.out.println("System Account");
                    System.out.println("WELCOME!");
                    clrk.displayInfo();
                    inv.displayInventory();
                    System.out.print("[1] Replenish Stock\n [2]Modify Item price\n [3]Exit\nEnter choice:");
                    int choice = input.nextInt();
                    switch(choice)
                    {
                        case 1:
                                System.out.print("Item choice:");
                                int itemnumber = input.nextInt();
                                if(itemnumber>5 || itemnumber<1)
                                System.out.println("Out of range");
                                System.out.print("Quantity: ");
                                int qty = input.nextInt();
                                inv.getItem(itemnumber).addQuantity(qty);
                                System.out.println("Successfull!");
                                break;
                            
                        case 2:
                               System.out.print("Item choice:");
                               int itemnumber1 = input.nextInt();
                               
                                if(itemnumber1>5 || itemnumber1<1)
                                    System.out.println("Out of range");
                                    System.out.print("New price");
                                    float price = input.nextFloat();
                                    inv.getItem(itemnumber1).setPrice(price);
                                    System.out.println("Successfull!");
                                    break;
                        case 3:
                                exit = 1;
                                break;
                        default:
                                System.out.println("wrong choice");
                                break;
                        
                    }
                    
                }try 
                {
                   System.in.read();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            else if(input.equals("0931") || input.equals("0932") || input.equals("0933") || input.equals("0934"))
            {
                Salesman logged = null;
                if(input.equals("0931")) logged = one;
                else if(input.equals("0932")) logged = two;
                else if(input.equals("0933")) logged = three;
                else if(input.equals("0934")) logged = four;
                int exit = 0;
                
                while(exit==0)
                {
                    System.out.println("System Accounts");
                    logged.displayInfo();
                    inv.displayInventory();
                    System.out.print("\"Tasks\\n[1] Sell \\n[2] Exit\\nEnter Choice:\"");
                    int choice = input.nextInt();
                    switch(choice)
                    {
                        case 1:
                           System.out.print("Item Choice");
                           int itemnumber = input.nextInt();
                           if(itemnumber>5 || itemnumber<1)
                           {
                               System.out.println("wrong choice");
                               break;
                           }
                        
                        System.out.print("Y/N");
                            String proceed = input.next();
                            if(proceed.equals("Y"))
                            {
                                if(inv.getItem(itemnumber).getQuantity()>0)
                                {
                                  inv.getItem(itemnumber).subQuantity(1);
                                  logged.addSales(inv.getItem(itemnumber).getPrice());
                                  System.out.println("Successfull!");
                                  
                                }
                                
                                else{
                                    System.out.print("out of stock");
                                }
                    }
                            break;
                            
                        case 2:
                            exit = 1;
                            break;
                        default:
                            System.out.println("Out of stock");
                            break;
                }
                    try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                
            }
                }
            
            else if(input.equals("owner"))
            {
                int exit = 0;
                while(exit == 0)
                {
                    System.out.println("System Account");
                    owner.displayInfo();
                    System.out.print("Tasks\n[1] Display Sales\n[2] Display Inventory\n[3] Exit\nEnter Choice:");
                    int choice = input.nextInt();
                    switch(choice)
                    {
                        case 1:
                            System.out.printf("List of Employees\n");
                            one.displayInfo();
                            two.displayInfo();
                            three.displayInfo();
                            four.displayInfo();
                            System.out.printf("Total Sales: %.2f", one.getSales()+two.getSales()+three.getSales()+four.getSales());
                            break;
                        case 2:
                            inv.displayInventory();
                            break;
                        case 3:
                            exit = 1;
                            break;
                        default:
                            System.out.println("Wrong choice.");
                            break;
                    }
                        try {
				System.in.read();
			} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
                        
                        
          }
 }
                else{
				System.out.println("Id not found!");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
        }
    }
}
                                                     
                
    

