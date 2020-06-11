package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    public static List<Car> getCars() {
        final List<Car> cars_list_1 = new ArrayList<Car>();
        final List<Car> cars_list_2 = new ArrayList<Car>();
        final List<Car> cars_list_3 = new ArrayList<Car>();

        cars_list_1.add(new Car("BMW", "Engine_BMW", 1000L));
        cars_list_1.add(new Car("Audi", "Engine_Audi", 2000L));
        cars_list_1.add(new Car("Volvo", "Engine_Volvo", 3000L));

        cars_list_2.add(new Car("Lamborghini", "Engine_Lamborghini", 5000L));
        cars_list_2.add(new Car("Ferrari", "Engine_Ferrari", 7000L));
        cars_list_2.add(new Car("Bugatti", "Engine_Bugatti", 9000L));

        cars_list_3.add(new Car("Test_1", "Test_1", 1L));
        cars_list_3.add(new Car("Test_2", "Test_2", 2L));
        cars_list_3.add(new Car("Test_3", "Test_3", 3L));

        return cars_list_2;
    }
}
