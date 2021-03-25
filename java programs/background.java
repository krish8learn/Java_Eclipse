import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class background extends Applet
{
	public void init()/*changing the background color*/
	{
		setBackground(Color.BLUE);
	}
	public void paint(Graphics g)
	{
		g.drawString("Applet Background example",100,50);
	}
}