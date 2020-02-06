package com.estruturaDados.aula.teste;

import com.estruturaDados.aula.vetor.Vetor;

public class Aula007add { //Add elemento em qualquer posição

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		
		System.out.println(vetor);
		
		vetor.adiciona(5, "F");
		
		System.out.println(vetor);
		
	}

}
