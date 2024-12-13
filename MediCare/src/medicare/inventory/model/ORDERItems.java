/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare.inventory.model;

/**
 *
 * @author AN
 */
public class ORDERItems {

    
    public String getDrugid() {
        return drugid;
    }

    
    public void setDrugid(String drugid) {
        this.drugid = drugid;
    }

   
    public double getQty() {
        return qty;
    }

    
    public void setQty(double qty) {
        this.qty = qty;
    }

    
    public String getEmployee() {
        return employee;
    }

    
    public void setEmployee(String employee) {
        this.employee = employee;
    }

    
    public String getBrand() {
        return brand;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    private String drugid;
    private double qty;
    private String employee;
    private String brand;
    
}
