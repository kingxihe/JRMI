package sun.jp;

import tool.sun.jp.Message;


public class JRMIClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length!=3) {
			System.err.println("Please input the right format[hostname remote_port local_port]");
			System.exit(-1);
		}
		int remote_port = Integer.parseInt(args[1]);
		int local_port = Integer.parseInt(args[2]);
		String hostname =args[0];
		
		System.out.println(hostname+"\n"+remote_port+"\n"+local_port);
		
		try {
			JRMIServer jrmiServer = new JRMIServer(local_port);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Message message = new Message("Hello");
//		ObjectID sid = new ObjectID(hostname,remote_port,message);

	}

}
