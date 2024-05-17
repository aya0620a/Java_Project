
	import java.util.Vector;

	public class DisplayCarObject extends MyFrame2{
		public void run() {
			setSize(600,500);
			int n=37022431%5;
			Vector<Car> cars0=new Vector<Car>();
			Vector<Car> cars1=new Vector<Car>();
			Car car0=new Car(50+10*n,350+10*n,32,24,n+5,-n-5);
			Car car1=new Car(450-10*n,250-10*n,32,24,-n-5,n+5);
			for (int i=0 ; i<150 ; i++) {
				clear();
				drawLine(300,0,300,500);
				
				for(int nc0=0; nc0<cars0.size(); nc0++) {
					cars0.get(nc0).draw(this);
					cars0.get(nc0).move();
					if(cars0.get(nc0).x>=300) {
						cars0.get(nc0).stop();}
				}
						if(i%7==0) {
							int v0 = (int)(Math.random()*10);
							cars0.add(new Car(50+10*n,350+10*n,32,24,n+5,-v0));
						
						
						}
						
				
				for(int nc1=0; nc1<cars1.size(); nc1++) {
					cars1.get(nc1).draw(this);
					cars1.get(nc1).move();
					if(cars1.get(nc1).x<=300) {
						cars1.get(nc1).stop();}
				}
						if(i%7==0) {
							int v1=(int)(Math.random()*10);
							cars1.add(new Car(450-10*n,250-10*n,32,24,-n-5,v1));
						
						}
			sleep(0.1);	
			}
		}	
		
				//drawLine(300,0,300,500);


			
			//sleep(0.01);}


			
		
		public static void main(String[] args) {
			new DisplayCarObject();
		}
}
