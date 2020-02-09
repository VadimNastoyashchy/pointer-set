import java.util.Objects;

public class Wheels {
    private WheelsType wheelsType;
    private int wheelsDiameter;

    public Wheels(WheelsType wheelsType, int wheelsDiameter) {
        this.wheelsType = wheelsType;
        this.wheelsDiameter = wheelsDiameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheels wheels = (Wheels) o;
        return wheelsDiameter == wheels.wheelsDiameter &&
                wheelsType == wheels.wheelsType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelsType, wheelsDiameter);
    }

    public WheelsType getWheelsType() {
        return wheelsType;
    }

    public void setWheelsType(WheelsType wheelsType) {
        this.wheelsType = wheelsType;
    }

    public int getWheelsDiameter() {
        return wheelsDiameter;
    }

    public void setWheelsDiameter(int wheelsDiameter) {
        this.wheelsDiameter = wheelsDiameter;
    }
}
