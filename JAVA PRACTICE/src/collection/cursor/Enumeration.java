package collection.cursor;
import java.util.*;
import java.lang.*;
public class Enumeration {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Vector<String> ab = new java.util.Vector<String>();
		ab.add("syak");
		ab.add("avik");
		ab.add("krish");
		ab.add("liverpool");
		ab.add("chelsea");
		//normal version
		java.util.Enumeration<String> e =  ab.elements();
		while((e.hasMoreElements()))
		{
			String st = (String) e.nextElement();
			System.out.println(st);
		}
	}

	}

