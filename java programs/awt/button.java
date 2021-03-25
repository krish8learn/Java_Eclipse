import java.awt.*;

public class button extends Component
{
	public static void main(String args[])
	{
		Frame frame = new Frame("java frame");
		Button b = new Button("click here");
		b.setBounds(300,200,50,100);
		frame.add(b);
		frame.resize(600,600);
		frame.setLayout(null);
		frame.setBackground(Color.blue);
		frame.setVisible(true);
	}
}