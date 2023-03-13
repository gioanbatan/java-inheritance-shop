package shop;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.Objects;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {



        //Test
        Prodotto firstProduct = new Prodotto("TV", "Televisione OLED", new BigDecimal("449.99"), new BigDecimal("22"));
        System.out.println(firstProduct);

        Scanner scan = new Scanner(System.in);

        // Data
        Prodotto[] cart = new Prodotto[];

        cart[0] = firstProduct;

        // Intro
        System.out.println("Ciao! Inserisci " + cart.length + " prodotti nel carrello:");
        System.out.println();

        for (int i = 0; i < cart.length; i++) {
            // Variables
            int productType;
            String productName;
            String productDescription;
            String productPrice;
            String productVat;


            // Selezionare il tipo di prodotto
            System.out.println("Seleziona un prodotto: ");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Televisore");
            System.out.println("3 - Cuffie");
            rowLine();

            productType = Integer.parseInt(scan.nextLine());

            // Inserire il nome del prodotto
            System.out.println("Come si chiama il prodotto?");

            productName = scan.nextLine();

            // Inserire la descrizione
            System.out.println("Inserisci una descrizione per " + productName + " :");

            productDescription = scan.nextLine();

            // Inserire il prezzo
            System.out.println("Inserisci il prezzo di " + productName + " :");

            productPrice = scan.nextLine();

            // Inserire l'iva
            System.out.println("Inserisci l'iva (default 22%) :");

            productVat = scan.nextLine();

            if (productVat.equals("")) {
                productVat = "22";
            }

            // Se [tipo di prodotto] inserire i dati custom
            switch (productType) {
                case 1: {
                    int imeiCode;
                    int ramQty;

                    // Inserire il codice IMEI
                    System.out.println("Inserisci il codice IMEI (15 cifre) dello smartphone:");

                    imeiCode = Integer.parseInt(scan.nextLine());

                    // Inserire la quantità di ram
                    System.out.println("Inserisci la quantità di ram dello smarphone:");

                    ramQty = Integer.parseInt(scan.nextLine());

                    Smartphone smartphone = new Smartphone (productName, productDescription, new BigDecimal(productPrice), new BigDecimal(productVat), imeiCode, ramQty);

                    cart[i] = smartphone;
                    break;
                }

                case 2: {
                    double sizeX;
                    double sizeY;
                    double sizeZ;
                    int screenSize;
                    boolean isSmart;

                    // Inserire le dimensioni
                    System.out.println("Inserisci la larghezza del televisore:");
                    sizeX = Double.parseDouble(scan.nextLine());

                    System.out.println("Inserisci l'altezza del televisore:");
                    sizeY = Double.parseDouble(scan.nextLine());

                    System.out.println("Inserisci la profondità del televisore:");
                    sizeZ = Double.parseDouble(scan.nextLine());

                    System.out.println("Inserisci la dimensione in pollici della diagonale dello schermo:");
                    screenSize = Integer.parseInt(scan.nextLine());

                    // Seleziona se il televisore è smart
                    System.out.println("Il televisore è smart (1 = si, 2 = no)?");
                    if (Integer.parseInt(scan.nextLine()) == 1) {
                        isSmart = true;
                    } else {
                        isSmart = false;
                    }

                    Televisore tv = new Televisore (productName, productDescription, new BigDecimal(productPrice), new BigDecimal(productVat), sizeX, sizeY, sizeZ, screenSize, isSmart);

                    cart[i] = tv;
                    break;
                }

                case 3: {
                    String headsetColor;
                    boolean isWireless;

                    // Inserire il colore delle cuffie
                    System.out.println("Di che colore sono le cuffie?");
                    headsetColor = scan.nextLine();

                    // Seleziona se le cuffie sono wireless
                    System.out.println("Le cuffie sono wireless (1 = si, 2 = no)?");
                    if (Integer.parseInt(scan.nextLine()) == 1) {
                        isWireless = true;
                    } else {
                        isWireless = false;
                    }

                    Cuffie headset = new Cuffie (productName, productDescription, new BigDecimal(productPrice), new BigDecimal(productVat), headsetColor, isWireless);

                    cart[i] = headset;
                    break;
                }

                default: {
                    System.out.println("errore");
                }
            }

            // Creare nuovo oggetto
            cart[i] = new Prodotto (productName, productDescription, new BigDecimal(productPrice), new BigDecimal(productVat));

        }

        rowLine();

        System.out.println("Il contenuto del tuo carrello è:");

        for (int i = 0; i < cart.length; i++) {
            System.out.println(cart[i]);
        }

        rowLine();
    }

    public static void rowLine() {
        System.out.println("-------------------------------------------");
        System.out.println();
    }
}