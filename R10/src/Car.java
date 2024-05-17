
public class Car extends Vehicle {
	    //int x, y, vx, vy;　　//ここにあった宣言を解除
//	    public Car (int x, int y,  int vx, int vy) {
//	        this.x = x;
//	        this.y = y;
//	        this.vx = vx;
//	        this.vy = vy;
//	    }

	    public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

		public void draw(MyFrame2 frame) {

	        frame.fillRect(x+20, y, 40, 20);
	        frame.fillRect(x, y+20, 80, 20);
	        frame.fillOval(x+10, y+40, 20, 20);
	        frame.fillOval(x+50, y+40, 20, 20);
	    }

	  
}
//    public void move() {
//	        x += vx;
//	        y += vy;
//	    }