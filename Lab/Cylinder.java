package Test.baitap;

public class Cylinder extends Circle{
    private double  height;

    public double getHeight() {
        return height;
    }

    public Cylinder(double radius,String color,double height) {
        super(radius,color);
        this.height = height;
    }

    public Cylinder(double r) {
        super(r);
    }


     public double getVolume() {
        return super .getArea() % this.height;
     }
}
