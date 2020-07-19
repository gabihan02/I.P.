class L10_2{
	ListaSimples l = new ListaSimples();
	
	/**
		(a) Receba, em seu parˆametro, um arranjo de n nu´meros inteiros e monte uma lista ligada com tais nu´meros em ordem inversa `a da sequ¨ˆencia de entrada, retornando referˆencia para essa lista 
	*/
	No cria(int[] num){
		for(int i = num.length - 1; i>=0; i--){
			l.insere(num[i]);
		}
		
		return l.cabeca;
	}
	

	/**
		(b) Remova todas as ocorrˆencias de um dado valor em uma lista (recebida por parametro)
	*/
	void exclui(int num){
		No n = l.cabeca;
		int pos = 0;
		
		while (n != null){
			if(n.letra == num){
				
				if(n == l.cabeca){
					l.cabeca = l.cabeca.prox;
				}
				
				else{
					No q = l.cabeca;
					No p = l.cabeca.prox;
					
					for(int i = 0; i<pos-1; i++){
						q = p;
						p = p.prox;
					}
					
					if(n.prox == null){
						q.prox = null;
						p = null;
					}
					
					else{
						q.prox = p.prox;
					}
				}
			}
			
			else{
				pos++;
			}
			
			n = n.prox;
		}
	}



	/**
		(c) Escreva os valores contidos em uma lista recebida por parametro
	*/

	void imprime(){
		No n = l.cabeca;
		while(n != null){
			System.out.print(n.letra+" ");
			n = n.prox;
		}
	}
	
	
	
	
	public static void main(String[] args){
		L10_2 x = new L10_2();
		int[] num = {1,34,6,8,3,4,7};
		
		x.imprime();
		No n = x.cria(num);
		System.out.println("Referencia para a lista: "+n.letra);
		
		System.out.println();
		
		System.out.print("Imprime Lista: ");
		x.exclui(4);
		x.imprime();
	}


}