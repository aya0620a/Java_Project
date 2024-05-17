
public class MatrixTest {
	 public static void main(String[] args) {

	        int[][] a = new int[2][2]; // 2×2の二次元配列の定義(定義の方法1)
	        a[0][0] = 1;
	        a[0][1] = 2;
	        a[1][0] = 3;
	        a[1][1] = 4;

	        int[][] b = { { 1, 2 }, { 3, 4 },{ 5, 6, 7 } }; // 初期値の設定を含めた2×2の二次元配列の定義(定義の方法2)

	        System.out.println("a is");
	        for(int i = 0; i<a.length; i++) {    //iが２まで足していく
	            for(int j=0; j< a[i].length; j++) {  //
	                System.out.print(a[i][j] + " "); // 改行なし
	            }
	            System.out.println(); // 改行だけ行う
	        }

	        System.out.println("b is");
	        for(int i = 0; i<b.length; i++) {
	            for(int j=0; j< b[i].length; j++) {
	                System.out.print(b[i][j] + " "); // 改行なし
	            }
	            System.out.println(); // 改行だけ行う
	        }

	        /* 
	           a is
	           1 2 
	           3 4 
	           b is
	           1 2 
	           3 4
	        */
	    }
}
