package OOAD;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {


    Inventory inventory = new Inventory();
    Scanner input = new Scanner(System.in);
    ArrayList<Headphones> selectedHeadphones;

    public CheckOut(Inventory inventory) {
        selectedHeadphones = new ArrayList<>();
        this.inventory = inventory;
    }

    public void paymentByCash(double amount){
        System.out.printf("You owe us: $%.2f\n",amount);
        double givenAmount = input.nextDouble();


            if (givenAmount == amount) {
                System.out.println("Thank you for shopping with us. Have a marvellous day!");
                System.out.printf("You paid:$%.2f", amount);

            }

            if (givenAmount > amount) {
                double remainder = givenAmount - amount;
                System.out.printf("Here's your change: %.2f\n" ,remainder);
                System.out.println("Thank you for shopping with us. Have a marvellous day!");
                System.out.printf("You paid:$%.2f", amount);


            }
            if(givenAmount < amount){
                double owedAmount = amount - givenAmount;
                System.out.printf("You still owe us $%.2f\n",owedAmount );
                paymentByCash(owedAmount);
            }


    }


    public void scanHeadphones(){
        String scannedHeadphones = "";
        double grandSubtotal = 0;
        double taxes = 0;
        double subtotal = 0;
        String[] products;

        while (!scannedHeadphones.equals("E")) {
            System.out.println("Enter the serial number of the headphones or enter E for Checking Out:");
            scannedHeadphones = input.next();

            if (scannedHeadphones.equals("E")) {

                break;
            }

            Headphones addedHeadphones = inventory.findHeadphoneBySerial(scannedHeadphones);
            if (addedHeadphones != null) {
                selectedHeadphones.add(addedHeadphones);
                double priceOfTheSelectedPrice = addedHeadphones.getPrice();
                String nameOfProduct = addedHeadphones.getModel();
                String description = addedHeadphones.getDescription();
                System.out.println("Added Product:"+ nameOfProduct);
                System.out.println("Description of " + nameOfProduct + ":" + description);



                System.out.printf("Your price before tax is $%.2f\n",priceOfTheSelectedPrice);
                 subtotal += priceOfTheSelectedPrice;


                double taxedPriceOfTheSelectedPrice = addedHeadphones.showSubtotal(priceOfTheSelectedPrice);
                System.out.printf("Your price after tax is $%.2f\n",taxedPriceOfTheSelectedPrice);

                grandSubtotal += taxedPriceOfTheSelectedPrice;
                taxes += taxedPriceOfTheSelectedPrice - priceOfTheSelectedPrice;

            } if(addedHeadphones == null) {
                System.out.println("We do not have  a product with this serial number:" + scannedHeadphones);
            }
        }

        System.out.printf("Your subtotal is $%.2f\n",subtotal);
        System.out.printf("Taxes:$%.2f\n",taxes);
        System.out.printf("Your grand subtotal is $%.2f\n",grandSubtotal);



        if(grandSubtotal!=0){
            System.out.println("How would you like to pay today(Cash[C])?");
            String paymentMethod = input.next().trim().toUpperCase();
            if (paymentMethod.equals("C")) {
                paymentByCash(grandSubtotal);
                System.out.println("You bought:\n");
                for (Headphones headphonee : selectedHeadphones) {
                    System.out.println(headphonee.getModel());
                }
            }
        }
        else{
            System.out.println("You do not owe us anything have a good day");
        }
    }
}
