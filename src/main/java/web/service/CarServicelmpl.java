package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Component
public class CarServicelmpl implements CarService {
    private CarDao carDao;
    @Autowired
    public CarServicelmpl(CarDao carDao) {

        this.carDao = carDao;
    }
    @Override
    public List<Car> GetTheNumberOfCars(int count) {
        return (count >= 5) ? carDao.GetaListOfCars() : carDao.GetaListOfCars().stream().limit(count).toList();
    }
}
