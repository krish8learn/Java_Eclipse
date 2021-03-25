/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.lang.*;
import java.util.*;
public class removevowels
{
	public static void main(String[] args) 
	{
	    System.out.println("enter the string");
	    Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
	    int l = s.length();
	    String result="";
	    char ch;
	    for(int i = 0;i<l;i++)
	    {
	        ch=Character.toLowerCase(s.charAt(i));
	        if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
	        result= result+s.charAt(i);
	    }
	    System.out.println("resulting string is " +result);
	}
}
