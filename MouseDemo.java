import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame implements MouseListener
{
    Label l;

    MouseDemo()
    {
        l = new Label("Perform any mouse Action");

        addMouseListener(this);

        setLayout(new FlowLayout());
        add(l);

        setSize(400,300);
        setTitle("MouseEvent Demo");
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
    l.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exited");
    }
    public static void main(String[] args) 
    {
        new MouseDemo();
    }

}