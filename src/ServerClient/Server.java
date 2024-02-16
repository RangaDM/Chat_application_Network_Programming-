package ServerClient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.sampled.Port;

public class Server {
	
	static int port = 6600;

	public static void main(String[] args) throws IOException {
		System.out.println("\n\n\t\t simple socker server");
		System.out.println("\t\t ================ \n");
		
		ServerSocket serversocket = new ServerSocket(port);
		try {
			while(true) {
				Socket socket = serversocket.accept();
				System.out.println("Client is connected....\n\n");
				
				try {
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println("Welcome to Scocket Programming");
				} finally {
					socket.close();
				}
				}
		} finally {
			serversocket.close();
		}
		}
}
