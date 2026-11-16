import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo extends Frame implements ActionListener {

Button btn;
Label lbl;
ActionEventDemo() {
    setTitle("ActionEvent Demonstration");
    setSize(400, 250);
    setLayout(new FlowLayout());
    btn = new Button("Click Me");
    lbl = new Label("");
    add(btn);
    add(lbl);
    btn.addActionListener(this);
    setVisible(true);
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            dispose();
        }
    });
}
public void actionPerformed(ActionEvent e) {
    lbl.setText("Welcome to Java Programming");
}
public static void main(String[] args) {
    new ActionEventDemo();
}

}