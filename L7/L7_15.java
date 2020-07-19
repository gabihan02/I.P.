//done

import java.util.Scanner;

class L7_15{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quatidade de numeros primos que deseja saber: ");
		mostrarPrimos(input.nextInt());
	}
	
	
	static void mostrarPrimos(int n){
		System.out.print("\t1\t2\t");
		boolean a = false;
		n = n+2;
		for(int i = 2; n>0; i++){
			a = false;
			for(int j = 2; j<i; i++){
				if((i%j) != 0) break;
				else a = true;
			}
			
			if(a) System.out.print("\t"+i+"\t");
			n--;
		}
	}
		
		

}