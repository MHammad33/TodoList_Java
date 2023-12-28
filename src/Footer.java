import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Footer extends JPanel {
        JButton addTask;
        JButton clear;
        JTextField taskInput;

        public Footer(){
            this.setPreferredSize(new Dimension(600, 100));

            // Input for task
            taskInput = new JTextField("");
            taskInput.setPreferredSize(new Dimension(300, 30));
            taskInput.setFont(new Font("Sans-serif", Font.PLAIN, 20));
            taskInput.setBackground(Color.white);
            this.add(taskInput);

            // For space between components
            this.add(Box.createHorizontalStrut(10));

            // Add Task Button Styling
            addTask = new JButton("Add Task");
            addTask.setBorder(new EmptyBorder(5, 5, 5, 5));
            addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
            addTask.setVerticalAlignment(JButton.BOTTOM);
            addTask.setBackground(Color.blue);
            addTask.setForeground(Color.white);
            this.add(addTask);

            // For space between buttons
            this.add(Box.createHorizontalStrut(10));

            // Clear Button Styling
            clear = new JButton("Clear Completed Tasks");
            clear.setBorder(new EmptyBorder(5, 5, 5, 5));
            clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
            clear.setBackground(Color.red);
            clear.setForeground(Color.white);
            this.add(clear);
        }

        public JButton getNewTask(){
            return addTask;
        }

        public JButton getClear(){
            return clear;
        }

        public JTextField getTaskInput(){
            return taskInput;
        }
}
