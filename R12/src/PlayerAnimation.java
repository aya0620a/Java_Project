
public class PlayerAnimation extends MyFrame2 {

	Cart fillCircleWithCC;

	public void fillCircleWithCC(int cx, int cy, int r, int c) {
		if (c==0) {
			setColor(255,0,0);
		}else if (c==1)    {
			setColor(0,255,0);
		} else if(c==2  ){
			setColor(0,0,255);
		}else {
			setColor(128,128,128);
		}
		fillOval(cx-r,cy-r,2*r,2*r);

	}
	public void run() {

		fillCircleWithCC = new Cart(200, 200, 10, 0, 10, 10); 

		int x = 50;  // カートの中心 x 座標
		int y = 50;  // カートの中心 y 座標
		int cw = 38;  // カートの幅
		int ch = 30;  // カートの高さ

		int r = 20; //円の半径
		int c=0; //初期の色
		int cx = 200; //円の中心のx座標
		int cy = 250; //円の中心のy座標
		int d = 0;	//拾ったカウント数の初期値
		int dx = 5;    // 単位時間あたりの x 座標の変化量
		int dy = 5;    // 単位時間あたりの y 座標の変化量


		Cart player = new Cart(x, y, cw, ch, 0, 0); // 止まったかご
		addKeyListener(player);


		for(int m=0;m<500;m++){

			clear();

			setColor(200,200,200);
			fillRect(50,50,300,300);  //300×300の背景

			cx += dx;  // x 座標の変化
			cy += dy;  // y 座標の変化


			fillCircleWithCC(cx,cy,r,c);	
			setColor(0,0,0);
			player.draw(this);
			player.move();


			if (cx <= 50+r) {    //左端に到達
				dx=(int) (Math.random()*15)+5;	      //速度をランダムに変化させる
			}  if (cx >= 350-r){       //右端に到達
				dx=-(int) (Math.random()*15)+5;
			}  if (cy <= 50+r) {      //上端に到達
				dy=(int) (Math.random()*15)+5;
			}  if (cy >= 350-r) {        //下端に到達
				dy=-(int) (Math.random()*15)+5;
			}


			drawString("nc="+ d, 50,370,25);	//拾ったカウント数の表示
			drawString("score"+(500-m),180,370,25);	//500から時間を引いたスコアの表示


			if(((cx-player.x)*(cx-player.x))+((cy-player.y)*(cy-player.y))<=(r*r)) {

				cx = (int) (Math.random()*280)+60;	 //cxの値をランダムにする
				cy = (int) (Math.random()*280)+60;  //cxの値をランダムにする


				dx = 5;    // 単位時間あたりの x 座標の変化量
				dy = 5;	   // 単位時間あたりの y 座標の変化量
				cx += dx;   // x 座標の変化
				cy += dy;	// y 座標の変化
				d++;
				c++;
				r-=4;	//半径を4ずつ減らしていく
			}
			sleep(0.1);
			if(d==4) {		//カウント数が4になったとき
				clear();
				setColor(200,200,200);
				fillRect(50,50,300,300);
				setColor(0,0,0);
				drawString("お疲れ様",150,150,20);
				drawString("your score → "+(500-m),100,200,20);
				break;
			}
			if(m==499) {	//時間が500を超えたとき
				clear();
				setColor(200,200,200);
				fillRect(50,50,300,300);
				setColor(0,0,0);
				drawString("game over",100,150,40);
				drawString("Try again!",100,250,30);
				break;
			}
		}		
	}
	public static void main(String[] args) {
		new PlayerAnimation();
	}
}
