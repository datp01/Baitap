package Test.baitap;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

