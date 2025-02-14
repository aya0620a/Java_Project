
public class Circle {
	int cx;   // 円の中心 x 座標
    int cy;   // 円の中心 y 座標
    int r;   // 円の半径
    int c;   // 円の色

    /** コンストラクタ */
    public Circle(int cx, int cy, int r, int c) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
        this.c = c;
    }

    /** 中心座標 (cx, cy) および半径 r の円を描画(色を整数 c = 0, 1, 2で指定)  */
    public void fillCircleWithCC(MyFrame2 frame) {
    	if (c==0) {
            frame.setColor(255,0,0);
            frame.fillOval(cx-r,cy-r,2*r,2*r);
        }else if (c==1)    {
            frame.setColor(0,255,0);
            frame.fillOval(cx-r,cy-r,2*r,2*r);
        } else {
            frame.setColor(0,0,255);
            frame.fillOval(cx-r,cy-r,2*r,2*r);
        }
    
        // TODO: (その1) R6_3 で作成した fillCircleWithCC メソッドをベースに円の描画を行う


    }

    /** main メソッド(Circle メソッドのテストコード)*/
    public static void main(String[] args) {

        MyFrame2 f = new MyFrame2();

        Circle[] cs = new Circle[3];
        for(int i = 0; i < cs.length; i++) {
            int cx = 100*(i+1);
            int cy = 100*(i+1);
            int r =  10*(i+2);
            int c = i;
            cs[i] = new Circle(cx, cy, r, c);
            cs[i].fillCircleWithCC(f);
            f.setColor(0, 0, 0);
            f.drawLine(cx, 0, cx, 400);
            f.drawLine(0, cy, 400, cy);
        }
    }
}
