package Scientific_calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ScientificCalculator {

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;
	private JTextField txtD;
	private JButton btn8;
    double firstnum;
    double secondnum;
    double result;
    String operation;
    String ans;
	
    
   
    double yuan = 11.26;
    double aus_dol = 56.71;
    double sa_rand = 4.87;
    double jap_yen = 0.61;
    double korean_won = 0.061;
    double can_dol = 57.61;
    double usa_dol = 73.61;
    double sing_dol = 55.61;
   
	/**
	 * Launch the application.
	 */
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.getContentPane().setForeground(Color.WHITE);
		frmStandardCalculator.getContentPane().setBackground(new Color(255, 255, 255));
		frmStandardCalculator.setTitle("BATCH_13 Calculator");
		frmStandardCalculator.setBounds(200, 200, 1074, 498);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(200, 200, 339, 498);
			    txtDisplay.setBounds(10, 11, 300, 66);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(200, 200, 700, 498);
			    txtDisplay.setBounds(10, 11, 660, 66);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Currency Converter");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Unit Converter");
				frmStandardCalculator.setBounds(200, 200, 1048, 498);
			    txtDisplay.setBounds(10, 11, 343, 66);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtDisplay.setBounds(10, 11, 295, 96);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("◄");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            String backspace = null;
            if (txtDisplay.getText().length() > 0) {
	        StringBuilder strB = new StringBuilder (txtDisplay.getText());
	        strB.deleteCharAt(txtDisplay.getText().length() - 1);
	        backspace = strB.toString();
	        txtDisplay.setText(backspace);
	
}
			}
		});
		btnNewButton.setBounds(10, 118, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("C");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
				
			}
		});
		btnNewButton_1_1.setBounds(132, 118, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("±");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            double ops = Double.parseDouble(txtDisplay.getText());
            ops = ops*(-1);
            txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_2.setBounds(193, 118, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_2);
		
		final JButton btn7 = new JButton("7");
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn7.setBounds(10, 183, 51, 49);
		frmStandardCalculator.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String iNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn8.setBounds(71, 183, 51, 49);
		frmStandardCalculator.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setBounds(132, 183, 51, 49);
		frmStandardCalculator.getContentPane().add(btn9);
		
		JButton btnNewButton_1_6 = new JButton("/");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 firstnum = Double.parseDouble(txtDisplay.getText());
		         txtDisplay.setText("");
		         operation = "/";
			}
		});
		btnNewButton_1_6.setForeground(Color.WHITE);
		btnNewButton_1_6.setBackground(Color.DARK_GRAY);
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_6.setBounds(193, 183, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_6);
		
		final JButton btn4 = new JButton("4");
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setBounds(10, 247, 51, 49);
		frmStandardCalculator.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setBounds(71, 247, 51, 49);
		frmStandardCalculator.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);}
		});
		btn6.setBounds(132, 247, 51, 49);
		frmStandardCalculator.getContentPane().add(btn6);
		
		JButton btnNewButton_1_10 = new JButton("*");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 firstnum = Double.parseDouble(txtDisplay.getText());
		         txtDisplay.setText("");
		         operation = "*";
			}
		});
		btnNewButton_1_10.setForeground(Color.WHITE);
		btnNewButton_1_10.setBackground(Color.DARK_GRAY);
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_10.setBounds(193, 247, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_10);
		
		final JButton btn1 = new JButton("1");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn1.setBounds(10, 307, 51, 49);
		frmStandardCalculator.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);}
		});
		btn2.setBounds(71, 307, 51, 49);
		frmStandardCalculator.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String iNum = txtDisplay.getText() + btn3.getText();
			txtDisplay.setText(iNum);}
		});
		btn3.setBounds(132, 307, 51, 49);
		frmStandardCalculator.getContentPane().add(btn3);
		
		JButton btnNewButton_1_15 = new JButton("√");
		btnNewButton_1_15.setForeground(Color.WHITE);
		btnNewButton_1_15.setBackground(Color.DARK_GRAY);
		btnNewButton_1_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = Math.sqrt(ops);
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_15.setBounds(254, 118, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_15);
		
		JButton btnNewButton_1_16 = new JButton("%");
		btnNewButton_1_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 firstnum = Double.parseDouble(txtDisplay.getText());
		         txtDisplay.setText("");
		         operation = "%";
			}
		});
		btnNewButton_1_16.setForeground(Color.WHITE);
		btnNewButton_1_16.setBackground(Color.DARK_GRAY);
		btnNewButton_1_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_16.setBounds(254, 183, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_16);
		
		JButton btnNewButton_1_17 = new JButton("½");
		btnNewButton_1_17.setForeground(Color.WHITE);
		btnNewButton_1_17.setBackground(Color.DARK_GRAY);
		btnNewButton_1_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = ops/2;
		          txtDisplay.setText(String.valueOf(ops));
				
				
			}
		});
		btnNewButton_1_17.setBounds(254, 247, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_17);
		
		JButton btnNewButton_1_14_1 = new JButton("=");
		btnNewButton_1_14_1.setForeground(Color.WHITE);
		btnNewButton_1_14_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_14_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_14_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ans;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operation == "+") {
					result = firstnum + secondnum;
					ans = String.format("%.2f", result);
					txtDisplay.setText(ans);
				}
				else if (operation == "-") {
					result = firstnum - secondnum;
					ans = String.format("%.2f", result);
					txtDisplay.setText(ans);
				}
				else if (operation == "/") {
					result = firstnum / secondnum;
					ans = String.format("%.2f", result);
					txtDisplay.setText(ans);
				}
				else if (operation == "*") {
					result = firstnum * secondnum;
					ans = String.format("%.2f", result);
					txtDisplay.setText(ans);
				}
				else if (operation == "%") {
					result = firstnum % secondnum;
					ans = String.format("%.2f", result);
					txtDisplay.setText(ans);
				}
				
				
			}
		});
		btnNewButton_1_14_1.setBounds(254, 307, 51, 109);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_14_1);
		
		JButton btnNewButton_1_13_1 = new JButton("-");
		btnNewButton_1_13_1.setForeground(Color.WHITE);
		btnNewButton_1_13_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_13_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_1_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 firstnum = Double.parseDouble(txtDisplay.getText());
		         txtDisplay.setText("");
		         operation = "-";
			}
		});
		btnNewButton_1_13_1.setBounds(193, 307, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_13_1);
		
		final JButton btnNewButton_1_13_2 = new JButton("0");
		btnNewButton_1_13_2.setForeground(Color.WHITE);
		btnNewButton_1_13_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_13_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_13_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btnNewButton_1_13_2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btnNewButton_1_13_2.setBounds(10, 367, 173, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_13_2);
		
		JButton btnNewButton_1_13_4 = new JButton("+");
		btnNewButton_1_13_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            firstnum = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            operation = "+";
			}
		});
		btnNewButton_1_13_4.setForeground(Color.WHITE);
		btnNewButton_1_13_4.setBackground(Color.DARK_GRAY);
		btnNewButton_1_13_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_13_4.setBounds(193, 367, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_13_4);
		
		JButton btnNewButton_1_1_1 = new JButton("CE");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");	
			}
		});
		btnNewButton_1_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_1.setBounds(71, 118, 51, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Log");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 double ops = Double.parseDouble((txtDisplay.getText()));
		         ops = Math.log(ops);
		         txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(355, 118, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_14 = new JButton("Sin");
		btnNewButton_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double ops = Double.parseDouble(txtDisplay.getText());
		          ops = Math.sin(ops);
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_14.setForeground(Color.WHITE);
		btnNewButton_1_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_14.setBackground(Color.DARK_GRAY);
		btnNewButton_1_14.setBounds(438, 118, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_14);
		
		JButton btnNewButton_1_18 = new JButton("Π");
		btnNewButton_1_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double o;
				o = 3.141592653589793238;
				txtDisplay.setText(String.valueOf(o));
				
			}
		});
		btnNewButton_1_18.setForeground(Color.WHITE);
		btnNewButton_1_18.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_18.setBackground(Color.DARK_GRAY);
		btnNewButton_1_18.setBounds(355, 183, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_18);
		
		JButton btnNewButton_1_19 = new JButton("x^x");
		btnNewButton_1_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(txtDisplay.getText());
		          ops = Math.pow(ops,ops);
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_19.setForeground(Color.WHITE);
		btnNewButton_1_19.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_19.setBackground(Color.DARK_GRAY);
		btnNewButton_1_19.setBounds(355, 247, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_19);
		
		JButton btnNewButton_1_20 = new JButton("Cos");
		btnNewButton_1_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = Math.cos(ops);
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_20.setForeground(Color.WHITE);
		btnNewButton_1_20.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_20.setBackground(Color.DARK_GRAY);
		btnNewButton_1_20.setBounds(438, 183, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_20);
		
		JButton btnNewButton_1_21 = new JButton("Tan");
		btnNewButton_1_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		         ops = Math.tan(ops);
		         txtDisplay.setText(String.valueOf(ops));
				
				
			}
		});
		btnNewButton_1_21.setForeground(Color.WHITE);
		btnNewButton_1_21.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_21.setBackground(Color.DARK_GRAY);
		btnNewButton_1_21.setBounds(438, 247, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_21);
		
		JButton btnNewButton_1_22 = new JButton("x^2");
		btnNewButton_1_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = ops*ops;
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_22.setForeground(Color.WHITE);
		btnNewButton_1_22.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_22.setBackground(Color.DARK_GRAY);
		btnNewButton_1_22.setBounds(355, 307, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_22);
		
		JButton btnNewButton_1_23 = new JButton("x^3");
		btnNewButton_1_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = (ops*ops*ops);
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_23.setForeground(Color.WHITE);
		btnNewButton_1_23.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_23.setBackground(Color.DARK_GRAY);
		btnNewButton_1_23.setBounds(355, 367, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_23);
		
		JButton btnNewButton_1_24 = new JButton("Cbr");
		btnNewButton_1_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		        ops = Math.cbrt(ops);
		        txtDisplay.setText(String.valueOf(ops));
			}

		});
		btnNewButton_1_24.setForeground(Color.WHITE);
		btnNewButton_1_24.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_24.setBackground(Color.DARK_GRAY);
		btnNewButton_1_24.setBounds(438, 307, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_24);
		
		JButton btnNewButton_1_25 = new JButton("Bin");
		btnNewButton_1_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,2));
				
			}
		});
		btnNewButton_1_25.setForeground(Color.WHITE);
		btnNewButton_1_25.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_25.setBackground(Color.DARK_GRAY);
		btnNewButton_1_25.setBounds(438, 367, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_25);
		
		JButton btnNewButton_1_26 = new JButton("Sinh");
		btnNewButton_1_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = Math.sinh(ops);
		          txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1_26.setForeground(Color.WHITE);
		btnNewButton_1_26.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_26.setBackground(Color.DARK_GRAY);
		btnNewButton_1_26.setBounds(517, 118, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_26);
		
		JButton btnNewButton_1_27 = new JButton("Cosh");
		btnNewButton_1_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = Math.cosh(ops);
		          txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1_27.setForeground(Color.WHITE);
		btnNewButton_1_27.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_27.setBackground(Color.DARK_GRAY);
		btnNewButton_1_27.setBounds(517, 183, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_27);
		
		JButton btnNewButton_1_28 = new JButton("Tanh");
		btnNewButton_1_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = Math.tanh(ops);
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_28.setForeground(Color.WHITE);
		btnNewButton_1_28.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_28.setBackground(Color.DARK_GRAY);
		btnNewButton_1_28.setBounds(517, 247, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_28);
		
		JButton btnNewButton_1_29 = new JButton("Rund");
		btnNewButton_1_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = Math.round(ops);
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_29.setForeground(Color.WHITE);
		btnNewButton_1_29.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_29.setBackground(Color.DARK_GRAY);
		btnNewButton_1_29.setBounds(517, 307, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_29);
		
		JButton btnNewButton_1_30 = new JButton("Hex");
		btnNewButton_1_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,16));
				
			}
		});
		btnNewButton_1_30.setForeground(Color.WHITE);
		btnNewButton_1_30.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_30.setBackground(Color.DARK_GRAY);
		btnNewButton_1_30.setBounds(517, 367, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_30);
		
		JButton btnNewButton_1_31 = new JButton("Abs");
		btnNewButton_1_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		          ops = Math.abs(ops);
		          txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_31.setForeground(Color.WHITE);
		btnNewButton_1_31.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_31.setBackground(Color.DARK_GRAY);
		btnNewButton_1_31.setBounds(596, 118, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_31);
		
		JButton btnNewButton_1_32 = new JButton("Inx");
		btnNewButton_1_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		        ops = Math.log10(ops);
		        txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_32.setForeground(Color.WHITE);
		btnNewButton_1_32.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_32.setBackground(Color.DARK_GRAY);
		btnNewButton_1_32.setBounds(596, 183, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_32);
		
		JButton btnNewButton_1_33 = new JButton("Exp");
		btnNewButton_1_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		        ops = Math.exp(ops);
		        txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_1_33.setForeground(Color.WHITE);
		btnNewButton_1_33.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_33.setBackground(Color.DARK_GRAY);
		btnNewButton_1_33.setBounds(596, 247, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_33);
		
		JButton btnNewButton_1_34 = new JButton("2*Π");
		btnNewButton_1_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double o;
			o = 2*3.141592653589793238;
			txtDisplay.setText(String.valueOf(o));
				
			}
		});
		btnNewButton_1_34.setForeground(Color.WHITE);
		btnNewButton_1_34.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_34.setBackground(Color.DARK_GRAY);
		btnNewButton_1_34.setBounds(596, 307, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_34);
		
		JButton btnNewButton_1_35 = new JButton("Oct");
		btnNewButton_1_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,8));
				
			}
		});
		btnNewButton_1_35.setForeground(Color.WHITE);
		btnNewButton_1_35.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_35.setBackground(Color.DARK_GRAY);
		btnNewButton_1_35.setBounds(596, 367, 69, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_35);
		
		final JComboBox jc = new JComboBox();
		jc.setFont(new Font("Tahoma", Font.BOLD, 18));
		jc.setModel(new DefaultComboBoxModel(new String[] {"America", "Cannada", "South Korea", "Japan", "Africa", "Australia", "China", "Singapore"}));
		jc.setBounds(734, 119, 285, 46);
		frmStandardCalculator.getContentPane().add(jc);
		
		JButton btnNewButton_1_35_1 = new JButton("Convert");
		btnNewButton_1_35_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            if (jc.getSelectedItem().equals("America")) {
           
            	firstnum = Double.parseDouble(txtD.getText());	
            	result = firstnum*usa_dol;
				ans = String.format("%.2f", result);
				txtD.setText(ans+" rupees");
            }
            
            else if (jc.getSelectedItem().equals("Cannada")) {
           
            	firstnum = Double.parseDouble(txtD.getText());	
            	result = firstnum*can_dol;
				ans = String.format("%.2f", result);
				txtD.setText(ans+" rupees");
            }	
            else if (jc.getSelectedItem().equals("South Korea")) {
           
            	firstnum = Double.parseDouble(txtD.getText());	
            	result = firstnum*korean_won;
				ans = String.format("%.2f", result);
				txtD.setText(ans+" rupees");
            }	
            else if (jc.getSelectedItem().equals("Japan")) {
           
            	firstnum = Double.parseDouble(txtD.getText());	
            	result = firstnum*jap_yen;
				ans = String.format("%.2f", result);
				txtD.setText(ans+" rupees");
            }	
            else if (jc.getSelectedItem().equals("Africa")) {
           
            	firstnum = Double.parseDouble(txtD.getText());	
            	result = firstnum*sa_rand;
				ans = String.format("%.2f", result);
				txtD.setText(ans+" rupees");
            }
            else if (jc.getSelectedItem().equals("Australia")) {
           
            	firstnum = Double.parseDouble(txtD.getText());	
            	result = firstnum*aus_dol;
				ans = String.format("%.2f", result);
				txtD.setText(ans+" rupees");
            }	
            else if (jc.getSelectedItem().equals("China")) {
           
            	firstnum = Double.parseDouble(txtD.getText());	
            	result = firstnum*yuan;
				ans = String.format("%.2f", result);
				txtD.setText(ans+" rupees");
            }
            	
            else if (jc.getSelectedItem().equals("Singapore")) {
           
            	firstnum = Double.parseDouble(txtD.getText());	
            	result = firstnum*sing_dol;
				ans = String.format("%.2f", result);
				txtD.setText(ans+" rupees");
            }	  
			}
		});
		btnNewButton_1_35_1.setForeground(Color.WHITE);
		btnNewButton_1_35_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_35_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_35_1.setBounds(734, 367, 174, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_35_1);
		
		JButton btnNewButton_1_35_1_1 = new JButton("Clear");
		btnNewButton_1_35_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtD.setText("");
			}
		});
		btnNewButton_1_35_1_1.setForeground(Color.WHITE);
		btnNewButton_1_35_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_35_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_35_1_1.setBounds(933, 367, 86, 49);
		frmStandardCalculator.getContentPane().add(btnNewButton_1_35_1_1);
		
		txtD = new JTextField();
		txtD.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtD.setBounds(734, 235, 285, 61);
		frmStandardCalculator.getContentPane().add(txtD);
		txtD.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CURRENCY CONVERTER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(734, 37, 285, 40);
		frmStandardCalculator.getContentPane().add(lblNewLabel);
	}
}
