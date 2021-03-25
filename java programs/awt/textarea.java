import java.awt.*;
public class textarea
{
	public static void main(String arg[])
	{
		Frame f = new Frame("krish");
		TextArea area = new TextArea ("start typing here");
		f.setSize(600,600);
		f.setBackground(Color.blue);
		area.setBounds(10,30,200,200);
		f.add(area);
		f.setLayout(null);
		f.setVisible(true);
	}
}
