//inheritance parent class//
import java.util.*;
class Person
{
	String name;
	Date dob;
	int mobileNo;
	void readData(String n,Date d,int m)
	{
		name = n;
		dob = d;
    	mobileNo = m;
	}
	void printData()
	{
		System.out.println("Name : "+ name);
		//dobprintDate();
		System.out.println("mobileNo :"+ mobileNo);
	}
}

//creating child class//
class students extends Person
{
	String institution;
	int qualif[] = new int[10];
	int rollNo;
	int marks[] = new int [5];
	
	void printBioData()
	{
		printdata();
		System.out.println("Institution :"+ institution);
		System.out.println("Roll no :"+ rollNo);
		for(int q=0;q<qualif.length;q++)
		{
			System.out.println("marks "+q+":"+qualif[q]);
		}
		for(int m=0;m<marks.length;m++)
		{
			System.out.println("marks "+m+":"+marks[m]);
		}
	}
}

//creating another child class//
class employee extends Person
{
	int empno;
	int salaryhis[] = new int [12];
	String organization;
	String designation;
	Date doj;
	void printdata()
	{
		for(int s =0;s<salaryhis.length;s++)
		{
			System.out.println("salary"+s+":"+salaryhis[s]);
		}
	}
}

//main class//
class inheritance1
{
	public static void main(String args[])
	{
		Person p = new Person();
		students s = new students();
		employee e = new employee();
	}
}

	