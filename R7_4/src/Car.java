
public class Car {

		 int x,y,w,h,vx,vy;
		 public Car(int x, int y,int w, int h, int vx, int vy) {
		 int n=37022431%5;
		 this.x=x;
		 this.y=y;
		 this.w=w;
		 this.h=h;
		 this.vx=vx;
		 this.vy=vy;
		 }
		 
		 




		 public void draw(MyFrame2 frame) {
		  frame.fillRect(x-w*1/4, y-h*1/2, w*1/2, h*1/3);
		  frame.fillRect(x-w*1/2, y-h*1/6, w, h*1/3);
		  frame.fillOval(x-w*3/8, y+h*1/6, h*2/6, h*2/6);
		  frame.fillOval(x+w*1/8, y+h*1/6, h*2/6, h*2/6);
		 }
		 
		 //private void fillRect(int i, int h2, int j, int k) {
		  // TODO 自動生成されたメソッド・スタブ
		  
		 

		 public void move() {
		  x+=vx;
		  y+=vy;
		  
		 }
		 
		 public void stop() {
		  vx=0;
		  vy=0;
		 }
		 
		 public boolean isMoving() {
		  if (vx!=0 || vy!=0) {
		   return true;
		  }
		  else {
		  return false;
		  }
		 }
}
