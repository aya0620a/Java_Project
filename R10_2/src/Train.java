
public class Train extends Vehicle {
	    //int x, y, vx, vy;  //ここにあった宣言を解除
//	    public Train (int x, int y,  int vx, int vy) {
//	        this.x = x;
//	        this.y = y;
//	        this.vx = vx;
//	        this.vy = vy;
//	    }

	    public Train(int x, int y, int w, int h, int vx, int vy) {
		super(x, y, w, h, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

		public void draw(MyFrame2 frame) {
	        frame.fillRect(x-w/2, y-h/2, w, (5*h)/6);
	        frame.fillOval(x-w/2, y+h/3, h/6, h/6);
	        frame.fillOval(x-(w*3)/8, y+h/3, h/6, h/6);
	        frame.fillOval(x+w/4, y+h/3, h/6, h/6);
	        frame.fillOval(x+(3*w)/8, y+h/3, h/6, h/6);
	    }


}
