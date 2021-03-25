/*applet program without Java*/
import java.applet.Applet;
import java.awt.Graphics;
public class demo1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("2nd Java applet program without html" ,600,600);
	}
}
/*
<applet code="demo1.class" width="800" height="800">
</applet>
*/