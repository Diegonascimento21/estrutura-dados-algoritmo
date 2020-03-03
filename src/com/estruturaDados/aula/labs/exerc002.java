package com.estruturaDados.aula.labs;

import java.util.ArrayList;

import com.estruturaDados.aula.vetor.Lista;

public class exerc002 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>(5);
		
		lista.add("A");
		lista.add("C");
		lista.add("F");
		
		System.out.println(lista.lastIndexOf("C"));
		
		Lista<String> lista1 = new Lista<String>(5);
		lista1.adiciona("A");
		lista1.adiciona("B");
		lista1.adiciona("C");
		
		System.out.println(lista1.ultimoIndice("B"));
		
		
	}

}
