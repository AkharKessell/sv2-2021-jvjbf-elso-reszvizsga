package cars;

public class Car {
    private String brand;
    private double engine;
    private Color colour;
    private int price;

    public Car(String brand, double engine, Color colour, int price) {
        this.brand = brand;
        this.engine = engine;
        this.colour = colour;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngine() {
        return engine;
    }

    public Color getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public void decreasePrice(int percent){
        this.price = (int)(this.price* (100d-percent)/100);
    }
}
