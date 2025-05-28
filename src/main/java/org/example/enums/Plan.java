package org.example.enums;

public enum Plan {
    BASIC("BASIC", 10000),
    MEDIUM("MEDIUM",18000),
    ADVANCE("ADVANCE",30000);

    private String name;

    private int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
