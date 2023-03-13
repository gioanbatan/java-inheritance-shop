package shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    // Fields
    private double sizeX;
    private double sizeY;
    private double sizeZ;
    private int screenSize;
    private boolean isSmart;

    // Constructors
    public Televisore(String name, String description, BigDecimal price, BigDecimal vat, double sizeX, double sizeY, double sizeZ, int screenSize, boolean isSmart) {
        super(name, description, price, vat);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    // Getters and setters

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setSizeY(double sizeY) {
        this.sizeY = sizeY;
    }

    public double getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(double sizeZ) {
        this.sizeZ = sizeZ;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
