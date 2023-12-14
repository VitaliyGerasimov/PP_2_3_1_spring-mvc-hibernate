package web.model;

public class Car {
    private String carBrand;
    private String color;
    private int enginePower;

    public Car(String carBrand, String color, int enginePower) {
        this.carBrand = carBrand;
        this.color = color;
        this.enginePower = enginePower;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", color='" + color + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
