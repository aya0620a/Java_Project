import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Car extends Vehicle implements KeyListener{
    public Car(int x, int y, int w,int h,int vx, int vy) {
	super(x, y,  w, h, vx, vy);
	// TODO 自動生成されたコンストラクター・スタブ

}
    public void circle(int s, int t) {
    	
    }

	public void draw(MyFrame2 frame) {
		
	
        
        frame.fillRect(x-w/4, y-h/2, w/2, h/3);
        frame.fillRect(x-w/2, y-h/6, w, h/3);
        frame.fillOval(x-(3*w)/8, y+h/6, h/3, h/3);
        frame.fillOval(x+w/8, y+h/6, h/3, h/3);
    	
        
        
	
        
	
		
        
       
    }
	
	public void crash(MyFrame2 frame) {
		if((x-s)*(x-s)+(y-t)+(y-t)<=40) {
			frame.setColor(128,0,0);
			s = (int)(Math.random()*280+50);
			t = (int)(Math.random()*280+50);
			frame.fillOval(s,t,20,20);
		}
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
   
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("キーが押されました");
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
		
		
		
		
		
		// TODO 自動生成されたメソッド・スタブ
		
	}

	
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		vx=0;
		vy=0;
		
	}

  
}
