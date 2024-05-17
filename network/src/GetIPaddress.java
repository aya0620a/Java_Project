import java.net.*;

public class GetIPaddress {
	public static void main(String args[]) {
		try {
			InetAddress ipaddress = InetAddress
					.getByName("www.kwansei.ac.jp");
			System.out.println(ipaddress.getHostAddress());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
