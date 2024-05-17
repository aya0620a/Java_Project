
public class OvalLoop extends MyFrame2{
	public void run() {
		int r1=80,r2=30;
		int n=37022431%5+6;
		int x = 120;
		int y = 120;
		setColor(0,255,128);
		fillOval(x,y,r1*2,r1*2);

		for(int i=0 ; i<n ; i++) {

			double radian = Math.toRadians(360 * i / n);
			
			for(int j = 0; j<n; j++) {
			 
			 double x2 = Math.cos(radian);
			 double y2 = Math.sin(radian);

			fillOval(x+r1-r2-x2*(r1+r2),y+r1-r2-y2*(r1+r2),r2*2,r2*2);
			}
		}
	}

	public static void main(String[] args) {
		new OvalLoop();
	}
}
