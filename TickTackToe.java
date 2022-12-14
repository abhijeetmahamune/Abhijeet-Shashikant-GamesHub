import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TickTackToe implements ActionListener {
	JFrame f;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	int a = 0, condition;
	String sb = "", sb1, sb2, sb3, sb4, sb5, sb6, sb7, sb8, sb9;
	JDialog dg, dg2;
	JLabel lb, lb2;
	JButton btn, btn2, btn3;

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

		f.setSize(500, 500);
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

	public static void main(String args[]) {
		new TickTackToe();
	}
}