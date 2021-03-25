import java.awt.*;
import java.applet.*;

public class sample extends Applet
{
	String msg;
	//setting foreground and background color//
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg = "inside init--";
	}
	//initializing the string to be displayed//
	public void start()
	{
		msg += "inside start--";
	}
	//display the msg in window//
	public void paint(Graphics g)
	{
		msg+="inside paint";
		g.drawString(msg,40,250);
	}
	
}
	