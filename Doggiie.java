package aaaa;
import java.util.Scanner;

public class Dog {
	private
		int age;
	    String name;
	    String colour;
	public int setage(int a)
	{
		age=a;
		return age;
		//System.out.println("size of the dog ="+a);
	}
	public String setname(String b)
	{	
		name=b;
		return b;
		//System.out.println("name of the dog ="+name);
	}
	public String setcolour(String c)
	{
		colour=c;
		return colour;
		//System.out.println("colour of the dog ="+colour);
	}
}
class Pug extends Dog
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the dog");
		String x=sc.nextLine();
		Pug p=new Pug();
		String m=p.setname(x);
		
		System.out.println("Enter colour of the dog");
		String y=sc.nextLine();
		String n=p.setcolour(y);
		
		
		System.out.println("Enter the age of the dog");
		int z=sc.nextInt();
		int o=p.setage(z);
		
		System.out.print("Doggie "+m+ " is of " + n + " colour and  " + o + " years old.");
				
	}
	
}
