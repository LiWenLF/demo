package com.faisco.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Thread.sleep(1000);
            int a = 1/0;
            System.out.println(a);
        } catch (Exception e) {
             System.out.println("thread is sleep");
        }
    }
}
