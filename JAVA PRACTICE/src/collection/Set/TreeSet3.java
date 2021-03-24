package collection.Set;
import java.util.*;
public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Games> l1 = new TreeSet<Games>(new Mycomp3());
		l1.add(new Games(12,"fifa","EA"));
		l1.add(new Games(14,"pes","konami"));
		l1.add(new Games(1,"NFS","ubisoft"));
		l1.add(new Games(2,"soccerhero","gameloft"));
		l1.add(new Games(12,"fifa","EA"));
		
		for(Games gg:l1)
		{
			System.out.println(gg.gid+","+gg.gname+","+gg.company);
		}
	}

}

class Mycomp3 implements Comparator<Games>
{

	@Override
	public int compare(Games o1, Games o2) {
		// TODO Auto-generated method stub
		return o1.gname.compareTo(o2.gname);
	}
	
}