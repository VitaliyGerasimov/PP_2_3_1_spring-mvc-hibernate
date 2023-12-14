package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = carDao.getCars();
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
