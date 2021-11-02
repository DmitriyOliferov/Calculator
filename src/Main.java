import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        FlowLayout flF = new FlowLayout();
        FlowLayout flS = new FlowLayout(33,5,5);
        FlowLayout flR = new FlowLayout(33,5,5);
        JTextField firstNum = new JTextField("Первое число");
        firstNum.setSize(70,70);
        JTextField secondNum = new JTextField("Второе число");
        JButton buttonPlus = new JButton("+");
        buttonPlus.setSize(70,70);
        JButton buttonMinus = new JButton("-");
        buttonMinus.setSize(70,70);
        JButton buttonUmn = new JButton("*");
        buttonUmn.setSize(70,70);
        JButton buttonDel = new JButton("/");
        buttonDel.setSize(70,70);
        JLabel result = new JLabel();

        JPanel panelFirst = new JPanel();
        panelFirst.setSize(100,100);
        JPanel panelSecond = new JPanel();
        panelSecond.setSize(100,100);
        JPanel panelResult = new JPanel();
        panelResult.setSize(100,100);
        panelFirst.setLayout(flF);

        panelFirst.add(firstNum);
        panelFirst.add(secondNum);

        panelSecond.add(buttonPlus);
        panelSecond.add(buttonMinus);
        panelSecond.add(buttonUmn);
        panelSecond.add(buttonDel);

        panelResult.add(result);

        frame.getContentPane().add(panelFirst);
        frame.getContentPane().add(panelSecond);
        frame.getContentPane().add(panelResult);

    }
}
