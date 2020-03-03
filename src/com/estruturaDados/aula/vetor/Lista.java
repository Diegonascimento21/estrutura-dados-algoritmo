package com.estruturaDados.aula.vetor;

import java.lang.reflect.Array;

public class Lista<T> { //CLASSE generics //simbologia de tipo // so aceita elementos de 1 tipo
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; //SOLUÇAO DO LIVRO EFFECTIVE JAVA
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) { //reflection //instanciar classe generica
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;

	}

	public boolean adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Erro, posição inválida");
		}

		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;

	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Erro, posição inválida");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}
	
	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if(pos > -1) {
			this.remove(pos);
		}
	}
	
	public void limpar(){
		//opcao 1
		// this.elementos = (T[]) new Object[this.elementos.length];
		
		//opcao 2 
		//this.tamanho = 0;
		
		//opcao 3
		for(int i = 0; i<this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
		
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();

	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public Object busca(int posicao) throws Exception {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Erro, posição inválida");
		}
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
	}
	
	public boolean contem(T elemento) {
		/* if (pos > -1){
		 * return true;
		 * }
		 * return false;  
		  */
		
		return busca(elemento) > -1;
	}
	
	public int ultimoIndice(T elemento) {
		for(int i = this.tamanho-1; i >= 0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public Object obtem(int posicao) throws Exception {
		return this.busca(posicao);
	}
	
}
