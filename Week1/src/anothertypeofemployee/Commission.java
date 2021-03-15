/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anothertypeofemployee;

/**
 *
 * @author N I T RO
 */
public class Commission extends Hourly {
    private double totalSales; 
    private double comrate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double corate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        comrate = corate;
    }
    public void addSales(double newtotalSales){
        totalSales += newtotalSales;
    }
    @Override
    public double pay(){
        totalSales = totalSales*comrate;
        totalSales = totalSales + super.pay(); 
        return totalSales;
    }
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: "+ totalSales;
        return result;
    }
}