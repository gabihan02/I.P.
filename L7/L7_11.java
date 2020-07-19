//done
import java.util.Scanner;

class L7_11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma frase de 20 caracteres no maximo: ");
		String frase = input.nextLine();
		
		char[] f = frase.toCharArray();
		int contEspaco = 0;
		int a = 0;
		for (int i = 0; i<f.length; i++){
			if (f[i] == ' ') contEspaco++;
			if (f[i] == 'a') a++;
		}	

		System.out.println("A frase tem "+contEspaco+" espacos");
		System.out.println("A frase tem "+a+" a");
	}
}