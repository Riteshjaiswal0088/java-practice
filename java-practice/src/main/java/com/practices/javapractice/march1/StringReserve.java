package com.practices.javapractice.march1;

public class StringReserve {

    // java program to reverse a word
    public static void main(String[] args) {
        String original = "Ritesh";
        String nstr = getString(original);
        System.out.println("Original word: " + original);
        System.out.println("Reversed word: " + nstr);
        System.out.println("StringBuffer: "+getStringBuffer("Hemant"));
        System.out.println("toCharArray: "+getString1("Ritesh"));
        System.out.println("StringBuilder: "+reverseString("Ritesh"));
    }

    private static String getString(String str) {
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        return nstr;
    }
    private static String getString1(String str) {
        String nstr = "";
        char[] chars = str.toCharArray();
        for (char c : chars) {     //for(T c:array/collection)
            nstr = c+nstr;
        }
        return nstr;
    }
    private static String getStringBuffer(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    private static String reverseString(String str) {
       final StringBuilder sb = new StringBuilder();//StringBuffer
        for (int i = str.length() - 1; i >= 0; i--) {  //for(initialization;condition;--/++)
           char ch = str.charAt(i); //extracts each character
            //Ritesh
            sb.append(ch);//hsetiR
        }
        return sb.toString();
    }

}

//Contributed by Tiyasa
