// depende de L4_12
// derivada de um polinomio
class L4_13{
	public static void main(String[] args){
		
		double valorX = 2;
		double[] coeficiente = {1,2,2};
		double[] resposta = derivada(valorX,coeficiente);
		
		
		System.out.print("O resultado de p(x) e = ");
		for(int i = 0; i < resposta.length; i++){
			System.out.print(resposta[i] + " ");
		}
		System.out.println();	
	}
	
	static double[] derivada(double x, double[] a){
	
		double[] resposta = new double [a.length];
		
		for (int i = 0; i < a.length; i++){			
			resposta[i] += (i*(a[i])*Math.pow(x,i-1));
		}
		
		return (resposta);
	}

}
	
	
	
	
	
	
	
	
	
	
