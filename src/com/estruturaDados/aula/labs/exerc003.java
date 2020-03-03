package com.estruturaDados.aula.labs;


import com.estruturaDados.aula.vetor.Lista;

public class exerc003 {
	public static void main(String[] args) {
		
		Lista<String> lista1 = new Lista<String>(5);
		lista1.adiciona("A");
		lista1.adiciona("B");
		lista1.adiciona("C");
		lista1.adiciona("D");
		lista1.adiciona("E");
		lista1.adiciona("F");
		
		System.out.println(lista1);
		
		lista1.remove("A");
		
		System.out.println(lista1);
		
		lista1.remove("C");
		
		System.out.println(lista1);
		
		lista1.remove("D");
		
		System.out.println(lista1);
	}
}
