package it.computerconfig.main;

import it.computerconfig.datas.*;

public class Main {

	/*
	 * Un sito vuole consentire agli utenti di ordinare computer assemblati. Data
	 * l'enumerazione: enum Type { CPU, BOARD, RAM; } implementare le classi
	 * Component, che rappresenta un componente di un PC, e Con guration, che
	 * rappresenta un PC da assemblare. Un componente è caratterizzato dalla sua
	 * tipologia (Type) e da una descrizione (stringa). Il suo metodo
	 * setIncompatible dichiara che questo componente è incompatibile con un altro
	 * componente, passato come argomento. Un componente può essere incompatibile
	 * con diversi altri componenti. Il metodo add di Con guration aggiunge un
	 * componente a questo PC e restituisce true, ma solo se il componente è
	 * compatibile con quelli già inseriti, ed è di tipo diverso da quelli già
	 * inseriti, altrimenti non lo inserisce e restituisce false. Suggerimento: Una
	 * classe Component ben progettata non nominerà le 3 istanze di Type.
	 * L'implementazione deve rispettare il seguente esempio d'uso.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// Create a configuration
		Configuration config = new Configuration();

		// Create all the component
		Component cpu = new Component(Type.CPU, "Core_i5_7500");
		Component cpu2 = new Component(Type.CPU, "Ryzen_5_2600");

		Component board = new Component(Type.BOARD, "Prime_X470");
		Component board2 = new Component(Type.BOARD, "Prime_Z370");

		Component ram = new Component(Type.RAM, "DDR4_8GB");

		// Set the cpu incompatible with the board2 anche the board 1 incompatible with
		// the cpu2
		cpu.setIncompatible(board2);
		board.setIncompatible(cpu2);

		// check if the components are added into the configuration
		if (!config.add(board) || !config.add(ram) || !config.add(cpu)) {
			System.out.println("Can't add the component");
		} else {
			// Create a computer with this configuration and read the info
			Computer computer = new Computer(config);
			System.out.println("Computer configuration:");
			computer.readConfiguration();
		}

	}
}
