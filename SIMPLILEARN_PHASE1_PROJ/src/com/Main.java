

package com;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws Exception {
        //Welcome message
        System.out.println("*=================================================================================*");
        System.out.println("*=======                            LOCKEDME                             =========*");
        System.out.println("*=======                                                                 =========*");
        System.out.println("*=======                                                                 =========*");
        System.out.println("*=======                       DEVELOPER:David Ekow Tuyee                =========*");
        System.out.println("*=======                            VODAFONE GHANA                       =========*");
        System.out.println("*=================================================================================*");
        System.out.println();
        System.out.println("*********** INSTRUCTIONS ***********");
        System.out.println("This is a file operations and management application.");
        System.out.println("Users can execute the following operations by inputting the right options");
        System.out.println("Options include typing the number/name associated with an operation");
        System.out.println();

        


        Boolean showmenu = true;



        do {
        	mainMenu mm = new mainMenu();
            mm.displayOptions();
            Scanner options = new Scanner(System.in);

            try {
                if(options.hasNextInt()) {
                    int num = options.nextInt();
                    switchStatements myOperation = new switchStatements();
                    myOperation.switchOption(num);
                }else {
                    System.out.println("Invalid input");
                    System.out.println("Please type 1, 2 or 3 to select options above");
                }
            }catch(NumberFormatException e){
                e.printStackTrace();
            };
            ;


        } while (showmenu==true);


   }
}



