package com.merp.perfi.sys.task.model;

public class ExpenseHistory {
    private String itemName;
    private String itemPrice;
    private String paidBy;
    private String timeAndDate;

    public ExpenseHistory(String itemName, String itemPrice, String paidBy, String timeAndDate) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.paidBy = paidBy;
        this.timeAndDate = timeAndDate;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(String timeAndDate) {
        this.timeAndDate = timeAndDate;
    }
}
