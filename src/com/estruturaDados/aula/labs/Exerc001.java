package com.estruturaDados.aula.labs;

import com.estruturaDados.aula.vetor.Lista;

public class Exerc001 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("C"));
	}
}
