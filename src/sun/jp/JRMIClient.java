package sun.jp;

import java.io.IOException;
import java.net.UnknownHostException;

import net.sun.jp.Client_TCP;



public class JRMIClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length!=1) {
			System.err.println("Please input the right format[hostname remote_port local_port]");
			System.exit(-1);
		}
		int local_port = Integer.parseInt(args[0]);
		
		Client_TCP clientTCP = new Client_TCP(local_port);
		try {
			clientTCP.getServerConnect();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
