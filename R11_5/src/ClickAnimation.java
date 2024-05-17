import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

public class ClickAnimation extends MyFrame2 implements MouseListener {

	public static void main(String[] args) {
		new ClickAnimation();
	}
	int c=0;
	Vector<Circle> fillCircleWithCC; // 円(Circle クラスのオブジェクト)を管理する Vector オブジェクト(★★)
	

	public void run() {

		fillCircleWithCC = new Vector<Circle>(); // Vector オブジェクトの作成(★★)

		addMouseListener(this); // 自身を MouseListener に登録

		while(true) {
			clear();

			for(int j=0;j<fillCircleWithCC.size();j++) {
				fillCircleWithCC.get(j).fillCircleWithCC(this);
			}
			;// TODO: (その 1) circles に格納された円(Circle クラスのオブジェクト)を全て描画(★★)

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

		fillCircleWithCC .add(new Circle(cx, cy,r,c));
		c++;
		

	}
	// TODO: (その 2) 半径 r および中心座標 (cx, cy) の円(Circle クラスのオブジェクト)を circles に追加(★★)



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