
public class Face  {
	int x,y,w,h,vx;
	int n=37022431%5;
	public Face(int x, int y, int vx, int w, int h) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.w=w;
		this.h=h;
	}
	public void draw(MyFrame2 frame) {
		frame.fillOval(x, y, w*2/5, h*2/3);
		frame.fillOval(x+w*3/5, y, w*2/5, h*2/3);
		frame.fillRect(x,y+h*5/6,w,h*1/6);
	}

	public void move() {
		x+=vx;

	}

	public void moveOrigin() {
			x=0;
		}
	}
