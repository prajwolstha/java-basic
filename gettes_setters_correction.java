package javaPrajwol;

class Ccircle {
    private int radius;
    private double area;
    private double circumference;
    private final double pi = 22.0 / 7.0; // Use double for more precision

    public void setRadius(int r) {
        radius = r;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public void setArea(double a) {
        // No need to check for equality, just assign the value
        area = a;
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }

    public void setCircumference(double c) {
        // No need to check for equality, just assign the value
        circumference = c;
    }
}

public class GettersSetters {
    public static void main(String[] args) {

        Ccircle cr = new Ccircle();
        cr.setRadius(3);
        cr.setArea(27);
        System.out.println("Area: " + cr.getArea());
        cr.setCircumference(18);
        System.out.println("Circumference: " + cr.getCircumference());
    }
}

