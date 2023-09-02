import java.applet.Applet;
import java.awt.applet;
class Window
{
public void example()
{
Frame f=new Frame("First");
f.setSize(400,600);
f.setVisible(true);
Panel p=new Panel();
Button b1=new Button("yes");
Button b2=new Button("no");
Label l=new Label("are you the human");
p.add(b1);
p.add(b2);
p.add(l);
f.add(p);
f.dispose();
}
}
public class container
{
public static void main(String args[])
{
Window w=new Window();
w.example();
}
}