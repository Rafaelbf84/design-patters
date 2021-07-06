package behavioral.templateMethod.impl;


public abstract class DataAccessObject {

	protected String connectionString = "connection string";
	protected String result;

	public void connect() {
		System.out.println("\nConnecting to database...");
	}

	public abstract void select();

	public abstract void process();

	public void disconnect() {
		System.out.println("Disconnecting to DB...");
	}

	public void run() {
		connect();
		select();
		process();
		disconnect();
	}

}
