import javax.swing.*;
import java.util.Random;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.lang.Math;


public class StonePaperScissor extends JFrame implements ActionListener{


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
int score=0;

StonePaperScissor(){


 
Randno= rand.nextInt(3);
   ImagePanel panel = new ImagePanel(
        new ImageIcon("bkg.png").getImage());




ImagePanel panel2=new ImagePanel(
        new ImageIcon("bkg.png").getImage());


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
    
    l1.setBounds(100,100,300,50);
       
    f1.setSize(1000,500);
    f1.setLayout(null);
    
  
    f1.getContentPane().add(panel);
    
    s1.getContentPane().add(panel2);

    f1.setBackground(Color.green);
        
    f2.setSize(1000,500);
    f2.setLayout(null);
    s1.setSize(1000,500); 
s1.setLayout(null);  



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

    
    b4.setBounds(90,270,400,50);  
    b5.setBounds(90,340,400,50);

    friend.setBounds(300,120,400,50);
    comp.setBounds(300,190,400,50);

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

panel2.add(friend);
panel2.add(comp); 

stone1.setBounds(30,50,300,490);
paper1.setBounds(340,50,300,490);
scissor1.setBounds(650,50,300,490);
l6.setBounds(35,10,170,35);
l6.setForeground(Color.orange);

      panel.add(stone1);
      panel.add(paper1);
      panel.add(scissor1);
      panel.add(l6);


     s1.setVisible(true);


}





public void actionPerformed(ActionEvent e)  {
   
  
   
if(e.getSource() ==stone1){
    guess = 0;
    stone1.setBackground(Color.red);

          if(Randno==1){
ImagePanel panel1 = new ImagePanel(
        new ImageIcon("PaSt.jpeg").getImage()); 
 panel1.setBounds(500,70,570,380); 
 f2.getContentPane().add(panel1);                  result = "YOU LOST ! BETTER LUCK NEXT TIME...";       
                   
}
                  else if(Randno==2){
                  result = "HURRAY ! YOU WON ... YOUR STONE DESTROYED OPPONENTS SCISSOR"; 
score++;      
                  
ImagePanel1 panel1 = new ImagePanel1(
        new ImageIcon("RoSc.jpeg").getImage()); 
 panel1.setBounds(500,40,570,380); 
 f2.getContentPane().add(panel1); 
 
} 
                  else{
                  result = " MATCH TIED ... BOTH CHOICES ARE SAME ";       
                   
ImagePanel1 panel1 = new ImagePanel1(
        new ImageIcon("RoRo.jpeg").getImage()); 
 panel1.setBounds(500,40,570,380); 
 f2.getContentPane().add(panel1); 


}
JLabel l2=new JLabel(result);
 l2.setBounds(100,160,500,50);
f2.add(l2);
f1.dispose();
f2.setVisible(true);

    }
else if(e.getSource() ==paper1){
    guess=1;
    paper1.setBackground(Color.red);
                 
                 if(Randno==2){
                  result = "YOU LOST ! BETTER LUCK NEXT TIME...";       
       ImagePanel1 panel1 = new ImagePanel1(
        new ImageIcon("ScPa.jpg").getImage()); 
 panel1.setBounds(500,40,570,380); 
 f2.getContentPane().add(panel1);          

   }
                  else if(Randno==0){
                  result = "HURRAY ! YOU WON ... YOUR PAPER COVERED OPPONENTS STONE ";
score++;
ImagePanel1 panel1 = new ImagePanel1(
        new ImageIcon("PaSt.jpeg").getImage()); 
 panel1.setBounds(500,40,570,380); 
 f2.getContentPane().add(panel1); 
                   } 

                  else{
                  result = " MATCH TIED ... BOTH CHOICES ARE SAME ";       
   ImagePanel1 panel1 = new ImagePanel1(
        new ImageIcon("PaPa.jpeg").getImage()); 
 panel1.setBounds(500,40,570,380); 
 f2.getContentPane().add(panel1);                
} 
JLabel l2=new JLabel(result);
 l2.setBounds(100,160,500,50);
f2.add(l2);
f1.dispose();
f2.setVisible(true);


}

else if(e.getSource() ==scissor1){
    guess =2;

    scissor1.setBackground(Color.red);
                 if(Randno==0){
                  result = "YOU LOST ! BETTER LUCK NEXT TIME...";       
                
ImagePanel1 panel1 = new ImagePanel1(
        new ImageIcon("RoSc1.jpeg").getImage()); 
 panel1.setBounds(500,40,470,380); 
 f2.getContentPane().add(panel1);
   }
                  else if(Randno==1){
                  result = "HURRAY ! YOU WON ... YOUR SCISSOR CUTTED OPPONENTS PAPER";   
score++;    
     ImagePanel1 panel1 = new ImagePanel1(
        new ImageIcon("ScPa.jpg").getImage()); 
 panel1.setBounds(500,40,470,380); 
 f2.getContentPane().add(panel1);             
 } 
                  else{
                  result = " MATCH TIED ... BOTH CHOICES ARE SAME ";       
ImagePanel1 panel1 = new ImagePanel1(
        new ImageIcon("ScSc.jpg").getImage()); 
 panel1.setBounds(650,50,470,380); 
 f2.getContentPane().add(panel1);                   
 } 

JLabel l2=new JLabel(result);
 l2.setBounds(100,160,500,50);
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

}

if(e.getSource()==comp){
s1.dispose();
f1.setVisible(true);

}

}








    
    public static void main(String args[]){
     
    new StonePaperScissor();
    
   
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





class ImagePanel1 extends JPanel {

  private Image img;

  public ImagePanel1(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel1(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
setBounds(500,31,300,30);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}
