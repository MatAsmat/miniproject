
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBuutonTest {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 200);
        frame.setLocation(10, 10);
        frame.setTitle("Test Code By Mat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JRadioButton radio1 = new JRadioButton("มิลลิเมตร");
        panel.add(radio1);

        JRadioButton radio2 = new JRadioButton("เซนติเมตร");
        panel.add(radio2);

        JRadioButton radio3 = new JRadioButton("เมตร");
        panel.add(radio3);
        
        JRadioButton radio4 = new JRadioButton("กิโลเมตร");
        panel.add(radio4);

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);

        frame.add(panel);
    }
}

