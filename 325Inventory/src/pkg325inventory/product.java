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
public abstract class product {
    
    private String name;
    
    public product(String name)
    {
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;
        
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public abstract void displayInfo();
}
