import javax.swing.*;
import java.awt.*;

public class MyTextField extends JTextField {
    MyTextField(String text, int columns){
        this(columns);
        super.setText(text);
    }

    MyTextField(int columns){
        super.setColumns(columns);
        Font font = new Font("Courier",Font.ITALIC,12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    MyTextField(int columns, Color textColor){
        super.setColumns(columns);
        Font font = new Font("Courier",Font.ITALIC,12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
