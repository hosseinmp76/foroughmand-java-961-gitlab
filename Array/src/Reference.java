public class Reference {

    public static void main(String[] args) {
//
//        Robot r1 = new Robot(10),
//                r2 = new Robot(10);
//
//        System.out.println("R1 == R2 " + (r1 == r2) + " R1.equals" +
//                "(r2) " + r1.equals(r2));
//
////        r1 = r2;
////
////        r2.setNumber(3);
////
////        System.out.println("R1.number=" + r1.getNumber());
////
//        System.out.println("R1: " + r1 + " R2: " + r2);
//
//        String s = "Hello!";
//        String s2 = s;
//        String s3 = s2.replace('l', 'x');
//
//        System.out.println("S2 = " + s2);
//
//        System.out.println("r1.equals(null)? " + r1.equals(null));

        Robot r = new Robot(20);
        int x = 20;

        System.out.println("r=" + r.toString() + " x=" + x);
        r.changeInteger(x);
        r.changeRobot(r);
        System.out.println("r=" + r.toString() + " x=" + x);


        Robot r2 = r.getNewNextRobot();

        r2.changeRobot(new Robot(2));


    }
}
