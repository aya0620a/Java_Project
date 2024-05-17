
public class PlayerAnimation extends MyFrame2 {

	    public void run() {
	    

	        int x = 100;  // 自動車の中心 x 座標
	        int y = 200;  // 自動車の中心 y 座標

	        int cw = 32;  // 自動車の幅
	        int ch = 24;  // 自動車の高さ

	        Car player = new Car(x, y, cw, ch, 0, 0); // 止まった自動車の作成
           
	       
		    
			
	       
	        
	        addKeyListener(player);

	        while(true) {
	            clear();
	         
	            player.draw(this);
	            player.move();
	            sleep(0.1);
	    		
	        }
	    }

	    public static void main(String[] args) {
	        new PlayerAnimation();
	    }
}
