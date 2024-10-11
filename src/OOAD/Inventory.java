package OOAD;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Headphones> headphones;

    public Inventory() {
        headphones = new ArrayList<>();
    }

    public void addHeadphone(String serialNumber, String model, String brand, double price, boolean isNoiseCancelling, String description) {
        Headphones headphone = new Headphones(serialNumber, model, brand, price, isNoiseCancelling, description);
        headphones.add(headphone);
        System.out.println("Added headphone: " + headphone);
    }

    public void showInventory() {
        for (Headphones headphone : headphones) {
            System.out.println(headphone);
        }
    }

    public Headphones findHeadphoneBySerial(String serialNumber) {
        for (Headphones headphone : headphones) {



            if (headphone.getSerialNumber().equals(serialNumber)) {
                return headphone;

            }
        }
        return null;
    }}

