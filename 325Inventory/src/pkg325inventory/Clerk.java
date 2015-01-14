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
public class Clerk extends Personnel{
    
    public Clerk(String ID, String name)
    {
        super(ID,name);
    }
    
    @Override
    public void displayInfo()
    {
        System.out.printf("ID: %s\tName: %s\t -CLERK-", super.getID(), super.getName());
    }
}
