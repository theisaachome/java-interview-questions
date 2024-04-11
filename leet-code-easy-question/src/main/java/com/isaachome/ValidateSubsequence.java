package com.isaachome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
//        List<Integer> list= new

//       boolean result=  isSubSequence("axc","abbcdefg");
        boolean result= isSubSequenceWithInteger3( Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),Arrays.asList(1, 6, -1, 10));
        System.out.println(result);

    }
    public static boolean isSubSequence(String s, String t){
        if(s.isEmpty())return true;
        int s_pointer = 0;
        int t_pointer = 0;
        while (t_pointer < t.length() ){
            if(t.charAt(t_pointer)== s.charAt(s_pointer)){
                s_pointer++;
                if (s_pointer == s.length())return  true;
            }
            t_pointer++;
        }
        return  false;
    }
    public  static  boolean isSubSequenceWithInteger(List<Integer> array, List<Integer> sequence){
         int a_pointer=0;
         int s_pointer=0;
         while (a_pointer < array.size() && s_pointer < sequence.size()){

             if(array.get(a_pointer) == sequence.get(s_pointer)){
                 s_pointer++;
                 if(s_pointer== sequence.size())return true;
             }
             a_pointer++;
         }
        return  false;
    }
    public  static  boolean isSubSequenceWithInteger2(List<Integer> array, List<Integer> sequence){

        int s_pointer=0;
        for(int a:array){
            if(a== sequence.get(s_pointer)){
                s_pointer++;
                if (s_pointer== sequence.size()) return  true;
            }
        }
        return  false;
    }
    public  static  boolean isSubSequenceWithInteger3(List<Integer> array, List<Integer> sequence){

        int index=0;
        for(int i=0;i< array.size(); i++){
            if(array.get(i)==sequence.get(index)){
                index++;
            }
            if(index==sequence.size())return true;
        }
        return false;

    }

}
