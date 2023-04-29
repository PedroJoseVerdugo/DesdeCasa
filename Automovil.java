package com.ejerciciopoo;

public class Automovil {

	//atributos o caracteristicas
	String marca;
	int modelo;
	int precio;
	
	boolean estado = false;
	
	//definicion de constructor
	public Automovil() {
		System.out.println("Se creo un objeto de tipo automovil");
	}
	//metodo o acciones
	public void encender(){	
		if(estado == true) {
			System.out.println("El automovil ya esta encendido");
		}else {
			System.out.println("El automovil se ha encendio");
			estado = true;
		}
	}
	public void apagar(){	
		if(estado = true) {
			System.out.println("El automovil se apago");
			estado = false;
		}else {
			System.out.println("El automovil ya esta apagado");
		}
	}
	public void avanzar(){
		if(estado == true) {
			System.out.println("El atuomovil esta avanzando");
		}else {
			System.out.println("El automovil no puede avanzar, esta apagado");
		}	
	}
}
