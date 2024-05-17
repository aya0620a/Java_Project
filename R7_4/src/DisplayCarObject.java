
public class DisplayCarObject extends MyFrame2{
		 public void run() {
		  int n=37022431%5;
		  setSize(600,500);
		  Car car0=new Car(50+10*n,350+10*n,32,24,n+5,-n-5);
		  Car car1=new Car(450-10*n,250-10*n,32,24,-n-5,n+5);
		  for (int i=0 ; i<100 ; i++) {
		   clear();
		   drawLine(300,0,300,500);
		   car0.draw(this);
		   car1.draw(this);
		   car0.move();
		   car1.move();
		   car0.isMoving();
		   car1.isMoving();
		   if(car0.x>=300) {
		    car0.stop();}
		   if(car1.x<=300) {
		    car1.stop();
		   }
		   
		   sleep(0.01);
		  }
		  }
		  
		 
		 public static void main(String[] args) {
		  new DisplayCarObject();
		 }
}
