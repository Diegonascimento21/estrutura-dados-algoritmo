package com.estruturaDados.aula.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho; // controla o tamanho do vetor

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento) { //adiciona um valor ao array na primeira posição nula/vazia
		for(int i = 0; i < elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	/*public void adiciona(String elemento) throws Exception { // melhorando metodo de adicionar
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;
		} else {
			throw new Exception("Vetor cheio");
		}
	}*/
	
	public boolean adiciona(String elemento) { // melhorando metodo de adicionar por boolean
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	
	}
	
	public boolean adiciona(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Erro, posição inválida");
		}

		/// move todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) { // Add elemento em qualquer posição
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
		
	}
	
	
	public int tamanho() { //verifica o tamanho
		return this.tamanho;
	}
	
	/*public String toString() {		//pega todos elementos inclusive nulos
		return Arrays.toString(elementos);
		
	}
	*/
	
	public String toString() { // pega todos elementos sem os nulos
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
	
	public String busca(int posicao) throws Exception { // pega os elementos por deter. posiçao
		if(!(posicao >= 0 && posicao < tamanho)) { //todas as posicoes que NAO podem ser acessadas
			throw new IllegalArgumentException("Erro, posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int busca(String elemento) { //busca sequencial//veririca se elemento existe
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
	}

}
