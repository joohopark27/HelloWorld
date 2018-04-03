import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseInput 
extends Applet 
implements MouseListener{
	
	private Graphics globalGraphics = null;
	
	public void init(){
		
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g){
		
		this.setSize(new Dimension(800, 600));
		
			globalGraphics = g.create();
		
	}
	
	public void drawDot(int x, int y, int width, int height){
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		
		Color randomColor = new Color(r, g , b);
		globalGraphics.setColor(randomColor);
		globalGraphics.fillRect(x, y, width, height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("mouse entered");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("mouse exited");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getButton());
		
		boolean isCtrl = e.isControlDown();
		int mouseX = e.getX();
		int mouseY = e.getY();
		if(isCtrl){
			drawDot(mouseX - 25, mouseY - 25, 50, 50);
		}else if (e.getButton() == MouseEvent.BUTTON3){
			drawDot(mouseX - 10, mouseY - 10, 20, 20);
		}else{
			drawDot(mouseX - 5, mouseY - 5, 10, 10);
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("mouse released");
	}
	
	
	
}
