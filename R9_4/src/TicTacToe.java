
public class TicTacToe extends MyFrame2{
	public void run() {
		int x=100,y=100,w=50,h=50;
		int moves [][]=  { { 0, 0 }, { 2, 1 }, { 2, 2 } };
		
		setColor(160,160,160);
		fillRect(x,y,w,h);
		fillRect(x+100,y,w,h);
		fillRect(x+50,y+50,w,h);
		fillRect(x,y+100,w,h);
		fillRect(x+100,y+100,w,h);
		
		setColor(100,200,0);
		fillRect(x+50,y,w,h);
		fillRect(x,y+50,w,h);
		fillRect(x+100,y+50,w,h);
		fillRect(x+50,y+100,w,h);

		for(int i = 0; i<moves.length; i++) {
			for(int j = 0;j<moves.length;j++) {
				if((i+j)%2==0) {
					setColor(0,0,0);
					fillOval(100+50*moves[i][0],100+50*moves[i][1],50,50);
				}
				else {
					setColor(255,255,255);
					fillOval(100+50*moves[i][0],100+50*moves[i][1],50,50);
				}
			}
			sleep(1);

		}
	}

	
public static void main(String [] args) {
	new TicTacToe();
}
}
