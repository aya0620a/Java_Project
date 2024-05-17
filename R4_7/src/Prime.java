
public class Prime extends MyFrame2 {

	    boolean isPrime(int n) {
	        if (n < 2) {
	            return false;
	        } else { 
	            for (int i = 2; i < n; i++) {
	                if (n % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        }
	    }

	    public void run() {
	        int n = 31 + 50;

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
		}

}
