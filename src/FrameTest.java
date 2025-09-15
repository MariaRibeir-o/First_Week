import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrameTest {
	private JFrame frame;

	public FrameTest() {
		frame = new JFrame("Test");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addFrameContent();
		frame.pack();
	}

	public void open() {
		frame.setVisible(true);
	}

	private void addFrameContent() {
		frame.setLayout(new GridLayout(2,2));
		JLabel label = new JLabel("label");
		frame.add(label);
		JTextField text = new JTextField("text");
		frame.add(text);
		JCheckBox check = new JCheckBox("check");
		frame.add(check);
		JButton button = new JButton("button");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, check.isSelected() ? 
						"selected" : "not selected");
			}
		});
		frame.add(button);	
	}

	public static void main(String[] args) {
		FrameTest window = new FrameTest();
		window.open();
	}
}
