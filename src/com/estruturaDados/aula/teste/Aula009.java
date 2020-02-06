package com.estruturaDados.aula.teste;

import com.estruturaDados.aula.vetor.Vetor;

public class Aula009 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		 vetor.adiciona("A");
		 vetor.adiciona("k");
		 vetor.adiciona("B");
		 vetor.adiciona("C");
		 vetor.adiciona("D");
		 
		 System.out.println(vetor);
		 
		 vetor.remove(1);
		 
		 System.out.println(vetor);
		 
		 int pos = vetor.busca("C");
		 
		 System.out.println(pos);
		 
		 if(pos >= 0) {
			 vetor.remove(pos);
		 }else {
			 System.out.println("Eroo, posiçáo inválida ou inexistente");
		 }
		 
		 System.out.println(vetor);
		 
		 
		 

	}

}
