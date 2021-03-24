package collection.serialization;
import java.util.*;
import java.io.*;
public class Serialization2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(111,"ratan"));
		al.add(new Employee(15,"subhashis"));
		al.add(new Employee(5,"sayak"));
		al.add(new Employee(22,"avishek"));
		al.add(new Employee(17,"krish"));
		al.add(new Employee(14,"avik"));

		
		//serialization
		FileOutputStream fos = new FileOutputStream("alabc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("serialization completed");
		
		//deserialization
		FileInputStream fis = new FileInputStream("alabc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	    @SuppressWarnings("unchecked")
		ArrayList<Employee>obj = (ArrayList<Employee>) ois.readObject();
		for(Employee e : obj)
		{
			System.out.println(e.empid+","+e.ename);
		}
		System.out.println("Deserialization complete");
		ois.close();
	}

}
