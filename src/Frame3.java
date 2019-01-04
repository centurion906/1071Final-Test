import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame3 extends JFrame {
    Container cp;
    private JLabel jlb = new JLabel("遊戲結束！");
    private JButton jbtn = new JButton("再來一局");
    private JButton jbtn1 = new JButton("離開");
    private JPanel jpn = new JPanel(new GridLayout(3,1,3,3));
    Frame2 frm5;
    public Frame3(Frame2 frm6){
        frm5 = frm6;
        ex();
    }private void ex(){
        this.setBounds(500,100,200,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        this.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosed(WindowEvent e) {
//                frm5.setVisible(true);
//            }
//        });
        cp = this.getContentPane();
        cp.add(jpn);
        jpn.add(jlb);
        jpn.add(jbtn);
        jpn.add(jbtn1);
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame1 frm7 = new Frame1();
                frm7.setVisible(true);
                Frame3.this.dispose();
            }
        });
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}