import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AppFrame extends JFrame {
    private TitleBar titleBar;
    private Footer footer;
    private List list;

    private JButton newTask;
    private JButton clear;

    public AppFrame(){
        // Creating the basic frame
        this.setSize(400, 700);
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
                Task task = new Task();
                list.add(task);
                list.updateNumbers();

                // Done Button in task
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        list.updateNumbers();
                        revalidate();
                    }
                });

            }
        });
    }

}
