import java.util.Objects;

public class Car {
    private String mark;
    private String model;
    private Body body;
    private Wheels wheels;

    public Car(String mark, String model, BodyType bodyType, CarColor carColor, WheelsType wheelsType,
               int wheelsDiameter) {
        this.mark = mark;
        this.model = model;
        this.body = new Body(bodyType, carColor);
        this.wheels = new Wheels(wheelsType, wheelsDiameter);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(body, car.body) &&
                Objects.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, mark, body, wheels);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}
