import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ExforRadio extends JFrame implements ActionListener
{
    JRadioButton r1,r2;
    JButton b1;
    JLabel L1;
    ExforRadio()
    {
        r1=new JRadioButton("MALE");
        r2=new JRadioButton("FEMALE");
        b1=new JButton("Click");
        L1=new JLabel("Before Selected");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);
        add(b1);
        add(L1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected())
        {
            L1.setText("You selected Male");
            System.out.println("You selected Male");
        }
        if(r2.isSelected())
        {
            L1.setText("You selected FeMale");
            System.out.println("You selected FeMale");
        }
    }
    public static void main(String args[])
    {
        new ExforRadio();
        
    }
}