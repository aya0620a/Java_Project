import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleServer {

	public static void main(String[] args) {
		final int port_number = 2525;

		ServerSocket readsocket = null;
		Socket socket = null;
		InputStream instr = null;
		byte[] buff = new byte[1024];
		boolean cont = true;

		try {
			readsocket = new ServerSocket(port_number);
			socket = readsocket.accept();
			instr = socket.getInputStream();
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}

		while (cont) {
			try {
				int n = instr.read(buff);
				System.out.write(buff, 0, n);
			} catch (Exception e) {
				cont = false;
			}
		}

		try {
			instr.close();
			socket.close();
			readsocket.close();
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}