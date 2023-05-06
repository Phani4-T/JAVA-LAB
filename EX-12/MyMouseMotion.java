import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyMouseMotion extends JFrame implements MouseMotionListener
{
    JLabel status;
    MyMouseMotion()
    {
        status =new JLabel("started");
        addMouseMotionListener(this);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(status);
    }

public void mouseMoved(MouseEvent e)
{
    int x=e.getX();
    int y=e.getY();
    status.setText("Mouse is at X:"+x+"Y:"+y);
}
public void mouseDragged(MouseEvent e)
{
    int x=e.getX();
    int y=e.getY();
    status.setText("Mouse is at X:"+x+"Y:"+y);
}
public static void main(String args[])
{
    new MyMouseMotion();
}
}