package collection.sorting;

public class Emp1 implements Comparable<Emp1>{
	int eid;
	String ename;
	public Emp1(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	//@Override
	public int compareTo(Emp1 o) {
		// TODO Auto-generated method stub
		Emp1 p1 = (Emp1) o;
		if(eid == p1.eid)
		{
			return 0;
		}
		else if(eid>p1.eid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	


	/*@Override
	public int compareTo(Emp1 p2) {
		// TODO Auto-generated method stub
		return ename.compareTo(p2.ename);
	}*/
}
