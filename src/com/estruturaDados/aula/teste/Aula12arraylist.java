package com.estruturaDados.aula.teste;

import java.util.ArrayList;

public class Aula12arraylist {

	public static void main(String[] args) {
		//Collections = estruturas de dados prontas
		
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("Diego"); //add elemento
		arraylist.add("João");
		arraylist.add("James");
		
		System.out.println(arraylist);
		
		arraylist.add(1, "element"); //add na posiçao desejada
		
		System.out.println(arraylist);
		
		boolean existe = arraylist.contains("Diego"); //se contem o elemento
		if(existe) {
			System.out.println("O elemento existe");
		}else {
			System.out.println("O elemento nao existe");
		}
		
		int pos = arraylist.indexOf("James"); //retorna a posição
		if(pos <= -1) {
			System.out.println("O elemento não existe" + pos);
		}else {
			System.out.println("O elemento existe na posição: " + pos);
		}
		
		System.out.println(arraylist.get(2)); //busca por posição
		
		arraylist.remove(1); //remover
		arraylist.remove("Diego");
		
		System.out.println(arraylist.size()); //tamanho do array
		
		
		
	}

}
