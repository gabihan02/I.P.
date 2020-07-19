//done

import java.util.Scanner;

class L7_10{
	public static void main(String[] args){
		String resposta;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Quer efetuar o calculo do valor absoluto de um valor real?");
			resposta = sc.nextLine();
			
			if(resposta.equalsIgnoreCase("sim")){
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o valor real: ");
				String valor = s.nextLine();
				
				int valorReal = Integer.parseInt(valor);
				if(valorReal < 0) valorReal = valorReal * (-1);
				System.out.println("O valor absoluto e: "+valorReal);
			}
		}
		while (resposta.equalsIgnoreCase("sim"));
	}
}