public class Square {

    double topLeftX;
    double topLeftY;
    double width;

    void setProperties(double x, double y, double w) {
        topLeftX = x;
        topLeftY = y;
        width = w;
    }

    double getArea() {
        return width * width;
    }

    double getBottomRightX() {
        return topLeftX + width;
    }

    double getBottomRightY() {
        return topLeftY - width;
    }

    void setPropertiesBasedOnCenter(double cx, double cy, double w) {
        topLeftX = cx - w /2;
        topLeftY = cy + w/2;
        width = w;
    }

    double getCenterDistanceToPoint(double x, double y) {
        double cx = getCenterX(),
                cy = getCenterY();

        return Math.sqrt((cx-x)*(cx-x) + (cy-y) * (cy-y));
    }

    double getCenterX() {
        return topLeftX + width/2;
    }

    double getCenterY() {
        return topLeftY - width/2;
    }

    void printProperties() {
        System.out.println("Square with center (" + getCenterX() + "," +
            getCenterY() + "), width= " + width);
    }



}
