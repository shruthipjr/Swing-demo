import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class MenuDemo extends JFrame implements ActionListener
{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 300;
	
	private JPanel bluePanel;
	private JPanel whitePanel;
	private JPanel grayPanel;
	
	public static void main(String[] args)
	{
		MenuDemo gui = new MenuDemo();
		gui.setVisible(true);
	}
	
	public MenuDemo()
	{
		super("Menu Demonstration");
		setSize(WIDTH,HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,3));
		
		
		bluePanel = new JPanel();
		bluePanel.setBackground(Color.LIGHT_GRAY);
		add(bluePanel);
		
		whitePanel = new JPanel();
		whitePanel.setBackground(Color.LIGHT_GRAY);
		add(whitePanel);
		
		grayPanel = new JPanel();
		grayPanel.setBackground(Color.LIGHT_GRAY);
		add(grayPanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setLayout(new FlowLayout());
		
		JMenu colorMenu = new JMenu("Add Colors");
		
		JMenuItem blueChoice = new JMenuItem("Blue");
		blueChoice.addActionListener(this);
		colorMenu.add(blueChoice);
		
		JMenuItem whiteChoice = new JMenuItem("White");
		whiteChoice.addActionListener(this);
		colorMenu.add(whiteChoice);
		
		JMenuItem grayChoice = new JMenuItem("Gray");
		grayChoice.addActionListener(this);
		colorMenu.add(grayChoice);
		
		JMenuBar bar = new JMenuBar();
		bar.add(colorMenu);
		setJMenuBar(bar);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String buttonString = e.getActionCommand();
		
		if(buttonString.equals("Blue"))
			bluePanel.setBackground(Color.BLUE);
		else if(buttonString.equals("White"))
			whitePanel.setBackground(Color.WHITE);
		else if(buttonString.equals("Gray"))
			grayPanel.setBackground(Color.GRAY);
		else
			System.out.println("Unexpected error.");
	}
}
