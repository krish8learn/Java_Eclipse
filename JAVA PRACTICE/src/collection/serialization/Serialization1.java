package collection.serialization;
import java.io.*;
public class Serialization1 {
	
	void serilizationDemo() throws IOException
	{
		Employee obj = new Employee(111,"ratan");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		System.out.println("serialization completed");
	}
	
	void deserialization() throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee obj =(Employee) ois.readObject();
		System.out.println(obj.empid+" "+obj.ename);
		System.out.println("deserialization completed");
		ois.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Serialization1 st = new Serialization1();
		st.serilizationDemo();
		st.deserialization();
	}

}
