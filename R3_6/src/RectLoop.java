
public class RectLoop extends MyFrame2{
	public void run() {
		int n=3+3,m=1+3;
		int y=50;
		for(int i=0 ; i<n*m ; i++) {

			int a=i%n;
			int b=i/n;

			int x=50; 
			for(int j=0;j<m;j++) {
				setColor(128,0,128);
				fillRect(x+(a*20),y+(b*20),10,10);

			}

		}
	}
	public static void main(String[] args) {
		new RectLoop();
	}
}
