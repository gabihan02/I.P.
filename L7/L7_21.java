//done

import java.util.Scanner;
class L7_21{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int quantidade = 0;
		double preco = 0;
		int tamanho = 0;
		
		System.out.print("Quantos tipos de produtos quer que sejam inicializados? ");
		tamanho = input.nextInt();
		
		double[][] nota = new double [tamanho+1][3];
		
		for(int i = 0; i<tamanho; i++){
			System.out.print("Digite a quantidade e o valor unitario: ");
			quantidade = input.nextInt();
			preco = input.nextDouble();
			nota[i][0] = quantidade;
			nota[i][1] = preco;
			nota[i][2] = preco*quantidade;
			nota[nota.length-1][nota[2].length-1] += nota [i][2];
		}
		
		for(double[] c : nota){
			for(double a:c){
				if (a != 0) System.out.print(a+"\t");
				else System.out.print("\t");
			}
			System.out.println();
		}
	}

}