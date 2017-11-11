public class Circle {

    double radius;
    double centerX;
    double centerY;

    void setProperties(double r, double x, double y) {
        radius = r;
        centerX = x;
        centerY = y;
    }

    void setRadius(double r) {
        radius = r;
    }

    void printProperties() {
        System.out.println("I am a circle at (" + centerX + "," +
                centerY + ") with radius " + radius);
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

}
