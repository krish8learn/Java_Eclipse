package collection.sorting;

public class Product implements Comparable {
	int pid;
	String pname;
	int cost;
	public Product(int pid, String pname, int cost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Product p1 = (Product) o;
		if(pid == p1.pid)
		{
			return 0;
		}
		else if(pid>p1.pid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
