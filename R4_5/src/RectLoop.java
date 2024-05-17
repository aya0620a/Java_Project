public class RectLoop extends MyFrame2{
	
	public void run () {
		int c=190;
		int d=10;
		int k=37022431%4;
		for(int i=0;i<10;i++) {
		  for(int j=0;j<i;j++) {
			int x=c-d*i; 
			int y=50+d*2*i;
				
			x+=d*j*2;
			
			
		     if((i+j)%6==0) {
				  setColor(255-j*20,255-j*20,0);
				  fillRect(x,y,10,10);
			  }
			  else if((i+j)%3==0) {
				  setColor(255-j*20,255-j*20,0);
				  fillRect(x,y,10,10);
			  }
			  else if((i+j)%2==0) {
				  setColor(255-j*20,255-j*20,0);
				  fillRect(x,y,10,10);
			  }
			  else {
				  setColor(255-j*20,255-j*20,0);
				  fillRect(x,y,10,10);
			  }
			  
			  	  
		  }
		 
		}
}
			
		
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
	
	}
}
