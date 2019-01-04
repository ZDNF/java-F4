package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerR{
	Socket socket;
	ServerSocket server;
	public static ArrayList<Socket> sockets;
	
	Thread a = new Thread(new Runnable() {
		public void run() {
			// TODO Auto-generated method stub
			try {
				sockets = new ArrayList<Socket>();
				 server = new ServerSocket(5507);
				while(true) {
					socket = server.accept();
					sockets.add(socket);
					new Server(socket).start();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				System.out.println("GO");
			}
		}
	});
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerR server = new ServerR();
		server.a.start();
	}
}
