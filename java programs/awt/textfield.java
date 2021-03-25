import java.awt.*;
public class textfield
{
	public static void main(String arg[])
	{
		Frame f = new Frame("frame with textfield");
		TextField t1 = new TextField("krish");
		TextField t2 = new TextField("knight");
		t1.setBounds(50,200,200,20);
		t2.setBounds(150,150,200,20);
		f.add(t1);
		f.add(t2);
		f.setSize(500,500);
		f.setBackground(Color.cyan);
		f.setVisible(true);
	}
}