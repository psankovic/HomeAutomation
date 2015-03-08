package hr.sannk.com;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class HomeAutomation extends JFrame {


public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			HomeAutomation frame = new HomeAutomation();
			frame.setResizable(true);
//			frame.setResizable(false);
//			frame.setUndecorated(true);
//			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//			frame.setSize(dim);
			frame.setVisible(true);
		}
	});
}

public HomeAutomation() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(300, 300, 450, 300);
    JPanel panel = new JPanel(new MigLayout());
    JButton but1 = new JButton();
    JButton but2 = new JButton();
    JButton but3 = new JButton();
    JButton but4 = new JButton();
    JButton but5 = new JButton();
    JButton but6 = new JButton();

    panel.add(but1);
    panel.add(but2);
    panel.add(but3,"gap unrelated");
    panel.add(but4,"wrap");
    panel.add(but5);
    panel.add(but6,"span, grow");
	setContentPane(panel);
	}
}
