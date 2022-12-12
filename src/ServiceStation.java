import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Callable;

public class ServiceStation {
    private final Queue<Car> cars = new ArrayDeque<>();

    private void add(Car car) {
        car.offer(car);
    }

    public void addPassengerCars(passengerCars passengerCars) {
        add(passengerCars);
    }

    public void addTruck(Trucks trucks) {
        add(trucks);
    }

    public void service() {
        if (!cars.isEmpty()) {
            Car car = cars.poll();
            boolean result = car.service();
            if (!result) {
                car.repair();
            }
            }
        }
    }
