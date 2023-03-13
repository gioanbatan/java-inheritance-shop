package shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    // Fields
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;


    // Constructors
    public Prodotto(String name, String description, BigDecimal price, BigDecimal vat) {
        Random randNum = new Random();
        this.code =  randNum.nextInt(1000000);

        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // Getters and Setters
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getPriceWithVat () {
        return (this.price.add(this.price.divide(new BigDecimal("100")).multiply(this.vat)));
    }

    @Override
    public String toString() {
        /*
        return "Prodotto{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
        */
        return "codice prodotto = " + code +
                ", nome = '" + name + '\'' +
                ", descrizione = '" + description + '\'' +
                ", prezzo = " + price +
                ", iva = " + vat;
    }
}
