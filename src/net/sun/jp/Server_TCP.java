package net.sun.jp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.bind.DatatypeConverter;

public class Server_TCP {
	private static int server_port;

	public Server_TCP(int local_port) {
		// TODO Auto-generated constructor stub
		server_port = local_port;
		
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	
	public void setClientAccept() throws IOException {
		
		System.out.println("[server] 受信待機");
		ServerSocket listen = new ServerSocket(server_port);
		Socket server = listen.accept();

		InetAddress inetAddress = server.getInetAddress();
		System.out
				.println("接続されるClientのIPアドレス:" + inetAddress.getHostAddress());

		DataInputStream in = new DataInputStream(server.getInputStream());
		System.out.println("受信開始");
		byte[] buf = new byte[4];
		in.readFully(buf);

		System.out.println("[server]受信データ:"
				+ DatatypeConverter.printHexBinary(buf));
		System.out.println("受信完了");

		// byte[] sendData = {0x11,0x21,0x31,0x41};
		// System.out.println("送信開始");
		// BufferedOutputStream out = new
		// BufferedOutputStream(server.getOutputStream());
		// out.write(sendData, 0, sendData.length);
		// out.flush();
		// System.out.println("送信完了");

		server.close();
		listen.close();
	}

}
