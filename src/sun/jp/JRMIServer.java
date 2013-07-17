package sun.jp;

import net.sun.jp.Server_TCP;


public class JRMIServer {

	public JRMIServer(int local_port)throws Exception {
		// TODO Auto-generated constructor stub
		System.out.println("start server....");
		Server_TCP server_TCP = new Server_TCP(local_port);
		server_TCP.setClientAccept();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 5000;
		if (args.length== 1) {
			port = Integer.parseInt(args[0]);
		}
		try {
			new JRMIServer(port);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
