import java.io.DataInputStream;
import java.net.URL;

public class HttpClient2 {
	public static void main(String args[]) {
		try {
			int num;
			byte buff[] = new byte[1024];
			URL u = new URL(
					"http://cs.kwansei.ac.jp/~kitamura/tmp/test.html");
			        //"https://ist.ksc.kwansei.ac.jp/~kitamura/tmp/test.html");
			DataInputStream di = new DataInputStream(u.openStream());
			while ((num = di.read(buff)) != -1) {
				System.out.write(buff, 0, num);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
