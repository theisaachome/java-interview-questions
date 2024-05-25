package com.isaachome.arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

interface MyList{
    void convert(String[] a);
    void replace(int idx);
    ArrayList<String> compact();
}
class InvalidStringException extends Exception{
    public InvalidStringException(String message) {
        super(message);
    }
}

class ArrayToList implements  MyList{

    List<String>  arrayToList = new ArrayList<>();
    @Override
    public void convert(String[] a) {
        if (a.length==0){
            try{
                throw new InvalidStringException("This is an invalid string");
            }
            catch(InvalidStringException e){System.out.println(e.getMessage());}
        }else{
            for(int i=0;i<a.length;i++){
                arrayToList.add(a[i]);
                System.out.println("I have added the string: " + a[i] + " at the index: " + i);
            }
        }


    }

    @Override
    public void replace(int idx) {
        // check idx is greater
        if(idx >=0 && idx <arrayToList.size()){
            System.out.println("I have replaced the string: " + arrayToList.get(idx) + " with a null string");
            arrayToList.set(idx,null);
        }
    }

    @Override
    public ArrayList<String> compact() {
        ArrayList<String> list =new ArrayList<>();
        for(String s:arrayToList){
            if(s !=null){
                list.add(s);
            }
        }
        return list;
    }
}
public class ListQuestion2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);

        int n = Integer.parseInt(sc.nextLine());
        String[] a = new String[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextLine();

        MyList obj = new ArrayToList();

        obj.convert(a);
        int x = rand.nextInt(n);
        for(int i = 0; i < x; i++)
            obj.replace(rand.nextInt(n));


        ArrayList<String> s = obj.compact();



        for (int i = 0; i < s.size(); i++){
            if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
                try{
                    throw new InvalidStringException("This is an invalid string");
                }
                catch(InvalidStringException e){System.out.println(e.getMessage());}
            }
        }

    }
}
