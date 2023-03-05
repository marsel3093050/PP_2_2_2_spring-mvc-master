package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository

public class CarDaoImp implements CarDao {
    private static final List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Civic", 2018));
        carList.add(new Car("Tesla", "Model S", 2022));
        carList.add(new Car("Lada", "Niva", 2010));
        carList.add(new Car("Uaz", "Patriot", 2015));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
