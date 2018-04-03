import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;

public class mouseMotionInput
extends Applet
implements MouseMotionListener, MouseListener{
	
	private Graphics globalGraphics;
	
	private int mouseButton;
	
	public void init(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public void paint(Graphics g){
		
		this.setSize(new Dimension(800, 600));
		
		globalGraphics = g.create();
		
	}
	
	public void drawCircle(int x, int y, int width, int height){
		
		globalGraphics.setColor(getRandomColor());
		Ellipse2D circle = new Ellipse2D.Double((double)x, (double)y, (double)width, (double)height);
		Graphics2D g2 = (Graphics2D) globalGraphics;
		g2.fill(circle);
	}
	
	public void drawSquare(int x, int y, int width, int height){
		
		globalGraphics.setColor(getRandomColor());
		globalGraphics.fillRect(x, y, width, height);
	}
	
	public Color getRandomColor() {

		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		
		return new Color(r, g, b);
	}
	
	public void mouseAction(MouseEvent e){
		int mouseX = e.getX();
		int mouseY = e.getY();
		
		if(mouseButton == MouseEvent.BUTTON3 || mouseButton == MouseEvent.BUTTON3_MASK){
			drawCircle(mouseX - 20, mouseY - 20, 40, 40);
		}else{
			drawSquare(mouseX - 20, mouseY - 20, 40, 40);
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		mouseButton = e.getModifiers();
		mouseAction(e);		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mouseButton = e.getButton();
		mouseAction(e);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
