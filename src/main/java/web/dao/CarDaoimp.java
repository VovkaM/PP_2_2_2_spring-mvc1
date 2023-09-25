package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoimp implements CarDao {
        private final List<Car> cars;
        public CarDaoimp() {
            cars = new ArrayList<>();
            cars.add(new Car("BMW", "Black", 2));
            cars.add(new Car("Bmw", "Black",  3));
            cars.add(new Car("Mersedes", "Black",  4));
            cars.add(new Car("Lada", "Black",  3));
            cars.add(new Car("Hissan", "Black", 3));
            cars.add(new Car("Lada", "Black",  3));
            cars.add(new Car("Hissan", "Black", 3));
        }

    public List<Car> getCars() {

            return cars;
    }
}


