package com.isaachome.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class JavaPlayground {
    public static void main(String[] args) {
        System.out.print(findSize(new ArrayList<>()).size());
        System.out.print("-");
        System.out.print(findSize(new HashSet<>()).size());
        System.out.println("++++++++");

        HashSet<User> users = new HashSet<>();
        users.add(new User("A"));
        users.add(new User("B"));
        users.add(new User("A"));
        System.out.println(users.size());
    }
    public  static Collection<String> findSize(Collection<String> collection){
        collection.add("A");
        collection.add("B");
        collection.add("A");
        return  collection;
    }
}

class  User{
    private  String name;
    User(String name){
        this.name=name;
    }
}