 /* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	int x;
	x=s.nextInt();
	if(x>0)
	{
		System.out.println("The Number is Positive");
	}
	else if(x<0)
	{
		System.out.println("The Number Is Negative");
	}
	else
	{
		System.out.println("The Number is Zero");
	}
	}
}