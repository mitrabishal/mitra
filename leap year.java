/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		Scanner s= new Scanner(System.in);
		i=s.nextInt();
		if (i%4==0)
		System.out.println("It is a The leap year");
		else
		System.out.println("It is not a leap year");
	}
}