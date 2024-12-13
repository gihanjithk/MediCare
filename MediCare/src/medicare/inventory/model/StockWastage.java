/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare.inventory.model;

/**
 *
 * @author AN
 */
public class StockWastage {

    /**
     * @return the mfd
     */
    public String getMfd() {
        return mfd;
    }

    /**
     * @param mfd the mfd to set
     */
    public void setMfd(String mfd) {
        this.mfd = mfd;
    }

    /**
     * @return the exp
     */
    public String getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(String exp) {
        this.exp = exp;
    }

    
    public String getQty() {
        return qty;
    }

    
    public void setQty(String qty) {
        this.qty = qty;
    }

    private String stockId;
    private String DrugName;
    private String Brand;
    
    private String qty;
    private String mfd;
    private String exp;
    
    public String getStockId() {
        return stockId;
    }

    
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    
    public String getDrugName() {
        return DrugName;
    }

    
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    
    public String getBrand() {
        return Brand;
    }

    
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    
    
    
}
