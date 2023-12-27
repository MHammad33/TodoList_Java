import javax.swing.JFrame;
import java.awt.BorderLayout;

public class AppFrame extends JFrame {
    private TitleBar titleBar;
    private Footer footer;
    public AppFrame(){
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        titleBar = new TitleBar();
        footer = new Footer();


        this.add(titleBar, BorderLayout.NORTH);
        this.add(footer, BorderLayout.SOUTH);
    }
}
