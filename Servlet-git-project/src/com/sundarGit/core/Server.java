package com.sundarGit.core;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class Server {

	private final String host = "localhost";
	private final static int http_port = 8080;
	private  ServerSocket serverSocket = null;
	private final int backLog = 50;
	
	public  void startServer() {		
		try {		
			serverSocket = new ServerSocket(http_port,backLog,InetAddress.getByName(host));
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Exception in creating server "+e.getMessage());	
		}		
	}
		
	public  static void main(String []args) {
		new Server().startServer();		
	}
	
}
