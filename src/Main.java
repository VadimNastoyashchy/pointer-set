public class Main {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        carManager.createNewCar("DODGE", "Charger", BodyType.COUPE, CarColor.BLACK,
                WheelsType.SUMMER, 21);
        carManager.createNewCar("TOYOTA", "Tahoe", BodyType.SUV, CarColor.BLUE,
                WheelsType.WINTER, 16);
        carManager.createNewCar("BUICK", "El mina", BodyType.SEDAN, CarColor.GREEN,
                WheelsType.SUMMER, 17);
        carManager.createNewCar("AUDI", "A 4", BodyType.SEDAN, CarColor.WHITE,
                WheelsType.SUMMER, 16);
        carManager.createNewCar("BMW", "740i", BodyType.SEDAN, CarColor.BLACK,
                WheelsType.WINTER, 17);

        carManager.changeWheelsTypeInputBodyColorAndWheelsDiameter();
        carManager.removeCarInputWheelsDiameter();
        carManager.carSearchInputWheelsTypeAndWheelsDiameter();
    }
}
