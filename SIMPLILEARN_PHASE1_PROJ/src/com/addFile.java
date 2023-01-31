package com;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class addFile extends switchStatements {
    ArrayList al = new ArrayList<String>();
    public void addFileDisplay() throws Exception{
        Scanner myFile = new Scanner(System.in);
        System.out.println("What is the name of file");
        String fileName = myFile.next();

        File newFile = new File(fileName);
        if (newFile.exists()) {
            System.out.println("File: " + fileName + " already exist");
        } else {
            try {
                newFile.createNewFile();
                al.add(fileName);
                
                System.out.println(fileName + " has successfully been created " );
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e);
                e.printStackTrace();
            }
        }

    };
}