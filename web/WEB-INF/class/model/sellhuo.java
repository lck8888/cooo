package model;

import java.sql.Timestamp;

public class sellhuo {
    private String name;
    private int amount;
    private double price;
    private Timestamp datetime;
private  int total=1;
    // Getter and Setter methods
    public double getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "sellhuo{name='" + name + "', amount=" + amount + ", price=" +price +", datetime=" + datetime + "}";
    }
}
