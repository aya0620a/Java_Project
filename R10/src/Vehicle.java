
public class Vehicle {
	int x, y, vx, vy;
	
    public Vehicle (int x, int y,  int vx, int vy) {
        this.x = x;
        this.y = y;
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
}