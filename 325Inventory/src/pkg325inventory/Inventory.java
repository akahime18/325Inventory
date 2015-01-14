/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg325inventory;

/**
 *
 * @author Kyle Mason
 */
public class Inventory {
    
    Item item[] = new Item[5];
    
    public Inventory()
    {
        item[0] = new Item("pencil",19.50f);
        item[1] = new Item("ballpen",20.00f);
        item[2] = new Item("yellowpaper",32.00f);
        item[3] = new Item("notebook",15.00f);
        item[4] = new Item("eraser", 22.00f);
    }
     public void displayInventory()
     {
         System.out.print("");
         System.out.printf("\t\tList of Items |\n|Item no. \tItem Name\tPrice\t\tQty    |\n");
         System.out.print("____________________________________________________________\n");
         System.out.print("|  [1] ");item[0].displayInfo();System.out.print("         |\n");
         System.out.print("|  [2] ");item[1].displayInfo();System.out.print("         |\n");
         System.out.print("|  [3] ");item[2].displayInfo();System.out.print("         |\n");
	 System.out.print("|  [4] ");item[3].displayInfo();System.out.print("         |\n");
	 System.out.print("|  [5] ");item[4].displayInfo();System.out.print("         |\n");
	 System.out.print("____________________________________________________________\n");
	}
    
     public Item getItem(int itemnumber)
     {
         if(itemnumber<1 || itemnumber>5)
             return null;
         return item[itemnumber-1];
     }
    
}
