package section3_Bean_overview.material;

public class CarFactory {
    private static Car car = new Car();

    private CarFactory() {
    }

    public Car createCarInstance() {
        return car;
    }
}