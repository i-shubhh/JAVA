import java.awt.*;
import java.awt.event.*;

public class WindowDemo extends Frame implements WindowListener
{
    Label l;
    
    WindowDemo()
    {
        setTitle("Window Item Demo");
        setSize(400,300);
        setLayout(new FlowLayout());

        l = new Label("Window Event Demonstration");
        add(l);

        addWindowListener(this);
        setVisible(true);
    }
    public void windowOpened(WindowEvent e)
    {
        l.setText("Window Opened");
    }
    public void windowActivated(WindowEvent e)
    {
        l.setText("Window Deactivated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        l.setText("Window Deactivated");
    }
    public void windowClosing(WindowEvent e)
    {
        l.setText("Window Closing");
        dispose();
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent e)
    {
        l.setText("Window Minimised");
    }
    public void windowDeiconified(WindowEvent e)
    {
        l.setText("Window Restored");
    }
    public static void main(String[] args) throws ClassNotFoundException
    {
        new WindowDemo();    
    }
}