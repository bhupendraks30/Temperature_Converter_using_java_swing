package tempreture_Converter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainClass extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton b;
	private JLabel l;
	private Container c;
	private JMenuBar mb;
	private  JMenu conC,conK,conF;
	private JMenuItem cf,ck,fc,fk,kc,kf;
	private Convert_FC ftc = new Convert_FC();
	private Convert_FK ftk = new Convert_FK();
	private Convert_CF ctf = new Convert_CF();	
	private Convert_CK ctk = new Convert_CK();
	private Convert_KC ktc = new Convert_KC();
	private Convert_KF ktf = new Convert_KF();
		
	void convert_FC() {
		ftc.setBounds(0,0,550,450);
		ftc.f_To_C();
		ftc.setVisible(true);
		add(ftc);
	}	
	void convert_FK() {
		ftk.setBounds(0,0,550,450);
		ftk.f_To_K();
		ftk.setVisible(true);
		add(ftk);
	}	
	void convert_CF() {
		ctf.setBounds(0,0,550,450);
		ctf.c_To_F();
		ctf.setVisible(true);
		add(ctf);
	}	
	void convert_CK() {
		ctk.setBounds(0,0,550,450);
		ctk.c_To_K();
		ctk.setVisible(true);
		add(ctk);
	}	
	void convert_KF() {
		ktf.setBounds(0,0,550,450);
		ktf.k_To_F();
		ktf.setVisible(true);
		add(ktf);
	}
	void convert_KC() {
		ktc.setBounds(0,0,550,450);
		ktc.k_To_C();
		ktc.setVisible(true);
		add(ktc);
	}	
	void setMenu() {
		mb = new JMenuBar();
		mb.setBackground(new Color(225,225,225));
		conC = new JMenu("Convert Celsius");
		conF = new JMenu("Convert Fahrenheit");
		conK = new JMenu("Convert Kalvin");
		conC.setBackground(new Color(149,237,249));
		conF.setBackground(new Color(149,237,249));
		conK.setBackground(new Color(149,237,249));		
		cf = new JMenuItem("Celsius To Fahrenheit");
		ck = new JMenuItem("Celsius To Kalvin");
		fk = new JMenuItem("Fahrenheit To Kalvin");
		fc = new JMenuItem("Fahrenheit To Celsius");
		kc = new JMenuItem("Kalvin To Celsius");
		kf = new JMenuItem("Kalvin To Fahrenheit");		
		conC.add(cf);conC.add(ck);
		conF.add(fc);conF.add(fk);
		conK.add(kc);conK.add(kf);		
		mb.add(conC);
		mb.add(conF);
		mb.add(conK);
		setJMenuBar(mb);
		addActionListenerMethod();
	}
	void addActionListenerMethod() {
		cf.addActionListener(this);
		ck.addActionListener(this);
		fk.addActionListener(this);
		fc.addActionListener(this);
		kc.addActionListener(this);
		kf.addActionListener(this);
	}
	MainClass(){
		setBounds(450,100,550,550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tempreture Converter ");
		setLayout(null);
		setResizable(false);
		c =getContentPane();
		c.setBackground(new Color(20,150,100));		
				
		b=new JButton("START");
		b.setBounds(220,300,100,35);
		b.setFocusable(false);
		b.addActionListener(this);
		
		l=new JLabel("Wellcome to Tempreture Converter.");
		l.setForeground(Color.WHITE);						
		l.setBounds(100,200,350,20);		
		l.setFont(new Font("Segoe UI",Font.PLAIN,20));	
		
		add(b);
		add(l);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(b==e.getSource()) {
		b.setVisible(false);
		l.setVisible(false);
		setMenu();
		convert_CF();
		}
		if(fc==e.getSource()) {
			ctf.setVisible(false);			
			ftk.setVisible(false);			
			ctk.setVisible(false);
			ktc.setVisible(false);
			ktf.setVisible(false);
			
			convert_FC();
		}
		if(fk==e.getSource()) {
			ctf.setVisible(false);			
			ftc.setVisible(false);			
			ctk.setVisible(false);
			ktc.setVisible(false);
			ktf.setVisible(false);
			convert_FK();
		}
		if(cf==e.getSource()) {
			ftc.setVisible(false);			
			ftk.setVisible(false);			
			ctk.setVisible(false);
			ktc.setVisible(false);
			ktf.setVisible(false);
			convert_CF();
		}	
		if(ck==e.getSource()) {
			ftc.setVisible(false);			
			ftk.setVisible(false);			
			ctf.setVisible(false);
			ktc.setVisible(false);
			ktf.setVisible(false);
			convert_CK();
		}
		if(kc==e.getSource()) {
			ctf.setVisible(false);			
			ftk.setVisible(false);			
			ctk.setVisible(false);
			ftc.setVisible(false);
			ktf.setVisible(false);
			convert_KC();
		}
		if(kf==e.getSource()) {
			ctf.setVisible(false);			
			ftk.setVisible(false);			
			ctk.setVisible(false);
			ktc.setVisible(false);
			ftc.setVisible(false);
			convert_KF();
		}		
	}
	public static void main(String[] args) {
		new MainClass();
	}
}
