import OOAD.CheckOut;
import OOAD.Headphones;
import OOAD.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        CheckOut checkOut = new CheckOut(inventory);

        inventory.addHeadphone("900056","WH-1000XM4", "Sony",426.00,true,"Industry-leading noise canceling with Dual Noise Sensor technology");
        inventory.addHeadphone("900100","Buds Lux ANC", "Jlab",119.00,true,"IMMERSIVE LAB QUALITY SOUND,SMART ANC AND BE AWARE MODE,CLOUD FOAM COMFORT,CUSTOMIZE YOUR SOUND + EXPERIENCE VIA JLAB APP");
        inventory.addHeadphone("90021","Bluetooth Headphones Over Ear","BERIBES",36.00,false,"65H Playtime and 6 EQ Modes Wireless Headphones with Microphone,Immersive Bass,HiFi Stereo,Foldable Lightweight Headset");
        inventory.addHeadphone("90089","Tune 510BT","JBL",50.99,false,"The Tune 510BT wireless headphones feature renowned JBL Pure Bass sound, which can be found in the most famous venues all around the world.");

        System.out.println("Welcome to POS System.Please select any headphones from our inventory");
        inventory.showInventory();
        checkOut.scanHeadphones();


    }
}