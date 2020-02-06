package com.estruturaDados.aula.teste;

import com.estruturaDados.aula.vetor.Vetor;

public class Aula006 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(6);
		vetor.adiciona("Javascript");
		vetor.adiciona("Javat");
		vetor.adiciona("Javascr");
		vetor.adiciona("Javascripto");
		
		System.out.println(vetor.busca("Javascripto"));

	}

}
