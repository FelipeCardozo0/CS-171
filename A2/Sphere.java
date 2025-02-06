package HW.A2;

public class Sphere extends Circle {
    private double z;

    // Default constructor
    public Sphere() {
        super();
        this.z = 0.0;
    }

    // Constructor with parameters for x, y, z, and radius
    public Sphere(double x, double y, double z, double radius) {
        super(radius, x, y);
        this.z = z;
    }

    // Override getCenter to return 3D coordinates
    @Override
    public double[] getCenter() {
        return new double[]{this.x, this.y, this.z};
    }

    // Overload setCenter to accept x, y, z
    public void setCenter(double x, double y, double z) {
        super.setCenter(x, y);
        this.z = z;
    }

    // Override getArea to compute surface area of the sphere
    @Override
    public double getArea() {
        return 4 * super.getArea();
    }

    // Method to calculate volume of the sphere
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }
}
