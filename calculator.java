
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


abstract class calculator extends JFrame implements ActionListener {
public static String s1,temp;
public static int y1;
	public static void main(String[] args){

		Frame f=new Frame("CALCULATOR");




		f.setBackground(Color.cyan);
		f.setFont(new Font("Helvetica",Font.BOLD,20));

		TextField t=new TextField(100); //TextField
		t.setBounds(0,0,450,150);

		int n1,n2;


		Panel p=new Panel();
	  p.setBounds(0,150,450,450);
	  p.setBackground(Color.pink);


	  		Button b0=new Button("0");
		b0.setSize(10,10);
		b0.setBackground(Color.pink);
		Button b1=new Button("1");
		b1.setSize(100,100);
		b1.setBackground(Color.pink);
		Button b2=new Button("2");
		b2.setBounds(12,152,10,40);
		b2.setBackground(Color.pink);
		Button b3=new Button("3");
		b3.setBounds(12,152,100,40);
		b3.setBackground(Color.pink);
		Button b4=new Button("4");
		b4.setBounds(12,152,100,40);
		b4.setBackground(Color.pink);
		Button b5=new Button("5");
		b5.setBounds(12,152,100,40);
		b5.setBackground(Color.pink);
		Button b6=new Button("6");
		b6.setBounds(12,152,100,40);
		b6.setBackground(Color.pink);
		Button b7=new Button("7");
		b7.setBounds(12,152,100,40);
		b7.setBackground(Color.pink);
		Button b8=new Button("8");
		b8.setBounds(12,152,100,40);
		b8.setBackground(Color.pink);
		Button b9=new Button("9");
		b9.setBounds(12,152,100,40);
		b9.setBackground(Color.pink);
		Button b10=new Button("=");
		b10.setBounds(12,152,100,40);
		b10.setBackground(Color.pink);
		Button b11=new Button("ADD(+)");
		b11.setBounds(450,100,150,100);
		b11.setBackground(Color.cyan);
		Button b12=new Button("SUB(-)");
		b12.setBounds(450,200,150,100);
		b12.setBackground(Color.cyan);
		Button b13=new Button("MUL(*)");
		b13.setBounds(450,300,150,100);
		b13.setBackground(Color.cyan);
		Button b14=new Button("DIV(/)");
		b14.setBounds(450,400,150,100);
		b14.setBackground(Color.cyan);
		Button b15=new Button("MOD(%)");
		b15.setBounds(450,500,150,100);
		b15.setBackground(Color.cyan);
		Button b16=new Button("CLR");
		b16.setBounds(12,152,100,40);
		b16.setBackground(Color.pink);


		p.setLayout(new GridLayout(3,4));

		b16.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b16){
				t.setText("");
			}
		}});
		b0.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b0){
				String temp=t.getText();
				t.setText(temp+"0");
			}
		}});

		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1){
				String temp=t.getText();
				t.setText(temp+"1");
			}
		}});
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b2){
				String temp=t.getText();
				t.setText(temp+"2");
			}
		}});
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b3){
				String temp=t.getText();
				t.setText(temp+"3");
			}
		}});
		b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b4){
				String temp=t.getText();
				t.setText(temp+"4");
			}
		}});
		b5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b5){
				String temp=t.getText();
				t.setText(temp+"5");
			}
		}});

		b6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b6){
				String temp=t.getText();
				t.setText(temp+"6");
			}
		}});
		b7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b7){
				String temp=t.getText();
				t.setText(temp+"7");
			}
		}});
		b8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b8){
				String temp=t.getText();
				t.setText(temp+"8");
			}
		}});

		b9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b9){
				String temp=t.getText();
				t.setText(temp+"9");
			}
		}});
		b10.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			temp=t.getText();

				if(s1=="+")
			{ char ch='+';
				int x=temp.indexOf(ch);


				int y2=Integer.parseInt(temp.substring(x+1));
				t.setText(""+(y1+y2));
			}
			if(s1=="-")
		{ char ch='-';
			int x=temp.indexOf(ch);


			int y2=Integer.parseInt(temp.substring(x+1));

			t.setText(""+(y1-y2));
		}
		if(s1=="*")
	{ char ch='*';
		int x=temp.indexOf(ch);
		int y2=Integer.parseInt(temp.substring(x+1));
		t.setText(""+(y1*y2));
	}
	if(s1=="/")
{ char ch='/';
	int x=temp.indexOf(ch);
	int y2=Integer.parseInt(temp.substring(x+1));
	t.setText(""+(y1/y2));
}
if(s1=="%")
{ char ch='%';
int x=temp.indexOf(ch);
int y2=Integer.parseInt(temp.substring(x+1));
t.setText(""+(y1%y2));
}
}});
		b11.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b11){
			 temp=t.getText();
				t.setText(temp+"+");
			  y1=Integer.parseInt(temp);
				s1="+";
			}
		}});
		b12.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b12){
			 temp=t.getText();
				t.setText(temp+"-");
				 y1=Integer.parseInt(temp);
				s1="-";
			}
		}});
		b13.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b13){
			 temp=t.getText();
				t.setText(temp+"*");
				 y1=Integer.parseInt(temp);
				s1="*";
			}
		}});
		b14.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b14){
			 temp=t.getText();
				t.setText(temp+"/");
			 y1=Integer.parseInt(temp);
			s1="/";


			}
		}});
		b15.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b15){
			 temp=t.getText();
				t.setText(temp+"%");
			 y1=Integer.parseInt(temp);
			s1="%";
			}
		}});



		p.add(b16);
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);




		f.add(p);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(t);


		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);

		f.show();

}
}
