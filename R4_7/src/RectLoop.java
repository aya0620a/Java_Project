
public class RectLoop extends MyFrame2 {

	    boolean isPrime(int num) {
	        if (num < 2) {
	            return false;
	        } else { 
	            for (int i = 2; i < num; i++) {
	                if (num % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        }
	    }

	    public void run() {
	        int n = 65 + 50;

	        int x = 50;
	        int y = 50;
	        int d = 20;

	        for (int i = 0; i < n; i ++) {
	            if (isPrime(i)) {
	                setColor(0, 0, 0);
	            } else {
	                setColor(0, 128, 0);
	            }
	            fillRect(x + d * (i % 10), y + d * (int)(i / 10), 10, 10);
	        }
	    }

		public static void main(String[] args) {
			MyFrame2 frame = new RectLoop();
			frame.setLocation(500, 500);
		}
	}



