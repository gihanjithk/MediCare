/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare.inventory.model;

import java.util.Date;

/**
 *
 * @author AN
 */
public class GRNItems {

    private String drugId;
    private String drugName;
    private String Brand;
    private double qty;
    private double buying;
    private double selling;
    private Date mfd;
    private Date exp;
    private String employee;

    /**
     * @return the mfd
     */
    public Date getMfd() {
        return mfd;
    }

    /**
     * @param mfd the mfd to set
     */
    public void setMfd(Date mfd) {
        this.mfd = mfd;
    }

    /**
     * @return the exp
     */
    public Date getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(Date exp) {
        this.exp = exp;
    }

    /**
     * @return the employee
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getDrugId() {
        return drugId;
    }

    /**
     * @param drugId the drugId to set
     */
    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    /**
     * @param drugName the drugName to set
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getBuying() {
        return buying;
    }

    /**
     * @param buying the buying to set
     */
    public void setBuying(double buying) {
        this.buying = buying;
    }

    public double getSelling() {
        return selling;
    }

    /**
     * @param selling the selling to set
     */
    public void setSelling(double selling) {
        this.selling = selling;
    }

}
