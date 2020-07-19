//done

import java.util.Scanner;

class L7_20{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a frase: ");
		String frase = input.nextLine();
		
		char[] a = frase.toCharArray();
		char[] resposta = new char[a.length];
		
		for(int i = 0; i<a.length; i++){
			if (a[i] >= '0' && a[i] <= '9') resposta[i] = '^';
		}
		
		for (char c : a) System.out.print(c);
		System.out.println();
		for (char c : resposta) System.out.print(c);
	}
}