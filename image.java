import java.awt.Graphics;
import java.applet.Applet;
public class image extends Applet
{
public void paint(Graphics g) 
{
Image img1= Toolkit.getDefaultToolkit().getImage("zoro.jpg");
g.drawImage(img1,10,10,this);
}
}