import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					// frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setTitle("\u75AB\u60C5\u9632\u63A7\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 420);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 370, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(47, 26, 318, 256);
		lblNewLabel_1.setIcon(new ImageIcon(LogIn.class.getResource("/images/\u767B\u5F551.png")));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u75AB\u60C5\u5C31\u662F\u547D\u4EE4,\u9632\u63A7\u5C31\u662F\u8D23\u4EFB");
		lblNewLabel_2.setFont(new Font("ËÎÌו", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(62, 324, 251, 27);
		panel.add(lblNewLabel_2);
		
		Button button = new Button("Sign  Up");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(241, 57, 83));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(440, 308, 227, 42);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(440, 110, 227, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(441, 75, 94, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(441, 172, 94, 25);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(440, 207, 227, 42);
		contentPane.add(passwordField);
	}
}
