package ipaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
	public static void main(String[] args) throws UnknownHostException
	{
	InetAddress ip = InetAddress.getLocalHost();
	System.out.println("My IP Address : "+ip.getHostAddress());
	}
}
