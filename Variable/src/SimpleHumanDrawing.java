public class SimpleHumanDrawing {

    Circle head;
    Square body;

    void setProperties(Circle h, Square b) {
        head = h;
        body = b;
    }

    void printYourself() {
        System.out.print("Head: ");
        head.printProperties();

        System.out.print("Body: ");
        body.printProperties();
    }
}
