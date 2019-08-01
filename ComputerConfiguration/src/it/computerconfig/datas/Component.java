package it.computerconfig.datas;

import java.util.ArrayList;

public class Component {

	private Type type;
	private String description;
	private ArrayList<Component> incompatible = new ArrayList<Component>();
	
	/**
	 * component's constructor
	 * @param type
	 * @param description
	 */
	public Component(Type type, String description) {
		this.type = type;
		this.description = description;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setIncompatible(Component component) {
		incompatible.add(component);
	}
	
	/**
	 * check inside the list of the component if it is compatible or not with the other component
	 * @param component
	 * @return
	 */
	public boolean isIncompatible(Component component) {
		boolean result = false;
		
		if(incompatible.contains(component)) {
			result = true;
		}
			return result;
	}
}
