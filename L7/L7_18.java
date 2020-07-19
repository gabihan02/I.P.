//done

import java.util.Scanner;

class L7_18{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int tamanho = 4;
		int aux = 0;
		int[] lista = new int[tamanho];
		int cont = lista.length-1;
		
		do{
			if(cont >= 0){
				System.out.print("Digite o numero: ");
				aux = input.nextInt();
				lista[cont] = aux;
				cont--;
			}
			if (cont < 0){
				System.out.println("Os inteiros adicionais serao ignorados");
				break;
			}
		}
		
		while(aux !=-1);
		
		System.out.println();
		
		for (int c : lista){
			if (c != 0 && c != -1) System.out.println(c);
		}
	}
}
