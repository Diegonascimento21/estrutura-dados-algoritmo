package com.estruturaDados.aula.teste;

import com.estruturaDados.aula.vetor.Vetor;

public class Aula004 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(7);
		vetor.adiciona("elemento1");
		vetor.adiciona("elemento2");
		vetor.adiciona("elemento3");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());

	}

}
