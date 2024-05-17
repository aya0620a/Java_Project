
public class DisplayCarTrain extends MyFrame2{

	    public void run() {

	        Car car1 = new Car(100, 100, 100,60, 0, 0);
	        car1.draw(this);

	        Train train1 = new Train(200, 200, 80,60, 0, 0);
	        train1.draw(this);
	    }

	    public static void main(String[] args) {
	        new DisplayCarTrain();
	    }
}
