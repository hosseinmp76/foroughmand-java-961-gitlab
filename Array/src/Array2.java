public class Array2 {

    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {3, 1, 2},
                {2, 3, 1, 5},
        };

        System.out.println(a[0][1]);

        int[] b = new int[10];
        System.out.println("b[100] = " + b[100]);

        a[0] = b;

        a[1] = a[2];


        int[][][] c = new int[5][2][1];
        int[][][] d = {
                {
                        {1, 2},
                        {2, 1}
                },
                {
                        {5, 3, 7},
                        {2, 5, 3, 4}
                }
        };

    }
}
