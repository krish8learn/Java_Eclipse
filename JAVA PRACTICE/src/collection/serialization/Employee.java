package collection.serialization;
import java.io.*;
@SuppressWarnings("serial")
public class Employee implements Serializable {
	int empid;
	//transient String ename;
	String ename;
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}
}
