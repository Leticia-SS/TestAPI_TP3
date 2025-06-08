package org.javaWeb.models;

public class EvilTesterItems {
    private int Id;
    private String Type;
    private String Isbn13;
    private double Price;
    private int NumberInStock;

    public EvilTesterItems(int id, String type, String isbn13, double price, int numberInStock) {
        Id = id;
        Type = type;
        Isbn13 = isbn13;
        Price = price;
        NumberInStock = numberInStock;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getIsbn13() {
        return Isbn13;
    }

    public void setIsbn13(String isbn13) {
        Isbn13 = isbn13;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getNumberInStock() {
        return NumberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        NumberInStock = numberInStock;
    }
}
