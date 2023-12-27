import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    public List(){
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);

        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400, 500));
    }
}
