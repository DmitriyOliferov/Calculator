import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        FlowLayout fl = new FlowLayout();
//        frame.setLayout(fl);

        JButton button1 = new JButton("+");
        button1.setSize(30,30);
//        fl.addLayoutComponent("+",button1);

        JPanel panel = new JPanel();
        panel.setSize(200,200);
        panel.setLayout(fl);
        panel.add(button1);

        frame.getContentPane().add(panel);
    }
}
