import javax.swing.*;
import java.awt.BorderLayout;

public class AppFrame extends JFrame {
    private TitleBar titleBar;
    private Footer footer;

    private JButton newTask;
    private JButton clear;

    public AppFrame(){
        // Creating the basic frame
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // Creating title bar and footer
        titleBar = new TitleBar();
        footer = new Footer();

        // Adding title bar and footer in the frame
        this.add(titleBar, BorderLayout.NORTH);
        this.add(footer, BorderLayout.SOUTH);

        // Get the functionalities of footer buttons to these variables
        newTask = footer.getNewTask();
        clear = footer.getClear();
    }
}
