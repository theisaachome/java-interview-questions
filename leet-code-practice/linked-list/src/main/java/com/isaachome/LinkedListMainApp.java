package com.isaachome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class LinkedListMainApp
{
    public static void main( String[] args )
    {
        try(BufferedReader bufferedReader= new BufferedReader( new InputStreamReader( System.in ) )){
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for( int i = 1; i <= 10; i++ ){
                int ans = N*i;
                System.out.printf("%d x %d = %d \n",N,i,ans);
            }
        }   catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( "Hello World!" );
    }
}
