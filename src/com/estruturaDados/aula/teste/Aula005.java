package com.estruturaDados.aula.teste;

import com.estruturaDados.aula.vetor.Vetor;

public class Aula005 {

	public static void main(String[] args) throws Exception {
		Vetor vetor = new Vetor(5);
		vetor.adiciona("diego");
		
		System.out.println(vetor.busca(0));

	}

}
