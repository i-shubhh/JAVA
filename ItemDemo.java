import java.awt.*;
import java.awt.event.*;

public class ItemDemo extends Frame implements ItemListener 
{
    Checkbox cb;
    Label lbl;

    ItemDemo()
    {
        setTitle("EventItem Demonstration");
        setSize(400,250);
        setLayout(new FlowLayout());

        cb = new Checkbox("Select Me");
        lbl = new Label("Checkbox is Deselected");

        add(cb);
        add(lbl);

        cb.addItemListener(this);
        
        setVisible(true);

        addWindowListener(new WindowAdapter() 
        {
            public void WindowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(cb.getState())
        {
            lbl.setText("Checkbox is Selected");;
        }
        else
        {
            lbl.setText("Checkbox is Deselected");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException
    {
        new ItemDemo();
    }
} 