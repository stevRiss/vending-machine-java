package org.example.dto;

import java.math.BigDecimal;

public class Item {
    String itemName;
    BigDecimal price;
    int invNum;

    //constructor
    public Item(String price, int invNum){
        this.itemName = itemName;
        this.price = new BigDecimal(price);
        this.invNum = invNum;
    }
    //^ this is constructor overloading v

    //constructor
    public Item(String itemName){
        this.itemName = itemName;
    }


    //getters and setters

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }
}
