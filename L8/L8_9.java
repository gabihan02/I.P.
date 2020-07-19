import java.util.Scanner;

class L8_9{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Qual e o numero maximo a ser imaginado? ");
		int n = input.nextInt();
		
		int[] chances = new int[n+1];
		for(int i = 0; i<=n; i++){
			chances[i] = i;
		}
		
		
		int ini = 0;
		int fim = chances.length-1;
		int meio = (ini+fim)/2;
		System.out.println(chances[meio]);
		String resposta = null;
		
		do{
			System.out.print("Esse numero e igual, maior ou menor do qeu voce imaginou? ");
			resposta = input.next();
			
			if(resposta.equalsIgnoreCase("menor")){
				ini = meio + 1;
				meio = (ini+fim)/2;
				System.out.println(chances[meio]);
			}
			
			if(resposta.equalsIgnoreCase("maior")){
				fim = meio - 1;
				meio = (ini+fim)/2;
				System.out.println(chances[meio]);
			}
		}
		while (resposta.equalsIgnoreCase("maior") || resposta.equalsIgnoreCase("menor"));
	}
}









