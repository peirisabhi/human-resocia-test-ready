package com.abhipeiris;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 04/02/2023
 * Time: 3:28 pm
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "123";

        System.out.println(reverse(str));
        System.out.println("str.length() --  " + str.length());
        String val ="";
        for(int x = str.length()-1; x >= 0; x--){
            System.out.println(str.charAt(x));
//            System.out.println(x);
            val += str.charAt(x);
        }
        System.out.println(val);
    }

    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }
}
