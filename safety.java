import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.sound.sampled.*;




 class StateTheDiff1 extends JFrame implements ActionListener {

File file;
Clip clip;

JFrame game=new JFrame("");
JFrame game1=new JFrame("");
JFrame game2=new JFrame("");

JButton diff1=new JButton("");
JButton diff2=new JButton("");
JButton diff3=new JButton("");
JButton diff4=new JButton("");

JButton diff5=new JButton("");
JButton diff6=new JButton("");
JButton diff7=new JButton("");
JButton diff8=new JButton("");

JButton diff9=new JButton("");
JButton diff10=new JButton("");

JButton diff11=new JButton("");
JButton diff12=new JButton("");
JButton diff13=new JButton("");
JButton diff14=new JButton("");

JTextField sc=new JTextField("");
int score=0;
int level=1;


StateTheDiff1() throws  LineUnavailableException,UnsupportedAudioFileException,IOException{
this.level1();

file=new File("sps.wav");
AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
clip=AudioSystem.getClip();
clip.open(audioStream);
clip.start();
clip.loop(clip.LOOP_CONTINUOUSLY);

}

void level1() {


 ImagePanel panel = new ImagePanel(
        new ImageIcon("level1.png").getImage());

panel.setBounds(450,1,1700,900);
diff1.setBounds(80,25,70,50);
diff2.setBounds(155,110,60,160);
diff3.setBounds(14,528,70,50);
diff4.setBounds(23,800,70,50);


sc.setBounds(20,50,200,50);

diff1.setContentAreaFilled(false);
diff1.setBorder(null);

diff2.setContentAreaFilled(false);
diff2.setBorder(null);

diff3.setContentAreaFilled(false);
diff3.setBorder(null);

diff4.setContentAreaFilled(false);
diff4.setBorder(null);

diff1.addActionListener(this);
diff2.addActionListener(this);
diff3.addActionListener(this);
diff4.addActionListener(this);

panel.add(diff1);
panel.add(diff2);
panel.add(diff3);
panel.add(diff4);

sc.setEditable(false);

game.add(sc);

    game.getContentPane().add(panel);
game.setSize(1600,900);

game.setLayout(null);
game.setVisible(true);



}



void level2(){

 ImagePanel panel1 = new ImagePanel(
        new ImageIcon("level2.jpg").getImage());

panel1.setBounds(450,1,1700,900);
diff5.setBounds(267,90,70,50);
diff6.setBounds(68,75,55,50);
diff7.setBounds(126,204,55,70);
diff8.setBounds(335,318,60,50);
diff9.setBounds(435,150,55,50);

sc.setBounds(20,50,200,50);

diff5.setContentAreaFilled(false);
diff5.setBorder(null);

diff6.setContentAreaFilled(false);
diff6.setBorder(null);

diff7.setContentAreaFilled(false);
diff7.setBorder(null);

diff8.setContentAreaFilled(false);
diff8.setBorder(null);

diff9.setContentAreaFilled(false);
diff9.setBorder(null);

diff5.addActionListener(this);
diff6.addActionListener(this);
diff7.addActionListener(this);
diff8.addActionListener(this);
diff9.addActionListener(this);

panel1.add(diff5);
panel1.add(diff6);
panel1.add(diff7);
panel1.add(diff8);
panel1.add(diff9);

sc.setEditable(false);

game1.add(sc);

    game1.getContentPane().add(panel1);
game1.setSize(1600,900);

game1.setLayout(null);
game1.setVisible(true);


}






void level3(){

 ImagePanel panel1 = new ImagePanel(
        new ImageIcon("level3.jpg").getImage());

panel1.setBounds(450,1,1700,900);
diff10.setBounds(36,289,55,50);
diff11.setBounds(415,220,50,50);
diff12.setBounds(250,275,55,50);
diff13.setBounds(520,275,55,50);
diff14.setBounds(120,160,43,43);

sc.setBounds(20,50,200,50);

diff10.setContentAreaFilled(false);
diff10.setBorder(null);

diff11.setContentAreaFilled(false);
diff11.setBorder(null);

diff12.setContentAreaFilled(false);
diff12.setBorder(null);

diff13.setContentAreaFilled(false);
diff13.setBorder(null);

diff14.setContentAreaFilled(false);
diff14.setBorder(null);

diff10.addActionListener(this);
diff11.addActionListener(this);
diff12.addActionListener(this);
diff13.addActionListener(this);
diff14.addActionListener(this);

panel1.add(diff10);
panel1.add(diff11);
panel1.add(diff12);
panel1.add(diff13);
panel1.add(diff14);

sc.setEditable(false);

game2.add(sc);

    game2.getContentPane().add(panel1);
game2.setSize(1600,900);

game2.setLayout(null);
game2.setVisible(true);


}





public void actionPerformed(ActionEvent e){

if(e.getSource()==diff1){
diff1.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }

if(e.getSource()==diff2){
diff2.setIcon(new ImageIcon("diff2.png"));
score++;
sc.setText(" Score : "+score);
     }  
if(e.getSource()==diff3){
diff3.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
}
 
if(e.getSource()==diff4){
diff4.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);

}



if(e.getSource()==diff5){
diff5.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }


if(e.getSource()==diff6){
diff6.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }

if(e.getSource()==diff7){
diff7.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }

if(e.getSource()==diff8){
diff8.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }


if(e.getSource()==diff9){
diff9.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }


if(e.getSource()==diff10){
diff10.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }

if(e.getSource()==diff11){
diff11.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }

if(e.getSource()==diff12){
diff12.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }


if(e.getSource()==diff13){
diff13.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }

if(e.getSource()==diff14){
diff14.setIcon(new ImageIcon("circle.png"));
score++;
sc.setText(" Score : "+score);
     }

if(score==4){
game.dispose();
this.level2();
}

if(score==9){
game1.dispose();
this.level3();
level++;
}
  
}






}


























