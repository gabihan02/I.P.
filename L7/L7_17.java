//done

import java.util.Scanner;

class L7_17{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String resposta = null;
		int num = 0;
		
		do{
			System.out.print("Digite o numero: ");
			num = input.nextInt();
			System.out.println("O valor da potencia: "+Potencia(num));
			System.out.print("Quer continuar? ");
			resposta = input.next();
		}
		while (resposta.equalsIgnoreCase("sim"));
	}
	
	
	public static int Potencia(int num){
		int aux = 0;
		while (num%2==0){
			num /= 2;
			aux++;
			if (num == 1) return aux;
		}
		return -1;
	}
	
	
	
}



