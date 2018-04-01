import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TexFields extends JFrame 
						implements ActionListener
{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 200;
	
	public static final int NUMBER_OF_CHAR = 10;
	
	private JTextField name;
	
	public static void main(String[] args)
	{
		TexFields gui = new TexFields();
		gui.setVisible(true);
	}
	
	public TexFields()
	{
		super("Text Field Demonstration");
		setSize(WIDTH,HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new BorderLayout());
		namePanel.setBackground(Color.WHITE);
		
		name = new JTextField(NUMBER_OF_CHAR);
		namePanel.add(name,BorderLayout.SOUTH);
		JLabel nameLabel = new JLabel("Enter your name here:");
		namePanel.add(nameLabel,BorderLayout.CENTER);
		
		add(namePanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.BLUE);
		
		JButton actionButton = new JButton("Click me");
		actionButton.addActionListener(this);
		buttonPanel.add(actionButton);
		
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		buttonPanel.add(clearButton);
		
		add(buttonPanel);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String buttonString = e.getActionCommand();
		
		if(buttonString.equals("Click me"))
			name.setText("Hello " + name.getText());
		else if(buttonString.equals("Clear"))
			name.setText("");
		else
			System.out.println("Unexpected error.");
	}
}

