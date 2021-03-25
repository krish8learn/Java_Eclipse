import java.awt.*;

public class panel
{
	public static void main(String args[])
	{
		Panel panel = new Panel();
		panel.resize(100,100);
		panel.setBackground(Color.red);
		Frame frame = new Frame("java frame");
		frame.resize(400,400);
		frame.setBackground(Color.blue);
		frame.setLayout(null);
		frame.add(panel);
		frame.setVisible(true);
	}
}