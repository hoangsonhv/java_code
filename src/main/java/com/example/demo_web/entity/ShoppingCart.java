package com.example.demo_web.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    private double totalPrice;
    private String shippingName;
    private String shippingPhone;
    private String shippingAddress;
    private HashMap<Integer, CartItem> mapItem;

    public ShoppingCart(double totalPrice, String shippingName, String shippingPhone, String shippingAddtress) {
        this.totalPrice = totalPrice;
        this.shippingName = shippingName;
        this.shippingPhone = shippingPhone;
        this.shippingAddress = shippingAddtress;
    }

    public void addItemToCart(Product product, int quantity){
        CartItem item = null;
        if (mapItem.containsKey(product.getId())){
            item = mapItem.get(product.getId());
        }else {
            item = new CartItem();
            item.setProductId(product.getId());
            item.setProductName(product.getName());
            item.setProductThumbnail(product.getThumbnail());
            item.setProductPrice(product.getPrice());
        }
        item.setQuantity(item.getQuantity() + quantity);
        mapItem.put(product.getId(), item);
    }

    public void updateItemFromCart(Product product, int quantity){
        CartItem  item = null;
        if (mapItem.containsKey(product.getId())){
            item = mapItem.get(product.getId());
        }else {
            item = new CartItem();
        }
        item.setQuantity(quantity);
        mapItem.put(product.getId(), item);
    }

    public void removeItemFromCart(Product product, int quantity){
        mapItem.remove(product.getId());
    }

    public void clear(){
        mapItem.clear();
    }

    public ShoppingCart() {
        mapItem = new HashMap<>();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "totalPrice=" + totalPrice +
                ", shippingName='" + shippingName + '\'' +
                ", shippingPhone='" + shippingPhone + '\'' +
                ", shippingAddtress='" + shippingAddress + '\'' +
                '}';
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingPhone() {
        return shippingPhone;
    }

    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ArrayList<CartItem> getListItems(){
        return new ArrayList<>(mapItem.values());
    }
}
