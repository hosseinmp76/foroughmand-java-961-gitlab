package bp96;

import java.io.*;
import java.util.Scanner;

public class Copy {

    public static void main(String[] args) {

//        File here = new File("src");
//        System.out.println(here.getAbsolutePath() + " exists: " +here.exists() + " dir?:" + here.isDirectory());
//
        String srcFileName = "data/a.ostovar",
            dstFileName = "data/b.txt";

        try {
            FileInputStream fis = new FileInputStream(srcFileName);
            Scanner s = new Scanner(fis);
            PrintWriter pw = new PrintWriter(new FileOutputStream(dstFileName, true));

            for (; s.hasNextLine(); ) {
                String line = s.nextLine();
//                System.out.println("L: " + line);
                pw.println(line);
            }
            pw.close();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("File " + srcFileName + " does not exist.");
        }
    }
}
