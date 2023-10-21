package tempreture_Converter;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Convert_CK extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel f = new JLabel();
	private JLabel c = new JLabel();
	private JButton con = new JButton("Convert");
	private JButton clr = new JButton("Clear");
	private JTextField tf = new JTextField();
	private JTextField tc = new JTextField();
	private JButton exit = new JButton("Exit");
	
	float convert_CK(float c) {
		float k;
		k = (float) (c + 273.15);
		return k;
	}
	
	void setFont() {
		f.setFont(new Font("Segoe UI",Font.BOLD,18));
		f.setForeground(Color.WHITE);
		c.setFont(new Font("Segoe UI",Font.BOLD,18));
		c.setForeground(Color.WHITE);
	}
	
	void setBounds() {
		f.setBounds(70,100,200,30);
		tf.setBounds(300,100,150,30);
		
		c.setBounds(70,260,220,30);
		tc.setBounds(300,260,150,30);
		
		con.setBounds(290,180,100,30);
		clr.setBounds(410,180,100,30);
		exit.setBounds(390,380,100,30);
	}
	
	
	void c_To_K() {
		setLayout(null);
		setBackground(new Color(20,150,100));
		f.setText("Enter the Celsius :");
		c.setText("The Kalvin Value is :");
		tc.setText("");
		tf.setText("");
		
		setFont();
		
		con.setFocusable(false);
		clr.setFocusable(false);
		exit.setFocusable(false);
		
		con.addActionListener(this);
		clr.addActionListener(this);
		exit.addActionListener(this);
		tf.addActionListener(this);
		
		tc.setEditable(false);
		setBounds();				
		
		add(f);add(c);add(con);add(exit);
		add(clr);add(tf);add(tc);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(con==e.getSource()||tf==e.getSource()) {
			try {
			float f = Float.parseFloat(tf.getText());
			float c = convert_CK(f);
			String s = String.valueOf(c);
			tc.setText(s);
			}catch(Exception s) {
				tc.setText("Enter the Correct Value");
				tf.setText("");
			}
		}
		if(clr==e.getSource()) {
			tc.setText("");
			tf.setText("");
		}
		if(exit==e.getSource()) {
			System.exit(0);
		}
	}
}
