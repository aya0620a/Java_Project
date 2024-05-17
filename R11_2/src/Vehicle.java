
public class Vehicle {
	int x, y, w, h, vx, vy, s, t;
	
    public Vehicle (int x, int y, int w, int h, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.vx = vx;
        this.vy = vy;
    }
	 public void move() {
	        x += vx;
	        y += vy;
	    }
	 
	public void draw(MyFrame2 f) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public void drawingcircle(MyFrame2 f) {
	
		
	}

}
