import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener
{
    TextField t;
    Label l;

    KeyDemo()
    {
        t = new TextField(20);
        l = new Label("Press any key");

        t.addKeyListener(this);
        
        setLayout(new FlowLayout());

        add(t);
        add(l);

        setSize(400,300);
        setTitle("Key Event Demo");
        setVisible(true);

    }
    public void keyPressed(KeyEvent e)
    {
        l.setText("key Pressed " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e)
    {}
    public void keyTyped(KeyEvent e)
    {}
    public static void main(String[] args) 
    {
        new KeyDemo();
    }
}