import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    public List(){
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(10);

        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400, 500));
    }

    public void updateNumbers(){
        Component [] listItems = this.getComponents();

        for (int i = 0; i < listItems.length; i++) {
            if(listItems[i] instanceof Task){
                ((Task)listItems[i]).changeIndex(i+1);
            }
        }
    }

    public void updateNumbers(Task task){
        for (Component c : this.getComponents()) {
            if(c instanceof Task && c.equals(task)){
                remove(task);
                updateNumbers();
            }
        }
    }

    public void clearCompletedTasks() {
        for (Component c : this.getComponents()){
            if (c instanceof Task && ((Task)c).getState()){
                remove(c);
                updateNumbers();
            }
        }
    }
}
