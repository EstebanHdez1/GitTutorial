package co.edu.unbosque.controller;

import co.edu.unbosque.model.CSVArchivo;

public class Controller {

	public Controller() {
		
		run();
	}
	
	public void run() {
		
		CSVArchivo arch = new CSVArchivo();
		
		//arch.leer();
		arch.BuscarFactura();
		
	}
	
}
