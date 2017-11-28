package ir.sharif.math.bp96.edu;

import java.io.*;
import java.util.Scanner;

public class Database {

    private String fileName;
    private PrintStream out;

    public Database(String fileName) {
        this.fileName = fileName;
    }

    public void initializeSaving() throws FileNotFoundException {
        out = new PrintStream(new FileOutputStream(fileName, true));
    }

    public void saveOperation(String op) {
        out.println(op);
    }

    public String[] loadAllOperations() {
        String[] primaryResult = new String[1000];
        int primaryResultCount = 0;

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(fileName));
        } catch (FileNotFoundException e) {
            return new String[0];
        }

        for(String l; scanner.hasNextLine(); ) {
            primaryResult[primaryResultCount++] = scanner.nextLine();
        }
        String[] result = new String[primaryResultCount];
        System.arraycopy(primaryResult, 0, result, 0, primaryResultCount);
        return result;
    }






}
