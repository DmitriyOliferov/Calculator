import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(String title, int width, int height, LayoutManager layout){
        super(title);
        super.setSize(width,height);
        super.setLayout(layout);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
