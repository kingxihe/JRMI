package net.sun.jp;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.xml.bind.DatatypeConverter;

public class Client_TCP {
	private int client_port;

	public Client_TCP(int local_port) {
		// TODO Auto-generated constructor stub
		client_port = local_port;
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */

	public void getServerConnect() throws UnknownHostException, IOException {
		System.out.println("[client]接続開始");
		Socket socket = new Socket("localhost", client_port);

		byte[] sendData = { 0x10, 0x20, 0x30, 0x40 };
		System.out.println("[client]送信開始");

		InetAddress inetAddress = socket.getInetAddress();
		System.out.println("接続先ServerのIPアドレス:" + inetAddress.getHostName()
				+ inetAddress.getHostAddress());

		BufferedOutputStream out = new BufferedOutputStream(
				socket.getOutputStream());
		out.write(sendData, 0, sendData.length);
		out.flush();
		System.out.println("送信データ:"
				+ DatatypeConverter.printHexBinary(sendData));
		System.out.println("送信完了");

		// DataInputStream in = new DataInputStream(socket.getInputStream());
		// System.out.println("[client]受信開始");
		// byte[] buf = new byte[4];
		// in.readFully(buf);
		// System.out.println("[client]受信完了");
		// System.out.println("[client]受信データ"+DatatypeConverter.printHexBinary(buf));
		//
		socket.close();
	}
	
}
