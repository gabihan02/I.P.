//done

import java.util.Scanner;

class L7_19{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String frase = null;
		
		System.out.print("Digite a frase: ");
		frase = input.nextLine();
		
		char[] letras = frase.toCharArray();
		letras[0] = Character.toUpperCase(letras[0]);
		
		for(int i = 1; i<letras.length-1; i++){
			if (letras[i] == ' ') letras [i+1] = Character.toUpperCase(letras[i+1]);
		}
		
		for (char c : letras) System.out.print(c);
	
	}




}