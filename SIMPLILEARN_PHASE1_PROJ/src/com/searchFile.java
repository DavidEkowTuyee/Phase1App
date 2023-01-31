package com;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class searchFile extends switchStatements{

    public void searchDisplay(){
        File directory = new File(".");
        String dd[] = directory.list();
        Arrays.sort(dd);

        System.out.println("Which file are you looking for");
        Scanner sf = new Scanner(System.in);
        String filesearch = sf.next();


//System.out.println("Search element "+Arrays.binarySearch(dd, filesearch));
int a = Arrays.binarySearch(dd,filesearch);

        if(a>=0) {
            System.out.println(filesearch + " is present");
        }else {
            System.out.println(filesearch + " cannot be found");
        };



        }
    }