class TickTackToe implements ActionListener {
	JFrame f;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	int a = 0, condition;
	String sb = "", sb1, sb2, sb3, sb4, sb5, sb6, sb7, sb8, sb9;
	JDialog dg, dg2;
	JLabel lb, lb2;
	JButton btn, btn2, btn3;
JLabel imageLabel = new JLabel();

	TickTackToe() {
		f = new JFrame("Tick-Tack-Toe");

		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);

		b1.setFont(new Font("Leagur Spartan", Font.BOLD, 100));
		b2.setFont(new Font("Leagur Spartan", Font.BOLD, 100));
		b3.setFont(new Font("Leagur Spartan", Font.BOLD, 100));
		b4.setFont(new Font("Leagur Spartan", Font.BOLD, 100));
		b5.setFont(new Font("Leagur Spartan", Font.BOLD, 100));
		b6.setFont(new Font("Leagur Spartan", Font.BOLD, 100));
		b7.setFont(new Font("Leagur Spartan", Font.BOLD, 100));
		b8.setFont(new Font("Leagur Spartan", Font.BOLD, 100));
		b9.setFont(new Font("Leagur Spartan", Font.BOLD, 100));

		b1.setBackground(Color.BLACK);
		b2.setBackground(Color.BLACK);
		b3.setBackground(Color.BLACK);
		b4.setBackground(Color.BLACK);
		b5.setBackground(Color.BLACK);
		b6.setBackground(Color.BLACK);
		b7.setBackground(Color.BLACK);
		b8.setBackground(Color.BLACK);
		b9.setBackground(Color.BLACK);

		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		b8.setForeground(Color.WHITE);
		b9.setForeground(Color.WHITE);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		f.setSize(1600, 900);
		f.setLayout(new GridLayout(3, 3, 2, 2));
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		sb1 = b1.getLabel();
		sb2 = b2.getLabel();
		sb3 = b3.getLabel();
		sb4 = b4.getLabel();
		sb5 = b5.getLabel();
		sb6 = b6.getLabel();
		sb7 = b7.getLabel();
		sb8 = b8.getLabel();
		sb9 = b9.getLabel();
		// printing the labels on button
		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 9) {
			if (ae.getSource() == b1) {
				if (sb1 == sb) {

					b1.setLabel("X");
					a++;
					this.check();

				}
			}
			if (ae.getSource() == b2)
				if (sb2 == sb) {
					b2.setLabel("X");
					a++;
					this.check();
				}
			if (ae.getSource() == b3) {
				if (sb3 == sb) {
					b3.setLabel("X");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b4) {
				if (sb4 == sb) {
					b4.setLabel("X");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b5) {
				if (sb5 == sb) {
					b5.setLabel("X");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b6) {
				if (sb6 == sb) {

					b6.setLabel("X");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b7) {
				if (sb7 == sb) {

					b7.setLabel("X");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b8) {
				if (sb8 == sb) {

					b8.setLabel("X");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b9) {
				if (sb9 == sb) {

					b9.setLabel("X");
					a++;
					this.check();
				}
			}
		} else {
			if (ae.getSource() == b1) {
				if (sb1 == sb) {

					b1.setLabel("O");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b2) {
				if (sb2 == sb) {

					b2.setLabel("O");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b3) {
				if (sb3 == sb) {

					b3.setLabel("O");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b4) {
				if (sb4 == sb) {

					b4.setLabel("O");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b5) {
				if (sb5 == sb) {

					b5.setLabel("O");
					a++;
					this.check();
				}

			}
			if (ae.getSource() == b6) {
				if (sb6 == sb) {

					b6.setLabel("O");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b7) {
				if (sb7 == sb) {

					b7.setLabel("O");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b8) {
				if (sb8 == sb) {

					b8.setLabel("O");
					a++;
					this.check();
				}
			}
			if (ae.getSource() == b9) {
				if (sb9 == sb) {

					b9.setLabel("O");
					a++;
					this.check();
				}
			}
		}
		// Dispose the dialog after win the game.
		if (ae.getSource() == btn) {
			b1.setLabel(sb);
			b2.setLabel(sb);
			b3.setLabel(sb);
			b4.setLabel(sb);
			b5.setLabel(sb);
			b6.setLabel(sb);
			b7.setLabel(sb);
			b8.setLabel(sb);
			b9.setLabel(sb);
			b1.setForeground(Color.WHITE);
			b2.setForeground(Color.WHITE);
			b3.setForeground(Color.WHITE);
			b4.setForeground(Color.WHITE);
			b5.setForeground(Color.WHITE);
			b6.setForeground(Color.WHITE);
			b7.setForeground(Color.WHITE);
			b8.setForeground(Color.WHITE);
			b9.setForeground(Color.WHITE);
			a = 0;
			dg.dispose();
			dg2.dispose();
		}
		// Dispose the dialog after Lose the game.

		if (ae.getSource() == btn2) {
			b1.setLabel(sb);
			b2.setLabel(sb);
			b3.setLabel(sb);
			b4.setLabel(sb);
			b5.setLabel(sb);
			b6.setLabel(sb);
			b7.setLabel(sb);
			b8.setLabel(sb);
			b9.setLabel(sb);
			a = 0;
			dg.dispose();
			f.dispose();
ChoiceFrame f=new ChoiceFrame();
		}

	}

	void check() {
		// getlabels of button

		sb1 = b1.getLabel();
		sb2 = b2.getLabel();
		sb3 = b3.getLabel();
		sb4 = b4.getLabel();
		sb5 = b5.getLabel();
		sb6 = b6.getLabel();
		sb7 = b7.getLabel();
		sb8 = b8.getLabel();
		sb9 = b9.getLabel();
		// for won game
		if ((sb1 == sb2 && sb2 == sb3 && sb1 != sb) || (sb4 == sb5 && sb5 == sb6 && sb4 != sb)
				|| (sb7 == sb8 && sb8 == sb9 && sb7 != sb) || (sb1 == sb4 && sb4 == sb7 && sb1 != sb) ||
				(sb2 == sb5 && sb5 == sb8 && sb2 != sb) || (sb3 == sb6 && sb6 == sb9 && sb3 != sb)
				|| (sb1 == sb5 && sb5 == sb9 && sb1 != sb) || (sb3 == sb5 && sb5 == sb7 && sb3 != sb)) {
			if (a == 1 || a == 3 || a == 5 || a == 7 || a == 9) {
				BgColorOfO();
				winner();
dg = new JDialog(f, "Result", true);
				lb = new JLabel("O Player Won the Game");
				btn = new JButton("Replay");
				btn2 = new JButton("Exit");
				btn.addActionListener(this);
				btn2.addActionListener(this);
				dg.add(lb);
				dg.add(btn);
				dg.add(btn2);
				dg.setSize(300, 200);
				dg.setLayout(new FlowLayout(FlowLayout.CENTER));


				dg.setVisible(true);

			} else {

				BgColorOfX();
				winner();
				dg = new JDialog(f, "Result", true);
				lb = new JLabel("X Player Won the Game");
				btn = new JButton("Replay");
				btn2 = new JButton("Exit");
				btn.addActionListener(this);
				btn2.addActionListener(this);
				dg.add(lb);
				dg.add(btn);
				dg.add(btn2);
				dg.setSize(300, 200);
				dg.setLayout(new FlowLayout(FlowLayout.CENTER));
				dg.setVisible(true);
			}
		}
		// for lose game
		// this method executes after draw the game.
		if (a == 9) {

			dg = new JDialog(f, "Result", true);
			lb = new JLabel("Match is Draw");
			btn = new JButton("Replay");
			btn2 = new JButton("Exit");
			btn.addActionListener(this);
			btn2.addActionListener(this);
			dg.add(lb);
			dg.add(btn);
			dg.add(btn2);
dg.add(imageLabel);
			dg.setSize(300, 200);
			dg.setLayout(new FlowLayout(FlowLayout.CENTER));
			dg.setVisible(true);
		}
	}

	void BgColorOfO() {
		if (b1.getText() == "O") {
			b1.setForeground(Color.BLUE);
		}
		if (b2.getText() == "O") {
			b2.setForeground(Color.BLUE);
		}
		if (b3.getText() == "O") {
			b3.setForeground(Color.BLUE);
		}
		if (b4.getText() == "O") {
			b4.setForeground(Color.BLUE);
		}
		if (b5.getText() == "O") {
			b5.setForeground(Color.BLUE);
		}
		if (b6.getText() == "O") {
			b6.setForeground(Color.BLUE);
		}
		if (b7.getText() == "O") {
			b7.setForeground(Color.BLUE);
		}
		if (b8.getText() == "O") {
			b8.setForeground(Color.BLUE);
		}
		if (b9.getText() == "O") {
			b9.setForeground(Color.BLUE);
		}
	}

	void BgColorOfX() {
		if (b1.getText() == "X") {
			b1.setForeground(Color.BLUE);
		}
		if (b2.getText() == "X") {
			b2.setForeground(Color.BLUE);
		}
		if (b3.getText() == "X") {
			b3.setForeground(Color.BLUE);
		}
		if (b4.getText() == "X") {
			b4.setForeground(Color.BLUE);
		}
		if (b5.getText() == "X") {
			b5.setForeground(Color.BLUE);
		}
		if (b6.getText() == "X") {
			b6.setForeground(Color.BLUE);
		}
		if (b7.getText() == "X") {
			b7.setForeground(Color.BLUE);
		}
		if (b8.getText() == "X") {
			b8.setForeground(Color.BLUE);
		}
		if (b9.getText() == "X") {
			b9.setForeground(Color.BLUE);
		}
	}

	void winner() {
		if (sb1 == sb2 && sb2 == sb3) {
			b1.setForeground(Color.GREEN);
			b2.setForeground(Color.GREEN);
			b3.setForeground(Color.GREEN);
		} else if (sb4 == sb5 && sb5 == sb6) {
			b4.setForeground(Color.GREEN);
			b5.setForeground(Color.GREEN);
			b6.setForeground(Color.GREEN);
		} else if (sb7 == sb8 && sb8 == sb9) {
			b7.setForeground(Color.GREEN);
			b8.setForeground(Color.GREEN);
			b9.setForeground(Color.GREEN);
		} else if (sb1 == sb4 && sb4 == sb7) {
			b1.setForeground(Color.GREEN);
			b2.setForeground(Color.GREEN);
			b3.setForeground(Color.GREEN);
		} else if (sb2 == sb5 && sb5 == sb8) {
			b2.setForeground(Color.GREEN);
			b5.setForeground(Color.GREEN);
			b8.setForeground(Color.GREEN);
		} else if (sb3 == sb6 && sb6 == sb9) {
			b3.setForeground(Color.GREEN);
			b6.setForeground(Color.GREEN);
			b9.setForeground(Color.GREEN);
		} else if (sb1 == sb5 && sb5 == sb9) {
			b1.setForeground(Color.GREEN);
			b5.setForeground(Color.GREEN);
			b9.setForeground(Color.GREEN);
		} else if (sb3 == sb5 && sb5 == sb7) {
			b3.setForeground(Color.GREEN);
			b5.setForeground(Color.GREEN);
			b7.setForeground(Color.GREEN);
		}
	}

	
}













class StonePaperScissor extends JFrame implements ActionListener{


JButton friend1,friend2,friend3;
JButton stone1, paper1, scissor1, stone2, paper2, scissor2;
JLabel l1=new JLabel(); 
JLabel l6=new JLabel("Click your Choice!!");
int guess;
JFrame f1=new JFrame("---------------------------------------------------STONE PAPER SCISSOR---------------------------------------------------");
JFrame f2=new JFrame("result ");


JFrame s1=new JFrame("Playing Choice ");
JFrame s2 = new JFrame("Playing with Friend ");
Random rand=new Random();
String str,result;

JButton friend = new JButton("Play with FRIEND");
JButton comp=new JButton("Play with COMPUTER");
    
    int Randno; 
JButton b4=new JButton("REPLAY");
JButton b5=new JButton("EXIT");

   ImagePanel panel = new ImagePanel(
        new ImageIcon("bkg.png").getImage());

ImagePanel panel2=new ImagePanel(
        new ImageIcon("bkg.png").getImage());

JLabel imageLabel = new JLabel();
ImageIcon ii=new ImageIcon(this.getClass().getResource("gif.gif"));

JLabel imageLabel2 = new JLabel();
JLabel imageLabel3 = new JLabel();

StonePaperScissor(){

imageLabel.setIcon(ii);

//imageLabel.setBounds(30,20,500,500);
imageLabel.setBounds(30,-10,500,500);

panel2.add(friend);
panel2.add(comp); 


Randno= rand.nextInt(3);

    if(Randno==0){
   str =  " Computer's Choice : STONE  ";
    }
else if(Randno==1){
   str =  " Computer's Choice : PAPER  ";
     }
else if(Randno==2){
   str =  " Computer's Choice : SCISSOR  ";
    }

  
    l1=new JLabel(str);
    l1.setFont(new Font("Arial",Font.BOLD,20));
    l1.setBounds(150,180,3000,50);
       
    f1.setSize(1600,900);
    f1.setLayout(null);
    
  
    f1.getContentPane().add(panel);
    
    s1.getContentPane().add(panel2);

    f1.setBackground(Color.green);
        
    f2.setSize(1600,900);
    f2.setLayout(null);
    s1.setSize(1600,900); 
s1.setLayout(null);  

panel2.add(friend);
panel2.add(comp); 
panel2.add(imageLabel);

     s1.setVisible(true);

stone1 = new JButton("");
paper1 = new JButton("");
scissor1 = new JButton("");
stone2 = new JButton("");
paper2 = new JButton("");
scissor2 = new JButton("");

stone1.setIcon(new ImageIcon("stone.jpeg"));
stone2.setIcon(new ImageIcon("stone.jpeg"));
paper1.setIcon(new ImageIcon("paper1.jpeg"));
paper2.setIcon(new ImageIcon("paper.jpeg"));
scissor1.setIcon(new ImageIcon("scissor.jpeg"));
scissor2.setIcon(new ImageIcon("scissor.jpeg"));
Dimension size = stone1.getPreferredSize();

stone1.setBackground(Color.WHITE);
stone2.setBackground(Color.WHITE);
paper1.setBackground(Color.WHITE);
paper2.setBackground(Color.WHITE);
scissor1.setBackground(Color.WHITE);
scissor2.setBackground(Color.WHITE);

    
    b4.setBounds(550,590,400,50);  
    b5.setBounds(550,660,400,50);

    friend.setBounds(590,320,400,50);
    comp.setBounds(590,420,400,50);

    stone1.addActionListener(this);
    paper1.addActionListener(this);
    scissor1.addActionListener(this);
    
b4.addActionListener(this);
b5.addActionListener(this);

friend.addActionListener(this);
comp.addActionListener(this);
    
    
    b4.setBackground(Color.orange);

    b5.setBackground(Color.orange);

friend.setBackground(Color.orange);
comp.setBackground(Color.orange);
l6.setForeground(Color.red);
 

f2.add(b4);
f2.add(l1); 
f2.add(b5);  


stone1.setBounds(70,140,400,490);
paper1.setBounds(600,140,400,490);
scissor1.setBounds(1100,140,400,490);
l6.setBounds(35,40,170,35);
l6.setForeground(Color.orange);

      panel.add(stone1);
      panel.add(paper1);
      panel.add(scissor1);
      panel.add(l6);


}





public void actionPerformed(ActionEvent e)  {
   
  
   
if(e.getSource() ==stone1){
    guess = 0;
    stone1.setBackground(Color.red);

          if(Randno==1){ 

ImageIcon i=new ImageIcon(this.getClass().getResource("PaSt.gif"));
imageLabel2.setIcon(i);

imageLabel2.setBounds(420,80,900,500);
f2.add(imageLabel2);
               
         result = "YOU LOST ! BETTER LUCK NEXT TIME...";       
                   
}
                  else if(Randno==2){
                  result = "HURRAY ! YOU WON ... YOUR STONE DESTROYED OPPONENTS SCISSOR";       
                  
ImagePanel panel1 = new ImagePanel(
        new ImageIcon("RoSc.jpeg").getImage()); 
 panel1.setBounds(580,170,570,450); 
 f2.getContentPane().add(panel1); 

ImageIcon y=new ImageIcon(this.getClass().getResource("jetha2.gif"));
imageLabel3.setIcon(y);

imageLabel3.setBounds(1020,350,500,500);
f2.add(imageLabel3);   
 
} 
                  else{
                  result = " MATCH TIED ... BOTH CHOICES ARE SAME ";       
                   
ImagePanel panel1 = new ImagePanel(
        new ImageIcon("RoRo.jpeg").getImage()); 
 panel1.setBounds(500,150,570,410); 
 f2.getContentPane().add(panel1); 


}
JLabel l2=new JLabel(result);
l2.setFont(new Font("Arial",Font.BOLD,38));
 l2.setBounds(270,30,5000,50);
f2.add(l2);
f1.dispose();
f2.setVisible(true);

    }
else if(e.getSource() ==paper1){
    guess=1;
    paper1.setBackground(Color.red);
                 
                 if(Randno==2){
                  result = "YOU LOST ! BETTER LUCK NEXT TIME...";       
      ImageIcon i=new ImageIcon(this.getClass().getResource("ScPa.gif"));
imageLabel2.setIcon(i);

imageLabel2.setBounds(420,80,900,500);
f2.add(imageLabel2);         

   }
                  else if(Randno==0){
                  result = "HURRAY ! YOU WON ... YOUR PAPER COVERED OPPONENTS STONE ";
ImageIcon i=new ImageIcon(this.getClass().getResource("PaSt.gif"));
imageLabel2.setIcon(i);

imageLabel2.setBounds(420,80,900,500);
f2.add(imageLabel2);

ImageIcon y=new ImageIcon(this.getClass().getResource("jetha2.gif"));
imageLabel3.setIcon(y);

imageLabel3.setBounds(1020,350,500,500);
f2.add(imageLabel3);  
                   } 

                  else{
                  result = " MATCH TIED ... BOTH CHOICES ARE SAME ";       
   ImagePanel panel1 = new ImagePanel(
        new ImageIcon("PaPa.png").getImage()); 
 panel1.setBounds(500,160,570,410); 
 f2.getContentPane().add(panel1);                
} 
JLabel l2=new JLabel(result);
l2.setFont(new Font("Arial",Font.BOLD,38));
 l2.setBounds(300,30,5000,50);
f2.add(l2);
f1.dispose();
f2.setVisible(true);


}

else if(e.getSource() ==scissor1){
    guess =2;

    scissor1.setBackground(Color.red);
                 if(Randno==0){
                  result = "YOU LOST ! BETTER LUCK NEXT TIME...";       
                
ImagePanel panel1 = new ImagePanel(
        new ImageIcon("RoSc.png").getImage()); 
 panel1.setBounds(560,190,570,400); 
 f2.getContentPane().add(panel1);
   }
                  else if(Randno==1){
                  result = "HURRAY ! YOU WON ... YOUR SCISSOR CUTTED OPPONENTS PAPER";       
        ImageIcon i=new ImageIcon(this.getClass().getResource("ScPa.gif"));
imageLabel2.setIcon(i);
imageLabel2.setBounds(420,80,900,500);

 f2.add(imageLabel2); 

   ImageIcon y=new ImageIcon(this.getClass().getResource("jetha1.gif"));
imageLabel3.setIcon(y);

imageLabel3.setBounds(1020,350,500,500);
f2.add(imageLabel3);                      
 } 
                  else{
                  result = " MATCH TIED ... BOTH CHOICES ARE SAME ";       
ImagePanel panel1 = new ImagePanel(
        new ImageIcon("ScSc.png").getImage()); 
panel1.setBounds(648,188,470,450); 
 f2.getContentPane().add(panel1);                   
 } 

JLabel l2=new JLabel(result);
l2.setFont(new Font("Arial",Font.BOLD,38));
 l2.setBounds(290,30,5000,50);
f2.add(l2);
f1.dispose();
f2.setVisible(true);


 }


if(e.getSource()==b4){
  b4.setBackground(Color.red);
  f2.dispose();
new StonePaperScissor();

}

if(e.getSource()==b5){
  b4.setBackground(Color.red);
  f2.dispose();
ChoiceFrame d=new ChoiceFrame();


}

if(e.getSource()==comp){
s1.dispose();
f1.setVisible(true);

}

}



}











 class GuessTheColor implements ActionListener {
    // initializing
    JFrame frame;
    JPanel panel, colorPanel, outOfTime;
    JButton Red, Blue, Green, Magenta, Pink, Black, start, restart, exit;
    JLabel l, score, finalScore;
    JProgressBar jb, progressBar;
    JDialog dialog;

    // creating obj of random
    Random r = new Random();
    int color = r.nextInt(6);
    int scoreVal = 0, i = 100;
    int sleep = 30;

    GuessTheColor() {
        // creating object
        frame = new JFrame("Choose The Color Game");
        panel = new JPanel();
        Red = new JButton("RED");
        Blue = new JButton("BLUE");
        Green = new JButton("GREEN");
        Magenta = new JButton("MAGENTA");
        Pink = new JButton("PINK");
        Black = new JButton("BLACK");
        start = new JButton("start");
        dialog = new JDialog(frame, "out of time", true);
        dialog.setSize(300, 200);
        dialog.setLayout(new FlowLayout());
        outOfTime = new JPanel();
        outOfTime.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        score = new JLabel("score :", JLabel.LEFT);
        l = new JLabel("color will display here", JLabel.CENTER);
        jb = new JProgressBar(SwingConstants.VERTICAL);
        jb.setValue(100);
        jb.setStringPainted(true);
        progressBar = new JProgressBar(SwingConstants.VERTICAL);
        progressBar.setValue(100);
        progressBar.setStringPainted(true);
        frame.setLayout(new BorderLayout(50, 50));
        colorPanel = new JPanel();
        restart = new JButton("restart");
        finalScore = new JLabel("Your Score is :" + scoreVal);
        exit = new JButton("X");
        colorPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        // adding in frame/panel
        // this is created by abhijeet
        panel.add(Red);
        panel.add(Blue);
        panel.add(Green);
        panel.add(Magenta);
        panel.add(Pink);
        panel.add(Black);
        frame.add(score, BorderLayout.SOUTH);
        colorPanel.add(l);
        colorPanel.add(start);
        frame.add(jb, BorderLayout.EAST);
        frame.add(progressBar, BorderLayout.WEST);
        frame.add(colorPanel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        dialog.add(outOfTime);
        outOfTime.add(finalScore);
        outOfTime.add(restart);
        outOfTime.add(exit);
        // adding actionlistener
        Red.addActionListener(this);
        Blue.addActionListener(this);
        Green.addActionListener(this);
        Magenta.addActionListener(this);
        Pink.addActionListener(this);
        Black.addActionListener(this);
        start.addActionListener(this);
        restart.addActionListener(this);
        exit.addActionListener(this);
        // adding fonts and colors
        l.setFont(new Font("Verdana", Font.BOLD, 30));

        jb.setBackground(Color.WHITE);
        progressBar.setBackground(Color.WHITE);
        jb.setForeground(Color.BLACK);
        progressBar.setForeground(Color.BLACK);

        Red.setBackground(Color.RED);
        Blue.setBackground(Color.BLUE);
        Green.setBackground(Color.GREEN);
        Magenta.setBackground(Color.MAGENTA);
        Pink.setBackground(Color.PINK);
        Black.setBackground(Color.BLACK);
        Black.setForeground(Color.WHITE);
        exit.setBackground(Color.RED);
        exit.setForeground(Color.WHITE);

        panel.setBackground(Color.LIGHT_GRAY);
        frame.setBackground(Color.GRAY);
        start.setBackground(Color.BLACK);
        start.setForeground(Color.WHITE);
        jb.setFont(new Font("", Font.PLAIN, 30));
        progressBar.setFont(new Font("", Font.PLAIN, 30));
        start.setFont(new Font("", Font.BOLD, 25));
        // adding layout and size to frame/panel
        panel.setLayout(new GridLayout(3, 3, 50, 30));

        frame.setSize(1600, 900);
        frame.setVisible(true);
        fill();
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == start) {
            randomColor();
            start.setVisible(false);
            l.setText("Select this Color");
            score.setText("score :" + scoreVal);

            i = 100;
            sleep--;
        } else if (a.getSource() == restart) {
            scoreVal = 0;
            i = 100;
            sleep = 30;
            dialog.dispose();
            score.setText("score :" + scoreVal);

        } else if (a.getSource() == exit) {
            frame.dispose();
            dialog.dispose();
        } else if (a.getSource() == Red && color == 0) {
            scoreVal++;
            randomColor();
            score.setText("score :" + scoreVal);
            i = 100;
            sleep--;
            finalScore.setText("Your Score is :" + scoreVal);

        } else if (a.getSource() == Blue && color == 1) {
            scoreVal++;
            randomColor();
            score.setText("score :" + scoreVal);
            i = 100;
            sleep--;
            finalScore.setText("Your Score is :" + scoreVal);

        } else if (a.getSource() == Green && color == 2) {
            scoreVal++;
            randomColor();
            score.setText("score :" + scoreVal);
            i = 100;
            sleep--;
            finalScore.setText("Your Score is :" + scoreVal);

        } else if (a.getSource() == Magenta && color == 3) {
            scoreVal++;
            randomColor();
            score.setText("score :" + scoreVal);
            i = 100;
            sleep--;
            finalScore.setText("Your Score is :" + scoreVal);

        } else if (a.getSource() == Pink && color == 4) {
            scoreVal++;
            randomColor();
            score.setText("score :" + scoreVal);
            i = 100;
            sleep--;
            finalScore.setText("Your Score is :" + scoreVal);

        } else if (a.getSource() == Black && color == 5) {
            scoreVal++;
            randomColor();
            score.setText("score :" + scoreVal);
            i = 100;
            sleep--;
            finalScore.setText("Your Score is :" + scoreVal);

        }
    }

    public void randomColor() {
        System.out.println(color);
        color = r.nextInt(6);
        System.out.println(sleep);
        switch (color) {
            case 0:
                colorPanel.setBackground(Color.RED);
                break;
            case 1:
                colorPanel.setBackground(Color.BLUE);
                break;
            case 2:
                colorPanel.setBackground(Color.GREEN);
                break;
            case 3:
                colorPanel.setBackground(Color.MAGENTA);
                break;
            case 4:
                colorPanel.setBackground(Color.PINK);
                break;
            case 5:
                colorPanel.setBackground(Color.BLACK);
                break;
            default:
                break;
        }
    }

    public void fill() {
        try {
            while (i <= 100) {

                if (i == 0 && scoreVal > 0) {
                    dialog.setVisible(true);
                }

                jb.setValue(i - 1);
                progressBar.setValue(i - 1);

                Thread.sleep(sleep);

                i -= 1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
















class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}









class ChoiceFrame extends JFrame implements ActionListener {

JFrame f1=new JFrame();

JButton SPS=new JButton("");
JButton TTT=new JButton("");
JButton STD=new JButton("");
JButton GTC=new JButton("");

JLabel l1=new JLabel("Select the Game you want to PLAY !!");
ImagePanel panel = new ImagePanel(
        new ImageIcon("bg2.jpg").getImage());


ChoiceFrame(){

l1.setFont(new Font("Arial",Font.BOLD,18));
	SPS.setIcon(new ImageIcon("SPSG.jpeg"));
	TTT.setIcon(new ImageIcon("XOXG.png"));
        STD.setIcon(new ImageIcon("StThDi.jpeg"));
        GTC.setIcon(new ImageIcon("GTC.jpeg"));

        STD.setBounds(150,170,220,200);
	SPS.setBounds(520,170,220,200);
	TTT.setBounds(900,170,220,200);
        GTC.setBounds(1280,170,220,200);

panel.setSize(1600,900);
SPS.addActionListener(this);
TTT.addActionListener(this);
GTC.addActionListener(this);

l1.setBounds(470,30,500,60);
l1.setForeground(Color.BLACK);
panel.add(l1);
panel.add(SPS);
panel.add(TTT);
panel.add(STD);
panel.add(GTC);

f1.setSize(1600,900);


f1.setVisible(true);
f1.add(panel);



}

public void actionPerformed(ActionEvent e){


    if(e.getSource()==SPS){
         StonePaperScissor s=new StonePaperScissor();
          f1.dispose();
            
}
     if(e.getSource()==TTT){
          TickTackToe t=new TickTackToe();
          f1.dispose();
}

     if(e.getSource()==STD){

    //  StateTheDiff1 d=new StateTheDiff1();
    
}
      if(e.getSource()==GTC){

       GuessTheColor j=new GuessTheColor();
    
}




}






}


public class GamesHubProject{


public static void main(String args[]){

ChoiceFrame c=new ChoiceFrame();

}


}
