package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarRepository {

    private static final List<Car> CARS = List.of(
            new Car(1, "series_1", "model_1"),
            new Car(2, "series_2", "model_2"),
            new Car(3, "series_3", "model_3"),
            new Car(4, "series_4", "model_4"),
            new Car(5, "series_5", "model_5")
    );

    public List<Car> findAll() {
        return CARS;
    }

    public List<Car> findAll(int count) {
        return CARS.stream().limit(count).toList();
    }
}
