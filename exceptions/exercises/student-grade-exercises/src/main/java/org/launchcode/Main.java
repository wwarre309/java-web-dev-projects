package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        //Divide(10,2);
        //Divide(10, 0);


        // comment out Brad to check for points


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            int points = CheckFileExtension(fileName);
            System.out.println(student + ": " + points + " points");
        }
        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
         try {
             if (y == 0) {
                 throw new ArithmeticException("Can't Divide By 0 Dummy");
             }
             System.out.println(x/y);
    } catch (ArithmeticException e) {
             e.printStackTrace();
         }


        // Write code here!
    }

    public static int CheckFileExtension(String fileName){
        try {
        if (fileName == null || fileName.isEmpty()) {
        throw new Exception("File name is null or empty");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        // Write code here!
    }
}