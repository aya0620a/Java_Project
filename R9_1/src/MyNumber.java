
public class MyNumber extends MyFrame2{
	
	
    public void run() {
    	int[][] a = {{3, 7, 0}, {2, 2, 4}, {3, 1, 0}};
    	
    	int y=100;
    	for(int i = 0; i<a.length; i++) {
    		int x=100;
            for(int j=0; j< a[i].length; j++) {
            	
            	if(0<=j&&j<=3) {
            		
            
            
    		drawString(a[i][j]+"",x,y,50);
    		x+=50;
            	}
    		System.out.print(a[i][j] + " ");
    		
    		
    		
    		
    	}
    		System.out.println();
    		y+=50;
    }
}
    public static void main(String[] args) {
        new MyNumber();
    }
}
