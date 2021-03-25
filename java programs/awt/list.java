import java.awt.*;
public class list
{
	public static void main(String arg[])
	{
		Frame f = new Frame("krish");
		List l1 = new List (4);
		Choice c1 = new Choice();
		Scrollbar h = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
		Scrollbar v = new Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
		h.setBounds(100,50,300,50);
		v.setBounds(100,200,50,300);
		l1.setBounds(100,100,80,80);
		l1.add("item 1");
		l1.add("item 2");
		l1.add("item 3");
		f.setSize(600,600);
		f.setBackground(Color.blue);
		f.add(l1);
		f.add(c1);
		f.add(h);
		f.add(v);
		f.setLayout(null);
		f.setVisible(true);
	}
}
