package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServicelmpl implements CarService {
    private CarDao carDao;

    @Autowired
    public CarServicelmpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarListOnCount(int count) {
        return (count >= 5) ? carDao.getCars() : carDao.getCars().stream().limit(count).toList();
    }
}
