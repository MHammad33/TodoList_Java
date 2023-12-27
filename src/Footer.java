import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Footer extends JPanel {
        JButton addTask;
        JButton clear;

        Border emptyBorder = BorderFactory.createEmptyBorder();
    public Footer(){
        this.setPreferredSize(new Dimension(400, 60));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        addTask.setVerticalAlignment(JButton.BOTTOM);
        addTask.setBackground(Color.white);
        this.add(addTask);

        // For space between buttons
        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear Finished Task");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        clear.setBackground(Color.white);
        this.add(clear);
    }
}
