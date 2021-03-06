/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.jpa.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

/**
 *
 * @author Dani Pamungkas
 */
@Entity
@Table (name = "products")
public class Products implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private Integer productID;
    
    @Column(name = "productname")
    @Max(40)
    private String productName;
    
    @Column(name = "supplierid")
    private Integer SupplierID;
    
    @Column(name = "categoryid")
    private Integer categoryID;
    
    @Column(name = "quantityperunit")
    @Max(20)
    private String quantityPerUnit;
    
    @Column(name = "unitprice")
    private BigDecimal unitPrice;
    
    @Column(name = "unitsinstock")
    private Short unitsInStock;
    
    @Column(name = "unitsonorder")
    private Short unitsOnOrder;
    
    @Column(name = "reorderlevel")
    private Short reorderLevel;
    
    @Column(name = "discontinued")
    private Boolean discontinued;

    public Products() {
    }
    

    public Products(Integer productID, String productName, Integer SupplierID, Integer categoryID, String quantityPerUnit, BigDecimal unitPrice, Short unitsInStock, Short unitsOnOrder, Short reorderLevel, Boolean discontinued) {
        this.productID = productID;
        this.productName = productName;
        this.SupplierID = SupplierID;
        this.categoryID = categoryID;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Integer SupplierID) {
        this.SupplierID = SupplierID;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }
    
    
}
