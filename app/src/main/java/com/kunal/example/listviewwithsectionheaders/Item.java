package com.kunal.example.listviewwithsectionheaders;

/**
 * Created by kunal on 4/3/16.
 */
public class Item {
    private String itemName;
    private String itemDate;
    private String itemPhoneNumber;

    public Item(String itemName, String itemPhoneNumber, String itemDate) {
        this.itemName = itemName;
        this.itemDate = itemDate;
        this.itemPhoneNumber = itemPhoneNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDate() {
        return itemDate;
    }

    public void setItemDate(String itemDate) {
        this.itemDate = itemDate;
    }

    public String getItemPhoneNumber() {
        return itemPhoneNumber;
    }

    public void setItemPhoneNumber(String itemPhoneNumber) {
        this.itemPhoneNumber = itemPhoneNumber;
    }
}
