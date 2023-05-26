package com.BotHelper.BotHelper.WB;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonAutoDetect
public  class Goodz {

    public Goodz(String supplierArticle, int quantity) {
        this.supplierArticle = supplierArticle;
        this.quantity = quantity;
    }

    public Goodz(String supplierArticle, double salesPerDaily){
        this.supplierArticle = supplierArticle;
        this.salesPerDaily = salesPerDaily;
    }
    //продажи шт/день
    @JsonIgnore
    private double salesPerDaily;

    public double getSalesPerDaily() {
        return salesPerDaily;
    }

    public void setSalesPerDaily(double salesPerDaily) {
        this.salesPerDaily = salesPerDaily;
    }

    public String getLastChangeDate() {
        return lastChangeDate;
    }

    public String getSupplierArticle() {
        return supplierArticle;
    }

    public String getTechSize() {
        return techSize;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSupply() {
        return isSupply;
    }

    public boolean isRealization() {
        return isRealization;
    }

    public int getQuantityFull() {
        return quantityFull;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public int getNmId() {
        return nmId;
    }

    public String getSubject() {
        return subject;
    }

    public String getCategory() {
        return category;
    }

    public int getDaysOnSite() {
        return daysOnSite;
    }

    public String getBrand() {
        return brand;
    }

    public String getSCCode() {
        return SCCode;
    }

    @JsonIgnore
    public Number getPrice() {
        return price;
    }

    public Number getDisc() {
        return disc;
    }

    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    public void setSupplierArticle(String supplierArticle) {
        this.supplierArticle = supplierArticle;
    }

    public void setTechSize(String techSize) {
        this.techSize = techSize;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSupply(boolean supply) {
        isSupply = supply;
    }

    public void setRealization(boolean realization) {
        isRealization = realization;
    }

    public void setQuantityFull(int quantityFull) {
        this.quantityFull = quantityFull;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public void setNmId(int nmId) {
        this.nmId = nmId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDaysOnSite(int daysOnSite) {
        this.daysOnSite = daysOnSite;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSCCode(String SCCode) {
        this.SCCode = SCCode;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public void setDisc(Number disc) {
        this.disc = disc;
    }

    private String lastChangeDate;
    private String supplierArticle;
    private String techSize;
    private String barcode;
    private int quantity;
    private boolean isSupply;
    private boolean isRealization;
    private int quantityFull;
    private String warehouseName;
    private int nmId;
    private String subject;
    private String category;
    private int daysOnSite;
    private String brand;
    private String SCCode;
    private Number price;
    private Number disc;

    @JsonCreator
    public Goodz(
            @JsonProperty("lastChangeDate") String lastChangeDate,
            @JsonProperty("supplierArticle") String supplierArticle,
            @JsonProperty("techSize") String techSize,
            @JsonProperty("barcode") String barcode,
            @JsonProperty("quantity") int quantity,
            @JsonProperty("isSupply") boolean isSupply,
            @JsonProperty("isRealization") boolean isRealization,
            @JsonProperty("quantityFull") int quantityFull,
            @JsonProperty("warehouseName") String warehouseName,
            @JsonProperty("nmId") int nmId,
            @JsonProperty("subject") String subject,
            @JsonProperty("category") String category,
            @JsonProperty("daysOnSite") int daysOnSite,
            @JsonProperty("brand") String brand,
            @JsonProperty("SCCode") String SCCode,
            @JsonProperty("Price") Number price,
            @JsonProperty("Discount") Number disc) {
        this.lastChangeDate = lastChangeDate;
        this.supplierArticle = supplierArticle;
        this.techSize = techSize;
        this.barcode = barcode;
        this.quantity = quantity;
        this.isSupply = isSupply;
        this.isRealization = isRealization;
        this.quantityFull = quantityFull;
        this.warehouseName = warehouseName;
        this.nmId = nmId;
        this.subject = subject;
        this.category = category;
        this.daysOnSite = daysOnSite;
        this.brand = brand;
        this.SCCode = SCCode;
        this.price = price;
        this.disc = disc;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.supplierArticle != null ? this.supplierArticle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Goodz other = (Goodz) obj;
        if ((this.getSupplierArticle() == null) ? (other.getSupplierArticle() != null) : !this.getSupplierArticle().equals(other.getSupplierArticle())) {
            return false;
        }
        return true;
    }
}


