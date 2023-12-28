import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    JLabel index;
    JLabel taskName;
    JButton done;

    public Task(String task){
        // Initial Style
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.red);
        this.setLayout(new BorderLayout());

        // Set the index of each task
        index = new JLabel("");
        index.setPreferredSize(new Dimension(50, 20));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setFont(new Font("Sans-serif", Font.BOLD, 20));
        index.setForeground(Color.white);
        this.add(index, BorderLayout.WEST);

        // Set the task in the center
        taskName = new JLabel(task);
        taskName.setPreferredSize(new Dimension(400, 60));
        taskName.setFont(new Font("Sans-serif", Font.PLAIN, 16));
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.red);
        this.add(taskName, BorderLayout.CENTER);

        // Set the Button done in the list
        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setFocusPainted(false); // removes the focus after clicking
        this.add(done, BorderLayout.EAST);

    }

    public void changeIndex(int num){
        this.index.setText(num + ". ");
        this.revalidate();
    }

    public JButton getDone(){
        return done;
    }

    public void changeState() {
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        revalidate();
    }
}
