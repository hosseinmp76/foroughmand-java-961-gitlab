public class TamrinOO {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setProperties(7.0, 10, 10);
        c1.setRadius(2.0);
        c1.setRadius(3.0);
        c1.setProperties(9, 2, 5);

        c1.printProperties();


        Circle c2 = new Circle();
        c2.setProperties(90, 70, 20);
        c2.printProperties();

        double a = c2.getArea();
        System.out.println("Area = " + a);

        Square s1 = new Square();
        s1.setPropertiesBasedOnCenter(0, 0, 10);
        double a2 = s1.getArea();

        System.out.println("Square area is: " + a2);

        SimpleHumanDrawing human1 = new SimpleHumanDrawing();
        human1.setProperties(c1, s1);
        human1.printYourself();

    }
}
