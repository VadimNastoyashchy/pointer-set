import java.util.Objects;

public class Body {
    private BodyType bodyType;
    private CarColor carColor;

    public Body(BodyType bodyType, CarColor carColor) {
        this.bodyType = bodyType;
        this.carColor = carColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return bodyType == body.bodyType &&
                carColor == body.carColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType, carColor);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }
}
