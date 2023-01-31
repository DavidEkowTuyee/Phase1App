package com;

import java.io.File;
import java.util.Scanner;

public class delFile extends switchStatements {

    public void delFileDisplay() {
        Scanner myFile = new Scanner(System.in);

        System.out.println("What is the name of file");
        String fileName = myFile.next();

        File fileDel = new File("."+File.separator+fileName);
        try{
            if (fileDel.delete()) {
                System.out.println("Deleted the file :" + fileDel.getName());
            } else {
                System.out.println(fileName + " not found");
            }
        } catch (Exception e) {
               // System.out.println("Something went wrong: " + e);
                e.printStackTrace();
           }
       }

}