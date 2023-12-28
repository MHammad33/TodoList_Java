import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task extends JPanel {
    JLabel index;
    JLabel taskName;
    JButton done;
    JButton delete;
    JButton update;
    boolean checked;

    public Task(String task){
        // Initial Style
        this.setBackground(Color.blue);

        GridLayout layout = new GridLayout(0, 6);
        layout.setVgap(10);
        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400, 200));

        // Set the index of each task
        index = new JLabel("");
        index.setPreferredSize(new Dimension(5, 20));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setFont(new Font("Sans-serif", Font.BOLD, 20));
        index.setForeground(Color.white);
        this.add(index);

        // Set the task in the center
        taskName = new JLabel(task);
        taskName.setPreferredSize(new Dimension(400, 60));
        taskName.setFont(new Font("Sans-serif", Font.PLAIN, 16));
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setForeground(Color.white);
        taskName.setBackground(Color.blue);
        this.add(taskName);


        // Set the Button delete in the task
        delete = new JButton("Delete");
        delete.setPreferredSize(new Dimension(40, 20));
        delete.setBorder(BorderFactory.createEmptyBorder());
        delete.setBackground(Color.red);
        delete.setFocusPainted(false); // removes the focus after clicking
        this.add(delete);


        // Task is not done yet
        checked = false;

        // Set the Button done in the list
        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBackground(Color.green);
        done.setFocusPainted(false); // removes the focus after clicking
        this.add(done);

        // Set the Button update in the task
        update = new JButton("Update");
        update.setPreferredSize(new Dimension(40, 20));
        update.setBorder(new EmptyBorder(5, 5, 5, 5));
        update.setBackground(Color.yellow);
        update.setFocusPainted(false); // removes the focus after clicking
        this.add(update);

        addUpdateListener();
    }

    private JTextField createTextField(){
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(500, 50));
        this.add(textField);
        return textField;
    }
    private void addUpdateListener() {
        JTextField textField = createTextField();
        update.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                taskName.setText(textField.getText());
                textField.setText("");
                repaint();
                revalidate();
            }
        });
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

    public JButton getUpdate(){
        return update;
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
