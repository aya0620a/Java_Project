import java.util.Calendar;

public class Cal extends MyFrame2 {
	public void run() {
		drawString("August, 2003", 40, 60, 16);

		int x = 60;
		int y = 100;
		int d = 30;

		Calendar cl = Calendar.getInstance();
		cl.set(2003,7, 1);
		int totalDays = cl.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDayOfWeekIndex = cl.get(Calendar.DAY_OF_WEEK) - 1; 

		int currentDayOfWeekIndex = firstDayOfWeekIndex;
		int weekIndex = 0;

		System.out.println(firstDayOfWeekIndex);

		for(int i = 1; i < totalDays + 1; i++) {
			if (currentDayOfWeekIndex > 6) {
				currentDayOfWeekIndex = 0;
				weekIndex += 1;
			}

			int X = x + d * currentDayOfWeekIndex;
			int Y = y + d * weekIndex;

			if(i%7==2) {
				setColor(0,0,255);
			}
			else if(i%7==3) {
				setColor(255,0,0);
			}
			else {
				setColor(0,0,0);
			}

			if (i == 27) {
				setColor(128, 20, 200);
			}

			drawString(Integer.toString(i), X, Y, 15);

			currentDayOfWeekIndex += 1;
		}
	}

	public static void main(String[] args) {
		MyFrame2 frame = new Cal();
	}
}

