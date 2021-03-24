package collection.List;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Insert number of elements in array");
		int tel = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>(tel);
		//System.out.println("insert elements");
		for(int i =0;i<tel;i++)
		{
			al.add(sc.nextInt());
		}
		
		//System.out.println("insert query times");
		int queries = sc.nextInt();
		
		//System.out.println("insert query");
		
		for(int i=0;i<queries;i++)
		{
			String op = sc.next();
			if(op.contentEquals("Insert"))
			{
				int index = sc.nextInt();
				int element = sc.nextInt();
				al.set(index, element);
			}
			else if(op.contentEquals("Delete"))
			{
				int index = sc.nextInt();
				al.remove(index);
			}
		}
		
		System.out.println(al);
		sc.close();
				
	}

}
