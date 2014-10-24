import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JFrame;

public class SignalListApplet extends JApplet {
	private static JTextField textField; // Let user input a integer to insert at head.
	private static JTextField textField_1; // Let user input a integer to insert at tail.
	private static JTextField textField_2; // Let user input a integer to search the location in this list.
	JButton btnNewButton = new JButton("\u78BA\u5B9A"); // click it can insert a integer to the head.
	JButton btnNewButton_1 = new JButton("\u78BA\u5B9A\r\n"); // click it can insert a integer to the tail.
	JButton btnNewButton_2 = new JButton("\u522A\u9664\u958B\u982D"); // click it can remove a integer from the head.
	JButton btnNewButton_3 = new JButton("\u522A\u9664\u5C3E\u7AEF"); // click it can remove a integer from the tail.
	JButton btnNewButton_4 = new JButton("\u5168\u90E8\u6E05\u9664"); // click it can remove all integer in this list.
	JButton btnNewButton_5 = new JButton("\u986F\u793A\u76EE\u524D\u93C8\u7D50"); // click it can display the list currently.
	JButton btnNewButton_6 = new JButton("\u78BA\u5B9A\r\n"); // click it can search a integer which user input in textField_2, and display the result in textArea_1.
	static JTextArea textArea; // display all the action that click any button.
	static TextArea textArea_1; // display the search result when you click btnNewButton_6.
	
		// In order to run standalone as a standalone application, we add the main method.
	public static void main(String[] args) {
		// Create a frame.
		JFrame frame = new JFrame("Single Linked List for integer");
		// Create an instance of the applet.
		SignalListApplet applet = new SignalListApplet();
		// Add the applet to the frame.
		frame.add(applet);
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
		
		
		btnNewButton.setBounds(282, 31, 87, 23);
		getContentPane().add(btnNewButton);
		
		
		btnNewButton_1.setBounds(282, 59, 87, 23);
		getContentPane().add(btnNewButton_1);
		
		
		btnNewButton_2.setBounds(10, 93, 87, 23);
		getContentPane().add(btnNewButton_2);
		
		
		btnNewButton_3.setBounds(107, 93, 87, 23);
		getContentPane().add(btnNewButton_3);
		
		
		btnNewButton_4.setBounds(204, 93, 87, 23);
		getContentPane().add(btnNewButton_4);
		
		
		btnNewButton_5.setBounds(301, 93, 139, 23);
		getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("\u5C0B\u627E\u6574\u6578\uFF1A");
		lblNewLabel_3.setBounds(10, 126, 72, 15);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 123, 151, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		btnNewButton_6.setBounds(239, 122, 87, 23);
		getContentPane().add(btnNewButton_6);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(336, 121, 166, 25);
		getContentPane().add(textArea);
		
		JLabel lblNewLabel_4 = new JLabel("\u904E\u7A0B\uFF1A\r\n");
		lblNewLabel_4.setBounds(10, 151, 60, 15);
		getContentPane().add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 405, 359, -221);
		getContentPane().add(scrollPane);
		
		textArea_1 = new TextArea();
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		textArea_1.setBounds(10, 172, 440, 227);
		getContentPane().add(textArea_1);

	}
}
