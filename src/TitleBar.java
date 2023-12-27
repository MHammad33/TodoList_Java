import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Dimension;

public class TitleBar extends JPanel {
    public TitleBar(){
        this.setPreferredSize(new Dimension(400, 80));

        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200, 60));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);
    }
}
