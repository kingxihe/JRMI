package sun.jp;

import net.sun.jp.ServerTCP;

public class JRMIServer {

	public JRMIServer(int local_port)throws Exception {
		// TODO Auto-generated constructor stub
		System.out.println("be connected by JRMIClient!");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 1099;
		if (args.length== 1) {
			port = Integer.parseInt(args[0]);
		}
		try {
			new JRMIServer(port);
			new ServerTCP(port);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
