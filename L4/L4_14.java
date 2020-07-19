// depende de L4_12

class L4_14{
	public static void main(String[] args){
		double valorX = 2;
		double[] coeficienteP = {1,2,3};
		double[] resultadoP = polinomioP(valorX, coeficienteP);
		
		double[] coeficienteQ = {1,2,1};
		double[] resultadoQ = polinomioQ(valorX, coeficienteQ);
		
		double[] soma = polinomio(resultadoP, resultadoQ);
		
		System.out.print("O resultado de p(x) e = ");
		for(int i = 0; i < soma.length; i++){
			System.out.print(soma[i] + " ");
		}
		System.out.println();		
	}
	
	
	static double[] polinomioP(double x, double[] p){
		double[] resultadoP = new double[p.length];
		for (int i = 0; i < p.length; i++){
			resultadoP[i] += (p[i]*Math.pow(x,i));
		}
		return (resultadoP);	
	}
	
	
	static double[] polinomioQ(double x, double[] q){
		double[] resultadoQ = new double[q.length];
		for (int i = 0; i < q.length; i++){
			resultadoQ[i] += (q[i]*Math.pow(x,i));
		}
		return (resultadoQ);	
	}


	static double[] polinomio(double[] polinomioP, double[] polinomioQ){
		double[] soma = new double [polinomioP.length];
		
		for (int i = 0; i < polinomioP.length; i++){
			soma[i] += (polinomioP[i]+polinomioQ[i]);
		}
		
		return (soma);	
	}

}