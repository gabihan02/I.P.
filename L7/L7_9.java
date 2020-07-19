//done
import java.util.Scanner;

class L7_9{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite os caracteres: ");
		String numero = input.nextLine();
		ordena(numero);

	}
	
	static void ordena(String numero){
		char[] teste = numero.toCharArray();
		for (int i = 0; i < teste.length; i+=3){
			if(teste[i] == teste[i+1] && teste[i+1] == teste[i+2]){
				System.out.println("Os numeros sao iguais");
			}
			else{
				if(teste[i] <= teste[i+1] && teste[i+1] <= teste [i+2]){
					System.out.println("Os numeros estao ordenados em ordem crescente");
				}
				else{
					if(teste[i+2] <= teste[i+1] && teste[i+1] <= teste [i]){ 
						System.out.println("Os numeros estao ordenados em ordem decrescente");
					}
					else{
						System.out.println("Os numeros estao desordenados");
					}
				}
			}
		}
		
	}
	
}

