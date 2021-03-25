import java.awt.*;
import java.applet.*;

public class lifecycle extends Applet
{
	StringBuffer strbuffer;
	
	void additem(String word)
	{
		System.out.println(word);
		strbuffer.append(word);
		repaint();
	}
	
	public void init()
	{
		strbuffer = new StringBuffer();
		additem("initializing the applet");
	}
	public void start()
	{
		additem("starting the applet");
	}
	public void stop()
	{
		additem("stopping the applet");
	}
	public void destroy()
	{
		additem("unloading the applet");
	}
	
	public void paint(Graphics g)
	{
		g.drawRect(0, 0,getWidth()-1,getHeight()-1); //drawing rectangle and showing strbuffer value inside it//
		g.drawString(strbuffer.toString(),10,20);
	}
}

/*
<html>
  <body>
     <applet width="200" height="200" codebase="." code="lifecycle.class">
	 </applet>
   </body>
</html>
*/	  