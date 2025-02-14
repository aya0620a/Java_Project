
public class Circle extends MyFrame2 {

    public void drawSpiral(int cx, int cy, int r, int num, int d) {
        for (int i = d; i < 360 * num; i++) {
            double deg = Math.toRadians(i);
            Double X = deg * (r / num/ 2) * Math.cos(deg) + cx;
            Double Y = deg * (r / num/ 2) * Math.sin(deg) + cy;
            Double dist = Math.sqrt(Math.pow(cx, 2) + Math.pow(cy, 2));

            if (dist == r && ((i - d) & 360) == num) {
                return;
            }

            fillRect(X, Y, 1, 1);
        }
    }

    public void run() {
        drawSpiral(60, 100, 20, 1, 0);
        drawSpiral(180, 100, 20, 2, 0);
        drawSpiral(300, 100, 20, 3, 0);
        drawSpiral(60, 240, 20, 4, 90);
        drawSpiral(180, 240, 20, 4, 180);
        drawSpiral(300, 240, 20, 4, 270);
    }

    public static void main(String[] args) {
        new Circle();
    }

}



