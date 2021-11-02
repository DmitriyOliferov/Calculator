import javax.swing.*;

public class MyPanel extends JPanel {
    MyPanel(String name, int width, int height){
        super.setSize(width, height);
        super.setName(name);
        super.setBorder(BorderFactory.createEtchedBorder());
    }
}
