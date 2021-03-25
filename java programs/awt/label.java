import java.awt.*;
public class label
{
	public static void main(String arg[])
	{
		Frame f = new Frame("frame with label");
	    Label l1 = new Label("1st label");
	    Label l2 = new Label("2nd label");
	    l1.setBounds(100,100,80,80);
	    l2.setBounds(100,150,80,80);
	    f.setSize(500,500);
	    f.setLayout(null);
	    f.setBackground(Color.green);
	    f.add(l1);
	    f.add(l2);
	    f.setVisible(true);
    }

}
	

