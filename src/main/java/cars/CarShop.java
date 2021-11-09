package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int maxFloorPrice) {
        this.name = name;
        this.maxPrice = maxFloorPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= this.maxPrice) {
            this.cars.add(car);
            return true;
        } else {
            return false;
        }
    }
    public int sumCarPrice(){
        int sum = 0;
        for (Car car : cars){
            sum += car.getPrice();
        }
        return sum;
    }

    int numberOfCarsCheaperThan(int price) {
        int num = 0;
        for (Car car : cars) {
            if (car.getPrice() <= price) {
                num++;
            }
        }
        return num;
    }
    public List<Car> carsWithBrand(String brand){
        List<Car> found = new ArrayList<>();
        for (Car car : cars){
            if(car.getBrand().equals(brand)){
                found.add(car);
            }
        }
        return found;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCars() {
        return cars;
    }
}
