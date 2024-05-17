
public class MyNumberPlusMinus extends MyFrame2{
	public void run() {
    	int[][] a = {{3, 7, 0}, {2, 2, 4}, {3, 1, 0}};
    	int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    	
    	int[][] c = new int[3][3];
    	int[][] d = new int[3][3];
    	
    	int y=100;
    	for(int i = 0; i<a.length; i++) {
    		int x=80;
            for(int j=0; j< a[i].length; j++) {
            	
            	if(0<=j&&j<=3) {
            		
            	c[i][j] += a[i][j] + b[i][j];
            	d[i][j] += a[i][j] - b[i][j];
            		
            	
            drawString(c[i][j]+"",x,y,25);
            drawString(d[i][j]+"",x,y+160,25);
    		x+=40;
            	}
    		System.out.print(a[i][j] + " ");
    		
    		
    		
    		
    	}
    		System.out.println();
    		y+=40;
    }
}
    public static void main(String[] args) {
        new MyNumberPlusMinus();
    }
}
