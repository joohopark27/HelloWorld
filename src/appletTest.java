import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class appletTest extends Applet{
	
	public void paint(Graphics g){
		
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double circle = new Ellipse2D.Double(0,0,300,300);
		g2.draw(circle);
		
	}
	
}
