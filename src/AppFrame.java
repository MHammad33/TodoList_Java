import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AppFrame extends JFrame {
    private TitleBar titleBar;
    private Footer footer;
    private List list;

    private JButton newTask;
    private JButton clear;
    private JTextField taskInput;

    public AppFrame(){
        // Creating the basic frame
        this.setSize(600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // Creating title bar and footer and list components to store texts
        titleBar = new TitleBar();
        footer = new Footer();
        list = new List();

        // Adding title bar and footer and list in the frame
        this.add(titleBar, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);

        // Get the functionalities of footer buttons to these variables
        newTask = footer.getNewTask();
        clear = footer.getClear();

        // Add Event Listeners
        addListeners();
    }

    public void addListeners(){
        newTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Create and Add Task
                taskInput = footer.getTaskInput();
                Task task = new Task(taskInput.getText());
                list.add(task);
                list.updateNumbers();
                taskInput.setText("");
                KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();

                // Done Button in task
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        list.updateNumbers();
                        revalidate();
                    }
                });

                // Delete Button in Task
                task.getDelete().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.deleteTask();
                        list.updateNumbers(task);
                        repaint();
                    }
                });

                task.getUpdate().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.updateTask(taskInput.getText());
                        taskInput.setText("");
                        KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();
                        list.updateNumbers();
                        repaint();
                    }
                });
            }
        });

        // Clear button in the footer
        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.clearCompletedTasks();
                repaint();
            }
        });
    }

}
