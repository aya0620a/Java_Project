import java.util.Vector;

public class DisplayCarTrain extends MyFrame2{

	public void run() {
		setSize(600,500);

		Vector<Vehicle> vehicles=new Vector<Vehicle>();



		for(int i=0;i<200;i++) {
			clear();
			drawLine(550,0,550,500);

			for (int j=0;j<vehicles.size();j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			if(vehicles.get(j).x>=550) {
				vehicles.get(j).changeMove();
			}
			}
			
			
			if(i%7==0) {
				int nc= vehicles.size();
				int v=nc%7;
				if(nc%2==0) {
					vehicles.add(new Car(50,350,32,24,10,-v));
				}
				else {
					vehicles.add(new Train(50,350,32,24,10,-v));
				}
			}
				
				
				
		
			sleep(0.1);
		}
		}


	

	    
	  
	    

	    public static void main(String[] args) {
	        new DisplayCarTrain();
	    }
}
