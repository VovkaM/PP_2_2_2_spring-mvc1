package web.model;

import java.util.Objects;

public class Car {
    private String brand;
    private String color;
    private int series;

    public Car() {
    }

    public Car(String brand, String color, int series) {
        this.brand = brand;
        this.color = color;
        this.series = series;
    }

    public String getBrand() {

        return brand;
    }

    public String getColor() {

        return color;
    }

    public int getSeries() {

        return series;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setSeries(int series) {

        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, series);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", series=" + series +
                '}';
    }
}
