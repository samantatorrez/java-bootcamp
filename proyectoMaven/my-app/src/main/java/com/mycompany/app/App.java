package com.mycompany.app;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in= new Scanner(System.in);
		
		String name;
		
		System.out.println("name: ");
		
		name= in.next();
		
		System.out.println("Hello "+ name);
    }
}
