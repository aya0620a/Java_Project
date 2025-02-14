
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Cart extends Vehicle implements KeyListener{
    public Cart(int x, int y, int w,int h,int vx, int vy) {
	super(x, y,  w, h, vx, vy);
}
	public void draw(MyFrame2 frame) {
		for(int i=0;i<7;i++) {
			for(int k=0;k<5;k++) {
				frame.drawLine(x-(3*w/10), y-(h/4)+((k*h)/8), x+(3*w/10), y-(h/4)+((k*h)/8));
				frame.drawLine(x-(3*w/10)+(i*w)/10,y-(h/4),x-(3*w/10)+(i*w)/10,y+(h/4));
				frame.fillOval(x-(2*w)/8, y+h/6, h/4, h/4);
				frame.fillOval(x+w/8, y+h/6, h/4, h/4);
			}
		}	
	}

	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=5;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		vx=0;
		vy=0;
	}	
}
