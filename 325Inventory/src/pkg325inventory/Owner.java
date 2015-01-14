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
public class Owner extends product {
    
    public Owner(String name)
    {
         super(name);
    }
    
    
    public void displayInfo()
    {
        System.out.printf("Name: %s\nIdentity: Owner\n",super.getName());
    }
    
}
