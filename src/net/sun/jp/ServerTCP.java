package net.sun.jp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
	

	private static int server_port;

	public  ServerTCP(int port) {
		// TODO Auto-generated constructor stub
		
		this.server_port = port;
	}

	public static void main(String[] args)throws IOException {
		
		ServerSocket listenClient = new ServerSocket(server_port);
		Socket server = listenClient.accept();
	}

}
