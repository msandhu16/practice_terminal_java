package OOAD;
public class Headphones {


    private String serialNumber;
    private String model;
    private String brand;
    private double price;
    private boolean isNoiseCancelling;
    private String description;

    public Headphones(){

    }

    public Headphones(String serialNumber,String model, String brand,double price,boolean isNoiseCancelling,String description){
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.isNoiseCancelling = isNoiseCancelling;
        this.description = description;
    }



    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNoiseCancelling() {
        return isNoiseCancelling;
    }

    public void setNoiseCancelling(boolean noiseCancelling) {
        isNoiseCancelling = noiseCancelling;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double  showSubtotal(Double price){
        return price * 1.13;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", isNoiseCancelling=" + isNoiseCancelling +
                ", description='" + description + '\'' +
                '}';
    }
}   
