
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class StateTheDiff extends JFrame implements ActionListener {

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

JButton ExitBtn=new JButton("");
JButton replayBtn=new JButton("");

JTextField sc=new JTextField("");
int score=0;
int level=1;


StateTheDiff() throws  LineUnavailableException,UnsupportedAudioFileException,IOException{

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




public static void main(String args[]) throws  LineUnavailableException,UnsupportedAudioFileException,IOException{

new StateTheDiff();


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

