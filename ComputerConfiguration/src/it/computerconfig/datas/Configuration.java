package it.computerconfig.datas;

import java.util.ArrayList;

public class Configuration {

	private static ArrayList<Component> components = new ArrayList<Component>();
	
	/**
	 * try to add a component into the list by calling the method canAdd
	 * @param component
	 * @return true = component addes, false = component not added
	 */
	public boolean add(Component component) {
		boolean result = false;
		if(canAdd(component)) { 
			components.add(component);			
			result = true;
		}
		return result;
	}
	
	/**
	 * check inside the list of the configuration if the component exist and if it is compatible with the other components 
	 * @param component
	 * @return true = can be added / false = cannot be added
	 */
	public static boolean canAdd(Component component) {
		boolean result = true;
		
		for (Component componentPC : components) {
			if(componentPC.getType().equals(component.getType()) ||
									componentPC.isIncompatible(component)){
				result = false;
			}
		}
		return result;
	}
	
	/**
	 * read the configuration
	 */
	public void readConfig() {
		for (Component component : components) {
			System.out.println(component.getType()+" - "+component.getDescription());
		}
	}
}
