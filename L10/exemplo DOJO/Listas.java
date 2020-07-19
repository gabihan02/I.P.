import java.util.*;

public class Listas {
	public static void main(String[] args){

		//Usando LinkedList do Java:

		/*List<String> l1 = new LinkedList<>();

		l1.add("Clovis");
		l1.add("Mariana");
		l1.add("Robson");

		System.out.println(l1);
		System.out.println(l1.contains("Clovis"));
		System.out.println(l1.get(0));
		System.out.println(l1.indexOf("Mariana"));

		l1.remove(0);
		l1.remove("Robson");

		System.out.println(l1);*/

		// Usando nossa implementação de LinkedList:

		ListaLigada lista = new ListaLigada();

		lista.inserir("Clovis");
		lista.inserir("Mariana");
		lista.inserir("Robson");

		System.out.println(lista);

		lista.excluir(0);

		System.out.println(lista);

	}
}

// Uma implementação de lista ligada

// Criando no:

class No {

	String nome;
	No prox;

	No(String nome){
		this.nome = nome;
	}
}

class ListaLigada {

	No cabeca;

	ListaLigada() {
		this.cabeca = null;
	}

	int tamanho(){

		No nav = this.cabeca;
		int cont = 0;

		while(nav != null){
			cont++;
			nav = nav.prox;
		}

		return cont;
	}

	void inserir(String nome){
		No novo = new No(nome);

		novo.prox = this.cabeca;
		this.cabeca = novo;
	}

	void inserir(String nome, int pos){
		No novo = new No(nome);

		if(pos == 0){
			novo.prox = this.cabeca;
			this.cabeca = novo;
			return;
		}

		No nav = this.cabeca;
		for(int i = 0; i < pos - 1; i++)
			nav = nav.prox;

		novo.prox = nav.prox;
		nav.prox = novo;
	}

	boolean excluir(int pos){
		if(pos < 0 || pos >= this.tamanho() || this.cabeca == null)
			return false;

		if(pos == 0){
			this.cabeca = this.cabeca.prox;
			return true;
		}

		No nav = this.cabeca;
		for(int i = 0; i < pos - 1; i++)
			nav = nav.prox;

		nav.prox = nav.prox.prox;

		return true;
	}

	public String toString(){
		if(this.cabeca == null)
			return "";

		No nav = this.cabeca;
		String resp = "";

		while(nav != null){
			resp = resp + nav.nome + " ";
			nav = nav.prox;
		}

		return resp;
	}
}