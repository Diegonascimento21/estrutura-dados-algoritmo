package com.estruturaDados.aula.labs;

import com.estruturaDados.aula.vetor.Lista;

public class exerc004 {

	public static void main(String[] args) throws Exception {
		Lista<String> lista1 = new Lista<String>(5);
		lista1.adiciona("A");
		lista1.adiciona("B");
		lista1.adiciona("C");
		lista1.adiciona("D");
		lista1.adiciona("E");
		lista1.adiciona("F");
		
		System.out.println(lista1.obtem(4));

   }
}
