 import java.util.Scanner;
 class L8_3b{
	 
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite quantos inteiros quer ordenar: ");
		int num = sc.nextInt();
		
		int [] array = new int [num];
		
		for (int i =0; i<num; i++) {
			System.out.print("Digite o inteiro: ");
			array [i] = sc.nextInt();
		}
		

		insercao(array); 
		
	}
	
	 
	public static void insercao(int[] v){	//vai percorrer o array inteiro
		for(int i = 1; i<v.length; i++){
			int aux = v[i]; // guarda o número da posição a ser inserida
			int j = i; // variavel para percorrer o array para tras da posicao inicial a ser guardada
			// desloca o array para abrir espaco
			
			while ((j>0) && aux < (v[j-1])) {
				v[j] = v[j-1];
				j--;
			}
			
			v[j] = aux; //guarda no espaco aberto o numero inicial
		}
		
		System.out.println("Array ordenado por insercao: ");
		for (int el : v) System.out.println(el+" ");
		System.out.println();
	} 
	
	
	
 }