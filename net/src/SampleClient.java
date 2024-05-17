import java.io.OutputStream;
import java.net.Socket;

public class SampleClient {

	public static void main(String[] args) {
		final String hostname = "127.0.0.1";
		final int port_number = 2525;

		Socket socket = null;
		OutputStream outstr = null;
		byte[] buff = new byte[1024];

		try {
			socket = new Socket(hostname, port_number);
			outstr = socket.getOutputStream();
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}

		String str = "abc";
		buff = str.getBytes();
		int n = buff.length;
		System.out.write(buff, 0, n);
		try {
			outstr.write(buff, 0, n);
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}

		try {
			outstr.close();
			socket.close();
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
