import java.awt.*;
import java.awt.event.*;

public class AirthmeticEvent extends Frame implements ActionListener
{
    TextField t1,t2,result;
    Button add,subtract;

    AirthmeticEvent()
    {
        setTitle("Airthmetic Operations");
        setSize(400,300);
        setLayout(new FlowLayout());

        add(new Label("Enter First Number:"));
        t1 = new TextField(10);
        add (t1);
        
        add (new Label("Enter Second Number: "));
        t2 = new TextField(10);
        add(t2);

        add = new Button("Add");
        subtract = new Button("Subtract");

        add(add);
        add(subtract);

        add(new Label("Result :"));
        result = new TextField(15);
        result.setEditable(false);
        add(result);
        
        add.addActionListener(this);
        subtract.addActionListener(this);

        setVisible(true);

        addWindowListener(new WindowAdapter()
    {
        public void  windowClosing(WindowEvent e)
        {
            dispose();
        }
    });
    }
    public void actionPerformed(ActionEvent e)
    {
        try{
            Double n1 = Double.parseDouble(t1.getText());
            Double n2 = Double.parseDouble(t2.getText());

            if (e.getSource() == add)
            {
                result.setText(String.valueOf(n1 + n2));
            }
            else if (e.getSource() == subtract)
            {
                result.setText(String.valueOf(n1 - n2));
            }
        }
    catch(NumberFormatException ex)
    {
        result.setText("Enter Valid Number");
    }
    }
    public static void main(String[] args) 
    {
        new AirthmeticEvent();
    }

}   