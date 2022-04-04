package com.example.demo_web.entity;

public class CartItem {
    private int productId;
    private String productName;
    private String productThumbnail;
    private int quantity;
    private double productPrice;

    public CartItem(int productId, String productName, String productThumbnail, int quantity, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productThumbnail = productThumbnail;
        this.quantity = quantity;
        this.productPrice = productPrice;
    }

    public CartItem() {
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productThumbnail='" + productThumbnail + '\'' +
                ", quantity=" + quantity +
                ", productPrice=" + productPrice +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductThumbnail() {
        return productThumbnail;
    }

    public void setProductThumbnail(String productThumbnail) {
        this.productThumbnail = productThumbnail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
