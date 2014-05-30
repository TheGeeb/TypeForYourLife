import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreditsFrame extends JFrame
{
	private JTextField creditsField1;
	private JTextField creditsField2;
	private JTextField creditsField3;
	private JTextField creditsField4;
	private JPanel panel;
	
	public CreditsFrame()
	{
		setTitle("Credits");
		setSize(400,140);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		
		creditsField1 = new JTextField("Main Menu Background: http://www.igorslab.com/\n");
		creditsField2 = new JTextField("First Level Background: http://newsqueeze.wordpress.com/\n");
		creditsField3 = new JTextField("Second Level background: http://gamesbooth.blogspot.com/\n");
		creditsField4 = new JTextField("Third Level Background: http://www.gamesthirst.com/");
		
		creditsField1.setEditable(false);
		creditsField2.setEditable(false);
		creditsField3.setEditable(false);
		creditsField4.setEditable(false);
		
		panel.add(creditsField1);
		panel.add(creditsField2);
		panel.add(creditsField3);
		panel.add(creditsField4);
		
		add(panel);
	}
}
