

public class Circle {

    protected double radius;
    protected double x;
    protected double y;

    public Circle() {
        radius = 1.0;
        x = 0.0;
        y = 0.0;
    }

    public Circle(double r) {
        radius = r;
        x = 0.0;
        y = 0.0;
    }

    public Circle(double r, double ex, double why) {
        radius = r;
        x = ex;
        y = why;
    }

    public double getRadius() {
        return radius;
    }

    public double[] getCenter() {
        return new double[]{x, y};
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean isBiggerThan(Circle other) {
        return this.getArea() > other.getArea();
    }

    public boolean containsPoint(double px, double py) {
        double distanceSquared = (px - x) * (px - x) + (py - y) * (py - y);
        return distanceSquared <= radius * radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setCenter(double ex, double why) {
        x = ex;
        y = why;
    }

    @Override
    public String toString() {
        return "This circle is centered at point (" + x + ", " + y + ") with radius " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.getArea(), getArea()) == 0;
    }
}
