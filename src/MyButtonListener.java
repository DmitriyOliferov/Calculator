import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener{
    JTextField firstNum;
    JTextField secondNum;
    JTextField result;

    MyButtonListener(JTextField firstNum,
                     JTextField secondNum,
                     JTextField result, JButton ...buttons){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.result = result;
        for (JButton button : buttons){
            button.addActionListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton button = (JButton)e.getSource();
            switch (button.getText()){
                case ("+"):
                    result.setText(String.valueOf(Integer.parseInt(firstNum.getText()) + Integer.parseInt(secondNum.getText())));
                    break;
                case ("-"):
                    result.setText(String.valueOf(Integer.parseInt(firstNum.getText()) - Integer.parseInt(secondNum.getText())));
                    break;
                case ("*"):
                    result.setText(String.valueOf(Integer.parseInt(firstNum.getText()) * Integer.parseInt(secondNum.getText())));
                    break;
                case ("/"):
                    result.setText(String.valueOf(Integer.parseInt(firstNum.getText()) / Integer.parseInt(secondNum.getText())));
                    break;
            }
        }
    }
}
