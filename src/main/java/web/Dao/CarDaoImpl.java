package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Black", 200));
        cars.add(new Car("Honda", "White", 350));
        cars.add(new Car("Ford", "Black", 126));
        cars.add(new Car("Chevrolet", "Red", 210));
        cars.add(new Car("BMW", "Orange", 320));
    }
    @Override
    public List<Car> getCars() {
        return cars;
    }
}
