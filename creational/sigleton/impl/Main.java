package creational.sigleton.impl;

public class Main {

	public static void main(String[] args) {
		LoadBalancer b1 = LoadBalancer.getLoadBalancer();
		LoadBalancer b2 = LoadBalancer.getLoadBalancer();
		LoadBalancer b3 = LoadBalancer.getLoadBalancer();
		LoadBalancer b4 = LoadBalancer.getLoadBalancer();

		if (b1 == b2 && b2 == b3 && b3 == b4) {
			System.out.println("Same instance");
		}
		
		LoadBalancer loadBalancer = LoadBalancer.getLoadBalancer();
		for (int i = 0; i < 10; i++) {
			String server = loadBalancer.getServer();
			System.out.println("Dispatch request to: " + server);
		}
	}
	
}
