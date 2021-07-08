package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int testSum(int a, int b){
        return a + b;
    }

    public String printMessage(String message){
        return message;
    }

    public boolean testIntArray(int[] a, int[] b){
        System.out.println("a eq b " + (a.length == b.length));
        return a.length == b.length;
    }

}
