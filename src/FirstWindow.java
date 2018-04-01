import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class FirstWindow extends JFrame {
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public FirstWindow(Color theColor) {
		super("No Charge for Color");
		setSize(WIDTH, HEIGHT);

		setTitle("First Window Class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setBackground(theColor);
		setLayout(new BorderLayout());

		// JButton endButton = new JButton("Click to end program.");
		// endButton.addActionListener(new EndingListener());

		JLabel greeting = new JLabel("First Label1");
		add(greeting, BorderLayout.NORTH);

		JLabel greeting2 = new JLabel("First Label2");
		add(greeting2, BorderLayout.SOUTH);

		JLabel greeting3 = new JLabel("First Label3");
		add(greeting3, BorderLayout.CENTER);

		JLabel greeting4 = new JLabel("First Label4");
		add(greeting4, BorderLayout.WEST);

		JLabel greeting5 = new JLabel("First Label5");
		add(greeting5, BorderLayout.EAST);

		// add(endButton);

	}

	public FirstWindow() {
		this(Color.BLUE);
	}
}