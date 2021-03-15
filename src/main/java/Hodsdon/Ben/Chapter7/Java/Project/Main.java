package Hodsdon.Ben.Chapter7.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 32, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNumerator = new JLabel("Numerator");
		lblNumerator.setBounds(96, 6, 70, 14);
		frame.getContentPane().add(lblNumerator);
		
		JLabel lblDenominator = new JLabel("Denominator");
		lblDenominator.setBounds(96, 35, 74, 14);
		frame.getContentPane().add(lblDenominator);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(20, 63, 46, 14);
		frame.getContentPane().add(lblResult);
		
		JButton btnCalculate = new JButton("Calculate");
		
		btnCalculate.setBounds(77, 63, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double numerator = Double.parseDouble(textField.getText());
				double denominator = Double.parseDouble(textField_1.getText());
				
				SimpleMath simpleMath = new SimpleMath();
				Double result = simpleMath.divide(numerator, denominator);
				
				try {
					
					lblResult.setText(result.toString());
					
				} catch (ArithmeticException e) {
					
					lblResult.setText("Cannot divide by 0");
				}
			}
		});
	}
}
