package com.example.screensforpetofy;

public class OrderhistoryResponse {
    private String ProductName;
    private String short_desc;
    private int Quantity;
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public OrderhistoryResponse(String productName, String short_desc, int quantity, String price) {
        ProductName = productName;
        this.short_desc = short_desc;
        Quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }




}
