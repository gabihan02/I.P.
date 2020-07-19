//lista simples

public class ListaSimples{
	No cabeca;
	
	//cabeca
	public ListaSimples(){
		this.cabeca = null;
	}
	
	
	public void insere (int novo){ //inserir elemento no incio
		No aux = new No(novo); //criar o novo elemento a ser inserido
		aux.prox = this.cabeca; //elemento1 ser o seu proximo
		this.cabeca = aux; //tornar novo elementeo o novo incio da lista
	}	
}