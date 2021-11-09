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

    public List<Car> getCarsForSell() {
        return this.cars;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= this.maxPrice) {
            this.cars.add(car);
            return true;
        } else {
            return false;
        }
    }

    public int sumCarPrice() {
        int sum = 0;
        for (Car car : this.cars) {
            sum += car.getPrice();
        }
        return sum;
    }

    int numberOfCarsCheaperThan(int price) {
        int num = 0;
        for (Car car : this.cars) {
            if (car.getPrice() <= price) {
                num++;
            }
        }
        return num;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> found = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getBrand().equals(brand)) {
                found.add(car);
            }
        }
        return found;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxPrice() {
        return this.maxPrice;
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
