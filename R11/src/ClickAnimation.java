
	import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

	public class ClickAnimation extends MyFrame2 implements MouseListener {

	    public static void main(String[] args) {
	        new ClickAnimation();
	    }

	    Circle circle; // 円(Circle クラスのオブジェクト)


	    public void run() {

	        circle = new Circle(200, 200, 10, 0); // 中心座標(200, 200) および半径 10 の円(赤)を作成

	        addMouseListener(this); // 自身を MouseListener に登録

	        while(true) {
	            clear();

	            // TODO: (その 2) 円(Circle クラスのオブジェクト circle)を描画
                circle.draw(this);
	            sleep(0.1);
	        }

	    }

	    /** マウスがクリックされた時に実行されるメソッド */
	    @Override
	    public void mouseClicked(MouseEvent e) {
	        // TODO 自動生成されたメソッド・スタブ
	        int cx = e.getX();   // クリックされたウィンドウの x 座標を取得
	        int cy = e.getY();   // クリックされたウィンドウの y 座標を取得

	        int r = 10;  // 描画する円の半径

	        // TODO: (その 3) 円(Circle クラスのオブジェクト circle)の中心座標をクリックされた座標に変更
	        circle = new Circle(cx, cy,10,0);
	    }
	    @Override
	    public void mousePressed(MouseEvent e) {
	        // TODO 自動生成されたメソッド・スタブ

	    }
	    @Override
	    public void mouseReleased(MouseEvent e) {
	        // TODO 自動生成されたメソッド・スタブ

	    }
	    @Override
	    public void mouseEntered(MouseEvent e) {
	        // TODO 自動生成されたメソッド・スタブ

	    }
	    @Override
	    public void mouseExited(MouseEvent e) {
	        // TODO 自動生成されたメソッド・スタブ

	    }
}
