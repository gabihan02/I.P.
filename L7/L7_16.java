//done

import java.util.Scanner;

class L7_16{
	public static void main(String[] args){
		double a = 0;
		double mediaProvas = 0;
		double mediaTrabalhos = 0;
		double mediaFinal = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a nota da P1");
		mediaProvas += input.nextDouble()*0.4;
		
		System.out.println("Digite a nota da P2");
		mediaProvas += input.nextDouble()*0.6;
		
		System.out.println("Digite a nota da EP1");
		mediaTrabalhos += input.nextDouble();
		
		System.out.println("Digite a nota da EP2");
		mediaTrabalhos += input.nextDouble();
		
		System.out.println("Digite a nota da EP3");
		mediaTrabalhos += input.nextDouble();
		
		mediaTrabalhos /= 3;
		mediaFinal = 0.8*mediaProvas + 0.2*mediaTrabalhos;
		System.out.println("Media final: "+mediaFinal);
		mediaFinal *= 10;
		System.out.println("Aproveitamento: "+mediaFinal+"%");
		
		
		
	}
}