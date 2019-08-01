package it.computerconfig.datas;

public class Computer {

	private Configuration configuration;
	
	public Computer(Configuration configuration) {
		this.configuration = configuration;
	}
	
	/**
	 * read the configuration 
	 */
	public void readConfiguration() {
		configuration.readConfig();
	}
}
