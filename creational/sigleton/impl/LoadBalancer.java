package creational.sigleton.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {

	private static LoadBalancer instance;
	private List<String> server = new ArrayList<String>();
	private Random random = new Random();
	
	private LoadBalancer() {
		server.add("Server I");
		server.add("Server II");
		server.add("Server III");
		server.add("Server IV");
		server.add("Server V");
	}
	
	public static LoadBalancer getLoadBalancer() {
		if (instance == null) {
			instance = new LoadBalancer();
		}
		return instance;
	}
	
	public String getServer() {
		int nextInt = random.nextInt(server.size());
		return server.get(nextInt);
	}
	
}
