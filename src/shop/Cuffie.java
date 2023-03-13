package shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    // Fields
    private String color;
    private boolean isWireless;

    // Constructors

    public Cuffie(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean isWireless) {
        super(name, description, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }
}
