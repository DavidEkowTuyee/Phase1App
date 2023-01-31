package com;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;



public class switchStatements extends mainMenu{



    public void switchOption(int num) throws Exception{

        ArrayList al = new ArrayList<String>();
        switch (num) {

            case 1:
                System.out.println("Retrieved files in Ascending Order");
                File directory = new File(".");
                String ss[] = directory.list();
                Arrays.sort(ss);
//               System.out.println(ss.length);
                for (String s : ss) {
                   System.out.println(s);

                };

                break;
            case 2:
                System.out.println("File Operations");
                System.out.println("** Type \"add\" to Add File");
                System.out.println("** Type \"del\" to delete File");
                System.out.println("** Type \"search\" to delete File");
                System.out.println("** Type \"menu\" to return to Menu");
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                String fileOps = scanner.next().toLowerCase();

                if (fileOps.equals("add")){
                    addFile addr = new addFile();
                    addr.addFileDisplay();

                }else if (fileOps.equals("del")){
                       delFile delfile = new delFile();
                       delfile.delFileDisplay();
                }
                else if (fileOps.equals("search")){
                     searchFile sfile = new searchFile();
                     sfile.searchDisplay();
                }
                else if (fileOps.equals("menu")){
                    System.out.println();
                    System.out.println("Returning to main menu");
                    break;
                } else{
                    System.out.println("You have selected the wrong option");
                }

                break;
            case 3:
                System.out.println("Good bye....");
                System.exit(0);
                break;

            default:
                System.out.println("Wrong block, Please select right option");
                break;
        }

    }

}
