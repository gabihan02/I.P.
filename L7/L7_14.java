//done

import java.util.Scanner;


class L7_14{
	public static void main(String[] args){
		
		double[] n = {10,5,0};
		System.out.println("Media: "+RetornaMedia(n));
	}
	
	static double RetornaMedia(double[] num){
		
		int cont = 0;
		int soma = 0;
		for (int i = 0; i<num.length; i++){
			soma += num[i];
			cont++;
		}	
		
		double media = soma/cont;
		return media;
		
		
	}
		

	

}