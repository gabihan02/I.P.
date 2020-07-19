import java.util.Scanner;

class L7_8{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		String muda = input.nextLine();
		
		
		String[] separados = muda.split("\\.");
		String num = "";
		
		for (int i = 0; i < separados.length; i++){
			num = num + separados[i];
		}
		
		char[] array = num.toCharArray();
		for (int i = 0; i < num.length(); i++){
			if (array[i] == ',') array[i] = '.' ;
		}
		
		String end = String.valueOf(array);
		float fim = Float.parseFloat(end);
			
			System.out.printf("Numero digitado foi: %.2f", fim);
			
	}
	
}






	 