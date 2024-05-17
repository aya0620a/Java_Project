import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HttpClient {

	public static void main(String[] args) {
		String hostname = "cs.kwansei.ac.jp";
		int port_number = 80;
		Socket socket = null;
		OutputStream outstr = null; 
		InputStream instr = null;
		byte[] buffOut = new byte[1024];
		byte[] buffIn = new byte[1024];
		int num = 0;

		try {
			socket = new Socket(hostname, port_number);
			outstr = socket.getOutputStream();
			instr = socket.getInputStream();
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}

		String str = "GET /~kitamura/tmp/test.html HTTP/1.1\r\nHost: ist.ksc.kwansei.ac.jp\r\n\r\n";
		buffOut = str.getBytes();
		int n = buffOut.length;
		System.out.write(buffOut, 0, n);
		System.out.println();
		try {
			outstr.write(buffOut, 0, n);

			while ((num = instr.read(buffIn)) != -1) {
				System.out.write(buffIn, 0, num);
			}
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}

		try {
			outstr.close();
			instr.close();
			socket.close();
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
