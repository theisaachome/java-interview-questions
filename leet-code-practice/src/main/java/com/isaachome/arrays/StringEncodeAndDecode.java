package com.isaachome.arrays;

import java.util.ArrayList;
import java.util.List;

public class StringEncodeAndDecode {
    public static void main(String[] args) {
        System.out.println(encode(new String[]{"neet","code","love","you"}));
        decode("4#neet4#code4#love3#you");
    }
    public  static  String encode(String []strings){
        StringBuilder encodedString = new StringBuilder();
        for(String s:strings){
            encodedString.append(s.length()).append("#").append(s);
        }
        return encodedString.toString();
    }

    public static List<String> decode(String str){
        List<String> list = new ArrayList<>();
        int i=0;
        while (i<str.length()){
            int j=i;
            // get a length to substring.
            while (str.charAt(j) !='#') j++;
            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}
