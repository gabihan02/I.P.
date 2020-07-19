import java.util.Scanner;

class L10_3_4_5_6_7{
	ListaSimples l = new ListaSimples();
	ListaSimples s = new ListaSimples();
	
	void cria (int num) {
		l.insere (num);
		s.insere (num);
	}
	
	
	
	void imprime () {
		No n = l.cabeca;
		System.out.print ("Lista Ligada 1: ");
		while (n != null){
			System.out.print (n.letra + " ");
			n = n.prox;
		}
		n = s.cabeca;
		System.out.print ("\n Lista Ligada 2: ");
		while (n != null){
			System.out.print (n.letra + " ");
			n = n.prox;
		}
		System.out.println ();
	}
	
	
	
	/**
		3(a) Leia uma sequ¨ˆencia de n nu´meros inteiros (do teclado) 
		e monte uma lista ligada com tais nu´meros na mesma ordem 
		da sequ¨ˆencia de entrada 
	
	*/
	void inverteLista (){
		No p = l.cabeca.prox;
		No q = p.prox;
		No r = l.cabeca;
		l.cabeca.prox = null;
		p.prox = r;
		while (q != null) {
			if (q.prox == null) {
				l.cabeca = q;
				l.cabeca.prox = p;
				p.prox = r;
				break;
			}
			r = p;
			p = q;
			q = q.prox;
			p.prox = r;
		}
	}
	
	
	
	
	/**
		3(b) Remova todas as ocorrˆencias de um dado valor na lista (recebida por parametro)
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
		5
	*/
	
	No referencia (int num){
		No n = l.cabeca;
		while (n != null) {
			if (n.letra == num) {
				return n;
			}
			n = n.prox;
		}
		return null;
	}
	
	
	
	
	
	/**
		6
	*/
	void concatena (ListaSimples l, ListaSimples s){
		No n = l.cabeca;
		while (n.prox != null){
			n = n.prox;
		}
		n.prox = s.cabeca;
	}
	
	
	
	/**
		7
	*/
	void intercala(ListaSimples l, ListaSimples s){
				
		int cont = 0;
		No n = l.cabeca;
		
		do(n.prox != null){
			if (cont%2 == 0){
				n = n.prox;
				cont++;		
			}
			if(cont%2 != 0){
				n.prox = s.cabeca;
				cont++;
			}
		}while(cont<l+s);
	}
	
	
	public static void main (String [] args) {
		L10_3_4_5_6_7 x = new L10_3_4_5_6_7 ();
		int num = 0;
		
		System.out.println ("Digite o numero para colocar na lista e -1 para parar");
		
		while (num != -1) {
			Scanner sc = new Scanner (System.in);
			num = sc.nextInt();
			if (num != -1){	
				x.cria (num);
			}
		}
		
		System.out.println ("\t\tLista Ligada Normal");
		x.imprime();
		x.inverteLista();
		
		System.out.println();
		
		System.out.println ("\t\tLista Ligada Invertida");
		x.imprime();
		
		System.out.println();
		
		System.out.println ("\t\tLista Ligada com todas as ocorrencias de um dado valor na lista removido");
		x.exclui(5);
		x.imprime();
		
		System.out.println();
		
		System.out.println ("\t\tReferencia Elemento Lista Ligada");
		System.out.println ("\n"+x.referencia (4));
		x.imprime();
		
		System.out.println();
		
		System.out.println ("\t\tLista Ligada Concatenada");
		x.concatena (x.l, x.s);
		x.imprime();
		
		System.out.println();
		
		System.out.println ("\t\tLista Ligada Intercalada");
		x.intercala(x.l, x.s);
		x.imprime();
		
		System.out.println();
	}
}