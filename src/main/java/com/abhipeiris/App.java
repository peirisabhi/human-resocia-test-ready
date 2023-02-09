package com.abhipeiris;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

//        System.out.println("calles");
//        String[] lines = getStdin();
//        for (int i = 0, l = lines.length; i < l; i++) {
//
//        }


        t11("2 -1 3");
    }

    private static String[] getStdin() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines.toArray(new String[lines.size()]);
    }

    public static void t1(String output){
        int i = 1;
        System.out.println(output);
        if(output != null && output != "") {
            if (i == 0) {
                int n = Integer.parseInt(output.trim());
                if ((2 <= n) & (n <= 100000)){
                    System.out.println("okkk");
                }
            }else if( 1 == 1){
                String[] iis = output.split(" ");
                for (String ii : iis){
                    int iiVal = Integer.parseInt(ii);
                    if ((-1000000000 <= iiVal) & (iiVal <= 1000000000)){
                        System.out.println("okkk");

                    }
                }
            }
        }
    }



    public static void t11(String output){
        String[] iis = output.split(" ");
        int size = iis.length;
        int [] arr = new int [size];
        for(int i1=0; i1<size; i1++) {
            arr[i1] = Integer.parseInt(iis[i1]);
        }

        int max = arr[0];
        int index = 0;
        for (int i2 = 0; i2 < arr.length; i2++){
            if (max < arr[i2]){
                max = arr[i2];
                index = i2;
            }
        }

        for(int count = index; count >= 0; count--){
            System.out.println(max);
        }
    }
}
