package shop;

import java.math.BigDecimal;

public class Carrello {
    public static void main(String[] args) {
        //Test
        Prodotto firstProduct = new Prodotto("TV", "Televisione OLED", new BigDecimal("449.99"), new BigDecimal("22"));
        System.out.println(firstProduct);
    }
}