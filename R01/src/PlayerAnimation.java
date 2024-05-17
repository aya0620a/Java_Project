
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

		fillCircleWithCC = new Car(200, 200, 100, 100, 10, 10); 

		int x = 200;  // 自動車の中心 x 座標
		int y = 300;  // 自動車の中心 y 座標
		int r = 10;
		int cw = 32;  // 自動車の幅
		int ch = 24;  // 自動車の高さ
		int c=0;
		int cx = 60;
		int cy = 50;
		int d = 0;
		
		int dy=5;
		



		Car player = new Car(x, y, cw, ch, 0, 0); // 止まった自動車の作成
		addKeyListener(player);


		while(true) {
			clear();
			setColor(200,200,200);
			fillRect(50,50,300,300);
			setColor(0,0,0);
			drawLine(150,50,150,250);
			drawLine(250,50,250,250);
			setColor(255,0,0);
			fillCircleWithCC(cx,cy,r,c);
			setColor(0,0,0);
			player.draw(this);
			player.move();
			
			
			

			
			dy = 5;	   //	
			cy += dy;
			
			if(cy==350) {
				cy=0;
				cx=(int)(Math.random()*80)+60;
				setColor(128,128,128);
				fillCircleWithCC(cx,cy,r,c);
				player.move();
			}
			
			


			drawString("nc="+ d, 50,370,25);

			if(((cx-player.x)*(cx-player.x))+((cy-player.y)*(cy-player.y))<=(r*r)) {
				
				cy=0;

				setColor(255,0,0);
				fillCircleWithCC(cx,cy,r,c);
				
				 int w=(int)(Math.random()*3);
				
				if(w==0) {
					cx=(int)(Math.random()*80)+60;
					setColor(128,128,128);
					fillCircleWithCC(cx,cy,r,c);
					player.move();
				}
				if(w==1) {
					cx=(int)(Math.random()*80)+160;
					setColor(128,128,128);
					fillCircleWithCC(cx,cy,r,c);
					player.move();
				}
				if(w==2) {
					cx=280;
					setColor(128,128,128);
					fillCircleWithCC(cx,cy,r,c);
					player.move();
				}

				d++;
			}



			sleep(0.05);
		}
	
		}



		



	public static void main(String[] args) {
		new PlayerAnimation();
	}
}
