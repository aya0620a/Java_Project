
public class DisplayCarTrain extends MyFrame2{

	    public void run() {

	        Car car1 = new Car(10, 50, 3, 0);
	        car1.draw(this);

	        Train train1 = new Train(30, 150, 3, 0);
	        train1.draw(this);
	    }

	    public static void main(String[] args) {
	        new DisplayCarTrain();
	    }
}
