package com.estruturaDados.aula.teste;

import com.estruturaDados.aula.vetor.Vetor;

public class aula008 {
	public static void main(String args[]) {
		Vetor vetor = new Vetor(3);
		vetor.adiciona("diego");
		vetor.adiciona("curry");
		vetor.adiciona("iguodala");
		vetor.adiciona("lebron");
		vetor.adiciona("harden");

		System.out.println(vetor);
	}
}
