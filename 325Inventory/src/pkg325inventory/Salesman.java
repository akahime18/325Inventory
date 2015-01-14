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
public class Salesman extends Personnel {
    
    float sales;
    
    public Salesman(String ID, String name, float sales)
    {
        super(ID,name);
        this.sales = sales;
    }
    
    @Override
    public void displayInfo()
    {
        System.out.printf("ID: %s\tName:%s\tSales: %f\tIdentity: Salesman\n",super.getID(),super.getName(),this.sales);
    }
    
    public void addSales(float x)
    {
         sales += x;
         
    }
    public float getSales()
    {
        return this.sales;
    }
}   
    
