import java.util.*;

public class CarManager {
    Set<Car> carSet = new LinkedHashSet<>();
    Scanner carScanner = new Scanner(System.in);

    public void createNewCar(String mark, String model, BodyType bodyType, CarColor carColor, WheelsType wheelsType,
                             int wheelsDiameter) {
        carSet.add(new Car(mark, model, bodyType, carColor, wheelsType, wheelsDiameter));
    }

    public void changeWheelsTypeInputBodyColorAndWheelsDiameter() {
        Iterator<Car> carIterator = carSet.iterator();
        System.out.println("Input body color:");
        String inputBodyColor = carScanner.nextLine();
        System.out.println("Input wheels diameter:");
        int inputWheelsDiameter = carScanner.nextInt();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getBody().getCarColor().toString().equals(inputBodyColor) &&
                    car.getWheels().getWheelsDiameter() == inputWheelsDiameter) {
                System.out.println("Input your wheel type:");
                WheelsType inputWheelsType = WheelsType.toEnum(carScanner.next());
                car.getWheels().setWheelsType(inputWheelsType);
            }
        }
    }

    public void removeCarInputWheelsDiameter() {
        Iterator<Car> carIterator = carSet.iterator();
        System.out.println("Input wheels diameter:");
        int inputWheelsDiameter = carScanner.nextInt();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getWheels().getWheelsDiameter() == inputWheelsDiameter) {
                carIterator.remove();
                System.out.println(car.getMark() + " " + "/remove");
            }
        }

    }

    public void carSearchInputWheelsTypeAndWheelsDiameter() {
        Iterator<Car> carIterator = carSet.iterator();
        System.out.println("Input wheels type:");
        WheelsType inputWheelsType = WheelsType.toEnum(carScanner.next());
        System.out.println("Input wheels diameter");
        int inputWheelsDiameter = carScanner.nextInt();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getWheels().getWheelsType() == inputWheelsType &&
                    car.getWheels().getWheelsDiameter() == inputWheelsDiameter) {
                System.out.println(car.getMark());
            }
        }
    }

}
