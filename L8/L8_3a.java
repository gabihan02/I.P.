 import java.util.Scanner;
 class L8_3a{
	 
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite quantos inteiros quer ordenar: ");
		int num = sc.nextInt();
		
		int [] array = new int [num];
		
		for (int i =0; i<num; i++) {
			System.out.print("Digite o inteiro: ");
			array [i] = sc.nextInt();
		}
		
		selecao(array);
		
	}
	 
	
	public static void selecao(int[] n){	//vai percorrer o array inteiro
		 
		 for(int j = 0; j<n.length; j++){	// determina o menor inteiro 
			 int posMenor = j;
			 int menor = n[j];
			 for(int i = j; i<n.length; i++){
				 if(menor >= n[i]){
					 posMenor = i;
					 menor = n[i];
				 }
			 }
			 
			 //troca o menor inteiro com a posicao j
			 int aux = 0;
			 aux = n[j];
			 n[j] = n[posMenor];
			 n[posMenor] = aux;
		 }
		 System.out.println("Array ordenado por selecao: ");
		 for(int c : n) System.out.println(c+" ");
	 }
	 
	
 }