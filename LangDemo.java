import java.awt.*;
import java.awt.event.*;

public class LangDemo extends Frame implements ItemListener
{
    Choice ch;
    Label l;

    LangDemo()
    {
        ch = new Choice();
        l = new Label("Select a Program");

        ch.add("Java");
        ch.add ("Python");
        ch.add("c");
        ch.add("C++");
        ch.add("Javascript");

        ch.addItemListener(this);

        setLayout(new FlowLayout());

        add(ch);
        add(l);

        setSize(400,300);
        setTitle("itemEvent Demo");
        setVisible(true);

    }
    public void itemStateChanged(ItemEvent e)
    {
        String s = ch.getSelectedItem();
        l.setText("Selected language" + s);
    } 
    public static void main(String[] args) 
    {
        new LangDemo();
    }

}