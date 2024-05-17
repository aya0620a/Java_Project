
public class MyVehicle extends Vehicle {
	    //int x, y, vx, vy;　　//ここにあった宣言を解除
//	    public Car (int x, int y,  int vx, int vy) {
//	        this.x = x;
//	        this.y = y;
//	        this.vx = vx;
//	        this.vy = vy;
//	    }

	    public MyVehicle (int x, int y, int w,int h,int vx, int vy) {
		super(x, y,  w, h, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

		public void draw(MyFrame2 frame)  {

			frame.setColor(0,128,120);
			frame.fillRect(x-w/8, y-h/3, (w*2)/3, (h*1)/2);//trackのボディ
			frame.setColor(0, 0, 0);
	        frame.fillRect(x-w/3, y-h/4, w/4, h/2);//トラックの頭
	        frame.fillRect(x-w/4, y, w*2/3, h/4);//トラックの底
	        frame.fillOval(x-w/4, y+h/6, h/3, h/3);//トラックのタイヤ
	        frame.fillOval(x+w/8, y+h/6, h/3, h/3);
	        frame.setColor(0, 0, 0);
	    }

	 
    
    public void changeMove() {
        vx = -3*vx;
        vy = -7*vy;
    }
}
