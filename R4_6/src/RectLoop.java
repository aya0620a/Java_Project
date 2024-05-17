import java.util.Calendar;

public class RectLoop extends MyFrame2 {
    public void run() {
        drawString("June, 2003", 40, 60, 16);

        int topX = 60;
        int topY = 100;
        int d = 30;

        Calendar cl = Calendar.getInstance();
        cl.set(2003,5, 1);
        int totalDays = cl.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfWeekIndex = cl.get(Calendar.DAY_OF_WEEK) - 1; // 0 is Sunday

        int currentDayOfWeekIndex = firstDayOfWeekIndex;
        int weekIndex = 0;

        System.out.println(firstDayOfWeekIndex);

        for(int i = 1; i < totalDays + 1; i++) {
            if (currentDayOfWeekIndex > 6) {
                currentDayOfWeekIndex = 0;
                weekIndex += 1;
            }

            int x = topX + d * currentDayOfWeekIndex;
            int y = topY + d * weekIndex;

            switch (currentDayOfWeekIndex) {
                // Saturday
                case 6: 
                    setColor(0, 0, 255);
                    break;
                //Sunday
                case 0: 
                    setColor(255, 0, 0);
                    break;
                //Weekday
                default: 
                    setColor(0, 0, 0);
                    break;
            }

            if (i == 5) {
                setColor(255, 165, 0);
            }

            drawString(Integer.toString(i), x, y, 15);

            currentDayOfWeekIndex += 1;
        }
    }

	public static void main(String[] args) {
		MyFrame2 frame = new RectLoop();
	}
}
