package HW.A2;

public class ShapeTester {

    public static boolean isLarger(Circle c, Rectangle r) {
        return c.getArea() >= r.getArea();
    }

    public static double longerPerim(Circle c, Rectangle r) {
        return Math.max(c.getCircumference(), r.getPerimeter());
    }

    public static double longerPerim(Rectangle r, Circle c) {
        return longerPerim(c, r);
    }

    public static double largerArea(Circle c, Rectangle r) {
        return Math.max(c.getArea(), r.getArea());
    }

    public static double largerArea(Rectangle r, Circle c) {
        return largerArea(c, r);
    }

    public static boolean containsCenter(Circle c1, Circle c2) {
        double[] center = c2.getCenter();
        return c1.containsPoint(center[0], center[1]);
    }
}
