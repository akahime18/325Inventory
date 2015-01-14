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
public abstract class Personnel extends Info{
    
    private String ID;
    
    public Personnel(String ID, String name)
    {
        super(name);
        this.ID = ID;
    }
    
    public void setID(String ID)
    {
        this.ID = ID;
        
    }
    
    public String getID()
    {
        return this.ID;
    }
    
}
