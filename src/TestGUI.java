import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;

import javax.swing.*;
import java.awt.*;

public class TestGUI {

    public final static String IMPUT_CHISLO = "Введите число";

    private MyFrame frame;

    private MyPanel panelFirst;
    private MyPanel panelSecond;
    private MyPanel panelLast;

    private MyTextField firstNum;
    private MyTextField secondNum;
    private MyTextField resultNum;

    private MyButton buttonPlus;
    private MyButton buttonMinus;
    private MyButton buttonUmn;
    private MyButton buttonDel;
    private MyButton buttonSkin;

    private JLabel resultText;
    private JLabel firstNumText;
    private JLabel secondNumText;

    private MyButtonListener listener;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new McWinLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        TestGUI testGUI = new TestGUI();

        testGUI.createLabels();
        testGUI.createTextFields();
        testGUI.createButton();
        testGUI.createListener();
        testGUI.createListenerSkin();
        testGUI.createListenerText();
        testGUI.createPanels();
        testGUI.createFrame();
    }

    private void createLabels() {
        firstNumText = new JLabel("Number 1");
        secondNumText = new JLabel("Number 2");
        resultText = new JLabel("Result");
    }

    private void createTextFields() {
        firstNum = new MyTextField(IMPUT_CHISLO,10);

        secondNum = new MyTextField(IMPUT_CHISLO,10);

        resultNum = new MyTextField(15, Color.RED);
        resultNum.setEditable(false);
        resultNum.setFocusable(false);
    }

    private void createButton() {
        buttonPlus = new MyButton("+");
        buttonMinus = new MyButton("-");
        buttonUmn = new MyButton("*");
        buttonDel = new MyButton("/");
        buttonSkin = new MyButton("Сменить скин");
    }

    private void createListener(){
        listener = new MyButtonListener(firstNum,secondNum,resultNum,buttonDel,buttonPlus,buttonMinus,buttonUmn);
    }

    private void createListenerSkin(){
        buttonSkin.addActionListener(new ChangeSkinActionListener(frame,new SmartLookAndFeel()));
    }

    private void createListenerText(){
        firstNum.addFocusListener(new MyTextFieldListener(firstNum));
        secondNum.addFocusListener(new MyTextFieldListener(secondNum));
    }

    private void createPanels() {
        panelFirst = new MyPanel("panel1", 100, 100);
        panelFirst.setPreferredSize(new Dimension(200, 50));
        panelFirst.setLayout(new FlowLayout(FlowLayout.LEFT));

        panelSecond = new MyPanel("panel2", 100, 100);
        panelSecond.setPreferredSize(new Dimension(200, 50));
        panelSecond.setLayout(new FlowLayout(FlowLayout.LEFT));

        panelLast = new MyPanel("panel3", 100, 100);
        panelLast.setPreferredSize(new Dimension(200, 50));
        panelLast.setLayout(new FlowLayout(FlowLayout.LEFT));

        panelFirst.add(firstNumText);
        panelFirst.add(firstNum);
        panelFirst.add(secondNumText);
        panelFirst.add(secondNum);

        panelSecond.add(buttonPlus);
        panelSecond.add(buttonMinus);
        panelSecond.add(buttonUmn);
        panelSecond.add(buttonDel);

        panelLast.add(resultText);
        panelLast.add(resultNum);
        panelLast.add(buttonSkin);
    }

    private void createFrame() {
        frame = new MyFrame("Calculate", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.setResizable(false);

        frame.getContentPane().add(panelFirst, BorderLayout.NORTH);
        frame.getContentPane().add(panelSecond, BorderLayout.CENTER);
        frame.getContentPane().add(panelLast, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}