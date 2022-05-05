package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars(Integer count) {
        if (count != null) {
            return carRepository.findAll(count);
        }
        return carRepository.findAll();
    }
}
