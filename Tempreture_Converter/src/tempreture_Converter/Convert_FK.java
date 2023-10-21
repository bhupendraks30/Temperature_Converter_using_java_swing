package tempreture_Converter;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class Convert_FK extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel f = new JLabel();
	private JLabel k = new JLabel();
	private JButton con = new JButton("Convert");
	private JButton clr = new JButton("Clear");
	private JTextField tf = new JTextField();
	private JTextField tk = new JTextField();
	private JButton exit = new JButton("Exit");
	
	float convert_FK(float f) {
		float k;
		k = (float) (((f-32)*5)/9 + 273.15);
		return k;
	}
	void setFont() {
		f.setFont(new Font("Segoe UI",Font.BOLD,18));
		f.setForeground(Color.WHITE);
		k.setFont(new Font("Segoe UI",Font.BOLD,18));
		k.setForeground(Color.WHITE);
	}
	void setBounds() {
		f.setBounds(70,100,200,30);
		tf.setBounds(300,100,150,30);
		
		k.setBounds(70,260,220,30);
		tk.setBounds(300,260,150,30);
		
		con.setBounds(290,180,100,30);
		clr.setBounds(410,180,100,30);
		exit.setBounds(390,380,100,30);
	}
	
	void f_To_K() {
		setLayout(null);
		setBackground(new Color(20,150,100));
		f.setText("Enter the Fahrenheit :");
		k.setText("The Kalvin Value is :");
		tk.setText("");
		tf.setText("");
		
		setFont();
		
		con.setFocusable(false);
		clr.setFocusable(false);
		exit.setFocusable(false);
		
		setBounds();		
		tk.setEditable(false);
		
		con.addActionListener(this);
		clr.addActionListener(this);
		exit.addActionListener(this);
		tf.addActionListener(this);
		
		add(f);add(k);add(con);add(exit);
		add(clr);add(tf);add(tk);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(con==e.getSource()||tf==e.getSource()) {
			try {
			float f = Float.parseFloat(tf.getText());
			float c = convert_FK(f);
			String s = String.valueOf(c);
			tk.setText(s);
			}catch(Exception s) {
				tk.setText("Enter the Correct Value");
				tf.setText("");
			}
		}
		if(clr==e.getSource()) {
			tk.setText("");
			tf.setText("");
		}
		if(exit==e.getSource()) {
			System.exit(0);
		}
	}
}
