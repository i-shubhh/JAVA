import java.awt.*;
import java.awt.event.*;

public class ActionEventFirst extends Frame implements ActionListener
{
    Button btn;
    Label lbl;

ActionEventFirst()
{
    setTitle("ActionEvent Demonstration");
    setSize(400,250);
    setLayout(new FlowLayout());

    btn = new Button ("click me");
    lbl = new Label(" ");

    add (btn);
    add (lbl);

    btn.addActionListener(this);
    
    setVisible(true);

    addWindowListener(new WindowAdapter()
{
    public void windowClosing(WindowEvent e)
    {
                dispose();
    }
});
}

public void actionPerformed(ActionEvent e)
{
    lbl.setText("Welcome To Java Programming");
    validate();
}
public static void main(String[] args) 
{
    new ActionEventFirst();
}
}
