package shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    // Fields
    private int imei;
    private int ram;

    // Constructors

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int imei, int ram) {
        super(name, description, price, vat);
        this.imei = imei;
        this.ram = ram;
    }

    // Getters and setters
    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
