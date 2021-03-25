import java.awt.*;
public class checkbox
{
	public static void main(String args[])
	{
		Frame f= new Frame("frame with checkbox");
		Checkbox b1 = new Checkbox("C");
		Checkbox b2 = new Checkbox("java");
		b1.setBounds(100,200,100,100);
		b2.setBounds(200,100,50,50);
		f.setBackground(Color.cyan);
		f.setSize(500,500);
		f.setLayout(null);
		f.add(b1);
		f.add(b2);
		f.show();
	}
}
	