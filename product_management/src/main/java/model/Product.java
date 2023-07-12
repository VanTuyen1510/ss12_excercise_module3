package model;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private int price;
    private String describe;
    private String origin;
    private Date dateRelease;

    public Product() {
    }

    public Product(int id, String name, int price, String describe, String origin, Date dateRelease) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.origin = origin;
        this.dateRelease = dateRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }
}
