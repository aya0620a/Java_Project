
public class Magic extends MyFrame2{
	public void run() {
		int A=3,B=7,C=0,D=2;
		int a=2,b=4,c=3,d=1;
		int x=120;
		while(x<=350) {
			fillRect(x,40,4,320);
			fillRect(40,x,320,4);
			x+=80;
		}
		
		drawString(""+(A+a),50,100,50);
		drawString(""+(B+b),130,100,50);
		drawString(""+(C+c),210,100,50);
		drawString(""+(D+d),290,100,50);
		
		drawString(""+(C+d),50,190,50);
		drawString(""+(D+c),130,190,50);
		drawString(""+(A+b),210,190,50);
		drawString(""+(B+a),290,190,50);
		
		drawString(""+(D+b),55,270,50);
		drawString(""+(C+a),130,270,50);
		drawString(""+(B+d),210,270,50);
		drawString(""+(A+c),290,270,50);
		
		drawString(""+(B+c),55,340,50);
		drawString(""+(A+d),130,340,50);
		drawString(""+(D+a),210,340,50);
		drawString(""+(C+b),290,340,50);
		
	}

	public static void main(String[] args) {
		new Magic();
	}
}
