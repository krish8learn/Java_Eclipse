package collection.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Games> l1 = new LinkedHashSet<Games>();
		l1.add(new Games(12,"fifa","EA"));
		l1.add(new Games(14,"pes","konami"));
		l1.add(new Games(1,"NFS","ubisoft"));
		l1.add(new Games(2,"soccerhero","gameloft"));
		l1.add(new Games(12,"fifa","EA"));
		
		Iterator<Games> it = l1.iterator();
		while(it.hasNext())
		{
			Games gg = it.next();
			if(gg.gid == 14 )
			{
				it.remove();
			}
			else if(gg.gname.equals("fifa"))
			{
				it.remove();
			}
			
			System.out.println();
			for(Games g :l1)
			{
				System.out.println(g.gid+","+g.gname+","+g.company);
			}
			
			System.out.println(gg.gid+","+gg.gname+","+gg.company);
		}
		System.out.println();
		for(Games g :l1)
		{
			System.out.println(g.gid+","+g.gname+","+g.company);
		}
	}

}
