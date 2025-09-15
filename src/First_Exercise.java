import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class First_Exercise {
	private JFrame frame;
	private String default_Width = "400";
	private String default_Height = "200";
	private String default_Title = "Default Title";

	public First_Exercise() {
		frame = new JFrame(default_Title);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addFrameContent();
		frame.pack();
	}

	public void open() {
		frame.setVisible(true);
	}

	private void addFrameContent() {
		frame.setLayout(new GridLayout(4, 2));
		JLabel title = new JLabel("title");
		frame.add(title);
		JTextField text = new JTextField(default_Title);
		frame.add(text);
		JLabel widthLabel = new JLabel("width");
		frame.add(widthLabel);
		JTextField width = new JTextField(default_Width);
		frame.add(width);
		JLabel heightLabel = new JLabel("height");
		frame.add(heightLabel);
		JTextField height = new JTextField(default_Height);
		frame.add(height);
		JCheckBox check = new JCheckBox("center");
		frame.add(check);
		JButton button = new JButton("update");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeTitle(text.getText());
				changeSize(width.getText(), height.getText());
				if (check.isSelected()) {
					setFrameLocationCenter();
				} else {
					resetFrameLocation();
				}
				;
			}
		});
		frame.add(button);
	}

	private void changeTitle(String title) {
		if (title == null) {
			frame.setTitle(default_Title);
		} else {
			frame.setTitle(title);
		}
	}

	private void changeSize(String x, String y) {
		try {
			Integer.parseInt(x);
		} catch (Exception ex) {
			x = default_Width;
		}
		try {
			Integer.parseInt(y);
		} catch (Exception ex) {
			y = default_Height;
		}
		frame.setSize(Integer.parseInt(x), Integer.parseInt(y));
	}

	private void setFrameLocationCenter() {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int posX = (dimension.width - frame.getHeight()) / 2;
		int posY = (dimension.height - frame.getWidth()) / 2;
		frame.setLocation(posX, posY);
	}

	private void resetFrameLocation() {
		frame.setLocation(0, 0);
	}

	public static void main(String[] args) {
		First_Exercise exercise_window = new First_Exercise();
		exercise_window.open();
	}
}