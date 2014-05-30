import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LevelOneFrame extends JFrame
{
	public LevelOneFrame()
	{
		setTitle("Type for Your Life");
		setSize(1024,768);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("Level_1.jpg"));
		add(background);
	}
	
	
}
