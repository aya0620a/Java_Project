

	public class r3_07 extends MyFrame2 {

	    public void run() {
	        int r1 = 80;
	        int r2 = 20;
	        int studentNumber = 37022465;
	        int n = (studentNumber % 5) + 6;

	        int x = 100;
	        int y = 100;

	        setColor(0, 129, 0);

	        // LARGE
	        fillOval(x, y, r1 * 2, r1 * 2); // Center(x + r1, y + r1)r

	        // SMALL
	        for (int i = 0; i < n; i++) {
	            double radian = Math.toRadians(360 * i / n);
	            fillOval(x + r1 - r2 - Math.cos(radian) * (r1 + r2), y + r1 - r2 + Math.sin(radian) * (r1 + r2), r2 * 2, r2* 2);
	        }
	    }

		public static void main(String[] args) {
			MyFrame2 frame = new r3_07();
			frame.setLocation(500, 500);
		}
	}


