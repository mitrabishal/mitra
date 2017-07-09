import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x1,x2,x3;
	int large;
	Scanner s= new Scanner(System.in);
	System.out.println("x1:");
	x1=s.nextInt();
	System.out.println("x2:");
	x2=s.nextInt();
	System.out.println("x3:);
	x3=s.nextInt();
	large=x1;
	if (x2>large)
	large=x2;
	if (x3>large)
	large=x3;
	System.out.println("largest number  " +large);
	}
}