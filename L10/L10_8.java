import java.util.Scanner;

class L10_8 {
	
	ListaSimples l = new ListaSimples ();
	
	
	void cria(){
		System.out.println("Digite o numero para colocar na lista e -1 para parar");
		int num = 0;
		
		while (num != -1){
			Scanner sc = new Scanner (System.in);
			num = sc.nextInt();
			if (num != -1) {
				l.insere (num);
			}
		}	
	}
	
	
	
	void imprime(){
		No n = l.cabeca;
		System.out.print (n.letra + " ");
		
		n = l.cabeca.prox;
		
		while (n != null && n != l.cabeca){
			System.out.print (n.letra + " ");
			n = n.prox;
		}
		
		System.out.println();
	}
	
	
	
	void circular(){
		No n = l.cabeca;
		
		while (n.prox != null){
			n = n.prox;
		}
		
		n.prox = l.cabeca;
	}
	
	
	int elementos(){
		No n = l.cabeca.prox;
		
		int cont = 1;
		
		while (n != null && n != l.cabeca) {
			cont++;
			n = n.prox;
		}
		return cont;
	}
	
	
	void inverte(){
		int tam = elementos();
		No aux = l.cabeca;
		No aux1 = aux.prox;
		No aux2 = aux1.prox;
		
		for (int i = 0; i<tam; i++){
			aux1.prox = aux;
			aux = aux1;
			aux1 = aux2;
			aux2 = aux2.prox;
		}
		l.cabeca = aux2.prox;
	}
	
	
	public static void main (String [] args) {
		L10_8 x = new L10_8();
		
		
		x.cria ();
		System.out.println();
		
		System.out.print("Lista Circular criada: ");
		x.imprime();
		
		System.out.println();

		
		System.out.print("Lista Circular criada: ");
		x.circular();
		x.imprime();
		
		System.out.println();
		
		System.out.print("Lista Circular Invertida: ");
		x.inverte();
		x.imprime();
	}
}