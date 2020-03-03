package com.estruturaDados.aula.teste;

import com.estruturaDados.aula.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(4);

		vetor.adiciona(5);
		vetor.adiciona("diego");
		vetor.adiciona(8.8);

		System.out.println(vetor);

		Contato c1 = new Contato("diego", 40028922, "diego@gmail.com");
		Contato c2 = new Contato("Camila", 80028825, "diego@gmail.com");
		Contato c3 = new Contato("Irineu", 96845236, "diego@gmail.com");
		Contato c4 = new Contato("Irineu", 96845236, "diego@gmail.com");

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);

		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("O elemento existe!!!");
		} else {
			System.out.println("O elemento NÃO existe!");
		}

		System.out.println(vetor);

	}

}
