package calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator {

//By Kirill David Sorokin
	
	private JFrame frame;
	private JTextField integerField;
	
	double firstNum, secondNum, result;
	String operation, answer;

	//Launches the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Creates the application
	public Calculator() {
		initialize();
	}

	//Contents of the Frame
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 250, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Text field is renamed to 'integerField'.
		integerField = new JTextField();
		integerField.setHorizontalAlignment(SwingConstants.RIGHT);
		integerField.setBounds(6, 6, 238, 67);
		integerField.setFont(new Font("Lucida Grande", Font.BOLD, 32));
		frame.getContentPane().add(integerField);
		integerField.setColumns(10);
		
		//FIRST BUTTOW ROW---------------------------------------
		//Buttons: C, <-
		JButton clearBtn = new JButton("C");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				integerField.setText(null);
			}
		});
		clearBtn.setBounds(6, 74, 61, 36);
		clearBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(clearBtn);
		
		JButton backBtn = new JButton("<-");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (integerField.getText().length() > 0) {
					StringBuilder StrBuild = new StringBuilder(integerField.getText());
					StrBuild.deleteCharAt(integerField.getText().length() - 1);
					backSpace = StrBuild.toString();
					integerField.setText(backSpace);
				}
			}
		});
		backBtn.setBounds(183, 74, 61, 36);
		backBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(backBtn);
		
		//SECOND BUTTON ROW--------------------------------------
		//Buttons: 1, 2, 3, +
		//Contains: Functionalities, Font and Size 
		JButton oneBtn = new JButton("1");
		oneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+oneBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		oneBtn.setBounds(6, 111, 61, 36);
		oneBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(oneBtn);
		
		JButton twoBtn = new JButton("2");
		twoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+twoBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		twoBtn.setBounds(65, 111, 61, 36);
		twoBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(twoBtn);
		
		JButton threeBtn = new JButton("3");
		threeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+threeBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		threeBtn.setBounds(124, 111, 61, 36);
		threeBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(threeBtn);
		
		JButton addBtn = new JButton("+");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(integerField.getText());
				integerField.setText(null);
				operation = "+";
			}
		});
		addBtn.setBounds(183, 111, 61, 36);
		addBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(addBtn);
		
		//THIRD BUTTON ROW---------------------------------------
		//Buttons: 4, 5, 6, -
		//Contains: Functionalities, Font and Size 
		JButton fourBtn = new JButton("4");
		fourBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+fourBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		fourBtn.setBounds(6, 144, 61, 36);
		fourBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(fourBtn);
		
		JButton fiveBtn = new JButton("5");
		fiveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+fiveBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		fiveBtn.setBounds(65, 144, 61, 36);
		fiveBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(fiveBtn);
		
		JButton sixBtn = new JButton("6");
		sixBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+sixBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		sixBtn.setBounds(124, 144, 61, 36);
		sixBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(sixBtn);
		
		JButton minusBtn = new JButton("-");
		minusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(integerField.getText());
				integerField.setText(null);
				operation = "-";
			}
		});
		minusBtn.setBounds(183, 144, 61, 36);
		minusBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(minusBtn);
		
		//FOURTH BUTTON ROW--------------------------------------
		//Buttons: 7, 8, 9, *
		//Contains: Functionalities, Font and Size 
		JButton sevenBtn = new JButton("7");
		sevenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+sevenBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		sevenBtn.setBounds(6, 177, 61, 36);
		sevenBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(sevenBtn);
		
		JButton eightBtn = new JButton("8");
		eightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+eightBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		eightBtn.setBounds(65, 177, 61, 36);
		eightBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(eightBtn);
		
		JButton nineBtn = new JButton("9");
		nineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+nineBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		nineBtn.setBounds(124, 177, 61, 36);
		nineBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(nineBtn);
		
		JButton multipleBtn = new JButton("*");
		multipleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(integerField.getText());
				integerField.setText(null);
				operation = "*";
			}
		});
		multipleBtn.setBounds(183, 177, 61, 36);
		multipleBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(multipleBtn);
		
		//FIFTH BUTTON ROW---------------------------------------
		//Buttons: +/-(00B1), 0, /, =
		//Contains: Functionalities, Font and Size 
		JButton plusMinusBtn = new JButton("\u00B1");
		plusMinusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pM = Double.parseDouble(String.valueOf(integerField.getText()));
				pM = pM*(-1);
				integerField.setText(String.valueOf(pM));
			}
		});
		plusMinusBtn.setBounds(6, 210, 61, 36);
		plusMinusBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(plusMinusBtn);
		
		JButton zeroBtn = new JButton("0");
		zeroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = integerField.getText()+zeroBtn.getText();
				integerField.setText(enterNumber);
			}
		});
		zeroBtn.setBounds(65, 210, 61, 36);
		zeroBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(zeroBtn);
		
		JButton divideBtn = new JButton("/");
		divideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(integerField.getText());
				integerField.setText(null);
				operation = "/";
			}
		});
		divideBtn.setBounds(124, 210, 61, 36);
		divideBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(divideBtn);
		
		JButton equalsBtn = new JButton("=");
		equalsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(integerField.getText());
				if (operation == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					integerField.setText(answer);
				}
				else if (operation == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					integerField.setText(answer);
				}
				else if (operation == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					integerField.setText(answer);
				}
				else if (operation == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					integerField.setText(answer);
				}
			}
		});
		equalsBtn.setBounds(183, 210, 61, 36);
		equalsBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(equalsBtn);
		
		/* Factorial button and functionalities;
		 * The function takes the String format and 
		 * turns it into an integer, the value is then 
		 * put into a for loop where it is calculated 
		 * against itself and then when the value has 
		 * undergone the calculate the amount of 
		 * times of the input, it is then converted back 
		 * to a String and then set in the 'integerField' (text field).
		 * ---Displays the value using the SCIENTIFIC NOTATION---*/
		JButton factorialBtn = new JButton("x!");
		factorialBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double holder = Double.parseDouble(String.valueOf(integerField.getText()));
				double i, fact = 1;
				for(i=1;i <= holder;++i) {
					fact=fact*i;
				}
				integerField.setText(String.valueOf(fact));
			}
		});
		factorialBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		factorialBtn.setBounds(65, 74, 61, 36);
		frame.getContentPane().add(factorialBtn);
		
		// Percentage button and functionalities
		/* Takes the value, converts it into a String 
		 * and then divides the value by 100, 
		 * then converts it to a double and sets the value in the integerField.*/
		JButton percentageBtn = new JButton("%");
		percentageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double percent = Double.parseDouble(String.valueOf(integerField.getText()));
				percent = percent/100;
				integerField.setText(String.valueOf(percent));
			}
		});
		percentageBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		percentageBtn.setBounds(124, 74, 61, 36);
		frame.getContentPane().add(percentageBtn);
		
	}
}
