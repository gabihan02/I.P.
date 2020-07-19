class L10_1{
	ListaSimples l = new ListaSimples();
	
	
	//cria a lista
	void cria(int[] letra){
		for (int i = 0; i<letra.length; i++){
			l.insere(letra[i]);
		}
	}

	
	//insere um elemento na lista na posicao i
	boolean insereNovo(int letra, int posicao){
		
		if (posicao < 0 || posicao > this.elementos()){
			return false;
		}
		
		No q = new No (letra);
		
		if(posicao == 0){
			q.prox = l.cabeca;
			l.cabeca = q;
		}
		
		else{
			No p = l.cabeca;
			for (int i = 0; i<posicao-1; i++){
				p = p.prox;
			}
			q.prox = p.prox;
			p.prox = q;
		}
		
		return true;
	}


	
	//exclui um elemenro da posi;'ao i da lista
	void exclui (int posicao){
		
		if (posicao == 0){
			l.cabeca = l.cabeca.prox;
		}
		
		else{
			No q = l.cabeca;
			No p = l.cabeca.prox;
			for (int i = 0; i<posicao-1; i++){
				q = p;
				p = p.prox;
			}			
			q.prox = p.prox;
		}
	}
	
	
	
	//escrever o conteudo da lista na tela
	void imprime(){
		No n = l.cabeca;
		while (n != null) {
			System.out.print(n.letra +" ");
			n = n.prox;
		}
	}
	
	
	
	//contar o numero de elementos da lista
	int elementos(){
		No p = l.cabeca;
		int contador = 0;
		while (p != null) {
			p = p.prox;
			contador++;
		}
		return contador;
	}
	
	
	
	public static void main (String [] args){
		
		L10_1 um = new L10_1();
		int [] letra = {1,2,3,4,5};
		
		um.cria(letra);
		um.imprime();
		
		System.out.println (um.elementos());
		
		um.insereNovo(3, 4);
		um.imprime();
		
		System.out.println (um.elementos());
		um.exclui(0);
		um.imprime();
	}
}