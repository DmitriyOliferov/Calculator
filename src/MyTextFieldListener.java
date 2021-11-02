import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyTextFieldListener implements FocusListener {
    private JTextField textField;


    MyTextFieldListener(JTextField textField){
        this.textField = textField;

    }

    @Override
    public void focusGained(FocusEvent e) {
        if (textField.getText().trim().equals(TestGUI.IMPUT_CHISLO)){
            textField.setText("");
            textField.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (textField.getText().trim().equals("")) {
            textField.setText(TestGUI.IMPUT_CHISLO);
            textField.setForeground(Color.GRAY);
        }
    }
}
