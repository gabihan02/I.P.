//done

import java.util.Scanner;

class L7_12{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Digite quantos numeros quer que o arrajo tenha: ");
		int tamanho = s.nextInt();
		int[] num = new int [tamanho];
		
		for(int i = 0; i<tamanho; i++){
			Scanner input = new Scanner(System.in);
			System.out.println("Digite qual e o numero: ");
			num[i] = input.nextInt();
		}
		
		
		for(int ult = num.length - 1; ult > 0; ult--){
			for(int i = 0; i<ult; i++){
				if(num[i] > num[i+1]){
					int aux = num[i];
					num[i] = num[i+1];
					num[i+1] = aux;
				}
			}
		}
		
		System.out.println("O valor maximo e "+num[num.length-1]+" e o valor minimo e "+num[0]);
		
		
	}
	
	
	
}