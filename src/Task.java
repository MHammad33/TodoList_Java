import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    JLabel index;
    JLabel taskName;
    JButton done;
    JButton delete;
    boolean checked;

    public Task(String task){
        // Initial Style
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.blue);
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
        taskName.setForeground(Color.white);
        taskName.setBackground(Color.blue);
        this.add(taskName, BorderLayout.CENTER);

        // Set the Button delete in the list
        delete = new JButton("Delete");
        delete.setPreferredSize(new Dimension(40, 20));
        delete.setBorder(BorderFactory.createEmptyBorder());
        delete.setBackground(Color.red);
        delete.setFocusPainted(false); // removes the focus after clicking
        this.add(delete, BorderLayout.AFTER_LAST_LINE);


        // Task is not done yet
        checked = false;

        // Set the Button done in the list
        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBackground(Color.green);
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

    public JButton getDelete(){
        return delete;
    }

    public boolean getState(){
        return checked;
    }

    public void changeState() {
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        checked = true;
        revalidate();
    }

    public void deleteTask(){
        this.setBackground(Color.white);
        taskName.setText("");
        revalidate();
    }
}
