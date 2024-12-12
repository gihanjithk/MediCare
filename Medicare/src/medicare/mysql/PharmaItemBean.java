
package medicare.mysql;

/**
 *
 * @author Pasindu Weerasekara
 */
public class PharmaItemBean {
    private String stockID;
    private String brand;
    private String name;
    private String qty;
    private String sellingPrice;
    private String dosage;
    private String expd;

    /**
     * @return the stockID
     */
    public String getStockID() {
        return stockID;
    }

    /**
     * @param stockID the stockID to set
     */
    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * @return the sellingPrice
     */
    public String getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * @return the dosage
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * @param dosage the dosage to set
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    /**
     * @return the expd
     */
    public String getExpd() {
        return expd;
    }

    /**
     * @param expd the expd to set
     */
    public void setExpd(String expd) {
        this.expd = expd;
    }
    
}
