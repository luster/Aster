package com.Aster.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Order {
    private String floristEmail;
    private String customerEmail;
    private String date;
    private String productName;
    private int quantity;
    private boolean complete;
    private String id;

    public Order(@JsonProperty("floristEmail") String floristEmail,
                 @JsonProperty("customerEmail") String customerEmail,
                 @JsonProperty("date") String date,
                 @JsonProperty("product") String productName,
                 @JsonProperty("quantity") int quantity,
                 @JsonProperty("complete") boolean complete,
                 @JsonProperty("id") String id){
        this.floristEmail = floristEmail;
        this.customerEmail = customerEmail;
        this.date = date;
        this.productName = productName;
        this.quantity = quantity;
        this.complete = false;
        this.id = id;
    }

    public String getFloristEmail() {
        return floristEmail;
    }

    public void setFloristEmail(String floristEmail) {
        this.floristEmail = floristEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
