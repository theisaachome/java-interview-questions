package com.isaachome;

import com.isaachome.entity.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App<T> {
    public static void main( String[] args )
    {

     MyThread myThread = new MyThread();
     myThread.start();
     myThread.sum(10,20);
     Employee em = new Employee();
    }
}
class MyThread extends  Thread{
    public void sum(int a,int b){
        System.out.println(a+b);
    }
}