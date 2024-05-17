
public class MyNumberMultiply extends MyFrame2{
	   public void run() {
	    	int[][] a = {{3, 7, 0}, {2, 2, 4}, {3, 1, 0}};
	    	int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	    	
	    	int[][] c = new int[3][3];
	    	int y=100;
	    	for(int i = 0; i<a.length; i++) {
	    		int x=100;
	            for(int j=0; j< a[i].length; j++) {
	            	for(int k = 0; k<3;k++) {
	            		c[i][j] += a[i][k]*b[k][j];
	            	}
	            
	            	
	            	if(0<=j&&j<=3) {
	            		
	            		
	       
	            
	    		drawString(c[i][j]+"",x,y,25);
	    		x+=50;
	            	}
	    		
	    		
	    		
	    		
	    	}
	    		
	    		y+=50;
	    }
	}
	    public static void main(String[] args) {
	        new MyNumberMultiply();
	    }
	}

