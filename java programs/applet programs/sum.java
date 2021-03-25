import java.awt.*;
import java.applet.*;

public class sum extends Applet
{
	TextField t1,t2;
	public void init()
	{
	t1= new TextField(4);
	t2 = new TextField(4);
	add(t1);
	add(t2);
	t1.setText("0");
	t2.setText("0");
	}
	public void paint(Graphics g)
	{
		int x = 0, y= 0, z = 0;
		String s1,s2,s;
		g.drawString("enter values in the boxes",30,60);
		try
		{
		 s1=t1.getText();
		 x=Integer.parseInt(s1);
		 s2=t2.getText();
		 y=Integer.parseInt(s2);
		}
		catch(Exception ex){}
		
			z=x+y;
			s=String.valueOf(z);
			g.drawString("the sum is ",30,90);
			g.drawString(s,50,140);
		
	}
	//public boolean action(Event event,Object object)
	//{
		//repaint();
		//return true;
	//}
}

/*
<html>
  <body>
     <applet width="400" height="200" align="bottom" codebase="." code="sum.class">
	 </applet>
   </body>
</html>
*/