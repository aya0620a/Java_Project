
public class PlayerAnimation extends MyFrame2 {

	Car fillCircleWithCC;

	public void fillCircleWithCC(int cx, int cy, int r, int c) {

		if (c%3==0) {
			setColor(255,0,0);
		}else if (c%3==1)    {
			setColor(0,255,0);
		} else {
			setColor(0,0,255);
		}
		fillOval(cx-r,cy-r,2*r,2*r);
		// TODO
	}


	public void run() {

		fillCircleWithCC = new Car(200, 200, 10, 0, 10, 10); 

		int x = 50;  // 自動車の中心 x 座標
		int y = 50;  // 自動車の中心 y 座標
		int r = 10;
		int cw = 32;  // 自動車の幅
		int ch = 24;  // 自動車の高さ
		int c=0;
		int cx = (int) (Math.random()*290)+60;
		int cy = (int) (Math.random()*290)+60;
		int d = 0;



		Car player = new Car(x, y, cw, ch, 0, 0); // 止まった自動車の作成
		addKeyListener(player);


		while(true) {
			clear();
			setColor(200,200,200);
			fillRect(50,50,300,300);
			setColor(255,0,0);
			fillCircleWithCC(cx,cy,r,c);
			setColor(0,0,0);
			player.draw(this);
			player.move();


			drawString("nc="+ d, 50,370,25);

			if(((cx-player.x)*(cx-player.x))+((cy-player.y)*(cy-player.y))<=(r*r)) {

				cx = (int) (Math.random()*280)+60;
				cy = (int) (Math.random()*280)+60;
				setColor(255,0,0);
				fillCircleWithCC(cx,cy,r,c);

				d++;
			}



			sleep(0.1);



		}

	}

	public static void main(String[] args) {
		new PlayerAnimation();
	}
}
