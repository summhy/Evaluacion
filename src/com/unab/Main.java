package com.unab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Evaluacion prueba = new Evaluacion("¿Está Nublado?", "Si");
		
		System.out.println(prueba.getPregunta());
		Scanner entrada = new Scanner(System.in);
		String valor = entrada.nextLine();
		
		prueba.setRespuesta(valor);
		System.out.println(prueba.validar());
		
		
		
		

	}

}
