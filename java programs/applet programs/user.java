import java.awt.*;
import java.applet.*;

public class user extends Applet
{
	TextField t1,t2,t3;
	public void init()
	{
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		add(t1);
		add(t2);
		add(t3);
		t1.setText("0");
		t2.setText("0");
		t3.setText("0");
	}
	
	public void paint(Graphics g)
	{
		String s,x;
		int a,b,c,r;
		g.drawString("enter 3 values",40,40);
		
		s=t1.getText();
		a=Integer.parseInt(s);
		s=t2.getText();
		b=Integer.parseInt(s);
		s=t3.getText();
		c=Integer.parseInt(s);
		
		if(a>b)
		{
			if(a>c)
				r=a;
			else
				r=c;
		}
		else
		{
			if(b>c)
				r=b;
			else
				r=c;
		}
		
		g.drawString("the largest number is ", 100,80);
		x= String.valueOf(r);
		g.drawString(x,140,80);
	}
	//public boolean action(Event e,Object o)
	{
		//repaint();
		//return true;
	}//
}



/*
<html>
  <body>
     <applet width="400" height="200" align="bottom" codebase="." code="user.class">
	 </applet>
   </body>
</html>
*/	  