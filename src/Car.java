import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    private String brand; // марка
    private String model; // модель
    private double engineVolume; // объём двигателя
    private List<Driver> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public Car(String brand, String model, double engineVolume) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public abstract void startMovement(); // начать движение

    public abstract void endMovement(); // закончить движение

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    public void offer(Car car) {
    }
}