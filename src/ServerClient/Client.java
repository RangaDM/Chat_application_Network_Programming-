package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	
	static int port = 6600;

	public static void main(String[] args) throws IOException {
		
		System.out.println("\t\t Simple client");
		System.out.println("\t\t ==============\n\n");
		
		InetAddress ipAddress = InetAddress.getLocalHost();
		
		Socket socket = new Socket(ipAddress, port);
		
		System.out.println("Server is connected...\n");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String input =  in.readLine();
		System.out.println("Server syas : " + input);
		System.out.println("Closing Connection...");
		
		socket.close();
		in.close();
		
		System.exit(0);
		}

}
