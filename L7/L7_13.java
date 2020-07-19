//done

import java.util.Scanner;


class L7_13{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double media = 0;
		String resposta = null;
		int num = 0;
		
		do{
			System.out.println("Digite o numero:");
			media += input.nextDouble();
			num++;
			System.out.println("Quer continuar?");
			resposta = input.next();
		}
		
		while (resposta.equalsIgnoreCase("sim"));
		media /= num;
		System.out.println("Media: "+media);

	}

}