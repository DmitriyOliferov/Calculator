import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeSkinActionListener implements ActionListener {

    private LookAndFeel laf;
    private MyFrame frame;

        public ChangeSkinActionListener(MyFrame frame, LookAndFeel laf){
            this.frame = frame;
            this.laf = laf;
        }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(frame);
    }
}
