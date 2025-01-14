
public class Line extends MyFrame2 {

    public double min(double a, double b) {
        return (a < b) ? a : b;
    }

    public double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // return absolute value
    public double abs(double a) {
        return (a < 0) ? -a : a;
    }

    public void drawLine(double x0, double y0, double x1, double y1) {
        double r = (y0 - y1) / (x0 - x1);
        double d = abs(x1 - x0);
        double xMin = min(x0, x1);
        double yBase = (r > 0) ? min(y0, y1) : max(y0, y1);

        for (int i = 0; i < d; i++) {
            double y = yBase + i * r;
            fillRect(xMin + i, y, 1, 1);
        }
    }
    
    public void drawDiamond(int cx, int cy, int w, int h) {

        
        drawLine(top.getX(), top.getY(), left.getX(), left.getY());
        drawLine(left.getX(), left.getY(), bottom.getX(), bottom.getY());
        drawLine(bottom.getX(), bottom.getY(), right.getX(), right.getY());
        drawLine(right.getX(), right.getY(), top.getX(), top.getY());
    }

    public void run() {
        int last = 1;   // 37022465
        int n = last + 3;

        for (int i = 0; i < n; i++) {
            drawDiamond(200, 200, 20 * i + 50, 10 * i + 100);
        }
    }

    public static void main(String[] args) {
        new Line();
    }

}


