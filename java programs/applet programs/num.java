import java.awt.*;
import java.applet.*;

public class num extends Applet
{
	public void paint(Graphics g)
	{
		int v1=4,v2=4,sum;
		sum = v1+v2;
		String s =  "summation:" +String.valueOf(sum);
		g.drawString(s,100,100);
	}
}
/*
<html>
  <body>
     <applet width="400" height="400" codebase="." code="num.class">
	 </applet>
   </body>
</html>
*/	  