package homework9;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JFrame;

public class SignalListApplet extends JApplet {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
		// In order to run standalone as a standalone application, we add the main method.
	public static void main(String[] args) {
		// Create a frame.
		JFrame frame = new JFrame("Single Linked List for integer");
		// Create an instance of the applet.
		SignalListApplet applet = new SignalListApplet();
		// Add the applet to the frame.
		frame.getContentPane().add(applet);
		// Display the frame.
		frame.setSize(520,450);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	// Owing to Applet life-cycle, the method will automatically be invoked.
	public void init(){
		resize(512,420); // Set the applet size, or the window is too small initially.
	}

	/**
	 * Create the applet.
	 */
	public SignalListApplet() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9019\u662F\u4E00\u500B\u6A21\u64EC\u6574\u6578Single Linked List\u7684\u7A0B\u5F0F");
		lblNewLabel.setBounds(10, 10, 261, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u63D2\u5165\u958B\u982D\uFF1A");
		lblNewLabel_1.setBounds(10, 35, 100, 15);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(120, 32, 151, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u63D2\u5165\u5C3E\u7AEF\uFF1A");
		lblNewLabel_2.setBounds(10, 63, 100, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 60, 151, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u78BA\u5B9A");
		btnNewButton.setBounds(282, 31, 87, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u78BA\u5B9A\r\n");
		btnNewButton_1.setBounds(282, 59, 87, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u522A\u9664\u958B\u982D");
		btnNewButton_2.setBounds(10, 93, 87, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u522A\u9664\u5C3E\u7AEF");
		btnNewButton_3.setBounds(107, 93, 87, 23);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u5168\u90E8\u6E05\u9664");
		btnNewButton_4.setBounds(204, 93, 87, 23);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u986F\u793A\u76EE\u524D\u93C8\u7D50");
		btnNewButton_5.setBounds(301, 93, 139, 23);
		getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("\u5C0B\u627E\u6574\u6578\uFF1A");
		lblNewLabel_3.setBounds(10, 126, 72, 15);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 123, 151, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("\u78BA\u5B9A\r\n");
		btnNewButton_6.setBounds(239, 122, 87, 23);
		getContentPane().add(btnNewButton_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(336, 121, 166, 25);
		getContentPane().add(textArea);
		
		JLabel lblNewLabel_4 = new JLabel("\u904E\u7A0B\uFF1A\r\n");
		lblNewLabel_4.setBounds(10, 151, 60, 15);
		getContentPane().add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 405, 359, -221);
		getContentPane().add(scrollPane);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		textArea_1.setBounds(10, 172, 440, 227);
		getContentPane().add(textArea_1);

	}
}
