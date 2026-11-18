import java.awt.*;
import java.awt.event.*;

public class FocusDemo extends Frame implements FocusListener
{
    TextField t1,t2;
    Label l;

    FocusDemo()
    {
        t1 = new TextField(20);
        t2 = new TextField(20);
        l = new Label("Click on any text field");

        t1.addFocusListener(this);
        t2.addFocusListener(this);

        setLayout(new FlowLayout());

        add(new Label("this is the 1st text field"));
        add(t1);

        add(new Label("this is the 2nd text field"));
        add(t2);

        add(l);

        setSize(400,300);
        setTitle("Focus Event demo");
        setVisible(true);

    }
    public void focusGained(FocusEvent e)
    {
        if( e.getSource() == t1)
            l.setText("1st Textfiled gained focus");
        else if(e.getSource() == t2)
            l.setText("2nd Textfield gained focus");

    }

    public void focusLost(FocusEvent e)
    {
        if(e.getSource() == t1)
            l.setText("1st Textfield Lost Focus");
        else if(e.getSource() == t2)
            l.setText("2nd Textfield Lost Focus");
    }
    public static void main(String[] args) 
    {
        new FocusDemo();
    }
}  