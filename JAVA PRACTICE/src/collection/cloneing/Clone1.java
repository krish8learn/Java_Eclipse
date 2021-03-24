package collection.cloneing;
import java.util.*;
import java.lang.*;
public class Clone1 implements Cloneable {
	int a = 10;
	int b =20;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Clone1 c1 = new Clone1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		Clone1 c2 = (Clone1)c1.clone();
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		
		//clone method does not create any object in memory rather its called the object from heap memory
	}

}
