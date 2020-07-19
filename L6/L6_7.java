//done
class Complexo{
	
	double[] soma(double[] num1, double[]num2){
		
		double[] resp = new double[2];
		
		resp[0] = num1[0] + num2[0];
		resp[1] = num1[1] + num2[1];
			
		
		return (resp);
	} 
	
	
	double[] sub(double[] num1, double[]num2){
		double[] resp = new double[2];
		
		resp[0] = num1[0] - num2[0];
		resp[1] = num1[1] - num2[1];
			
		
		return (resp);
	} 
	
	
	double[] multiplica(double[] num1, double[]num2){
		double[] resp = new double[2];
		
		resp[0] = (num1[0]*num2[0]) + ((-1)*num1[1]*num2[1]);
		resp[1] = (num1[0]*num2[1]) + (num1[1]*num2[0]);
			
		
		return (resp);
	}
	
	
	double[] divide(double[] num1, double[]num2){
		double[] elemento3 = new double[2];//numerador
		double[] elemento4 = new double[2];//denominador
		double[] resp = new double[2]; // resposta final = numerador/denominador
		
		
		/*numerador*/
		elemento3[0] = (num1[0]*num2[0]) + (num1[1]*num2[1]);
		elemento3[1] = (num2[0]*num1[1]) - (num1[0]*num2[1]);
			
		/*denominador*/
		elemento4[0] = (num2[0]*num2[0]) + (num2[1]*num2[1]);
		elemento4[1] = (num2[0]*num2[1]) + (num2[1]*num2[0]);
		
		/*resposta*/
		resp[0] = elemento3[0]/elemento4[0];
		resp[1] = elemento3[1]/elemento4[0];
		
		return (resp);
	}
	
	
	double[] conjugado(double[] num1){
		
		double[] resp = new double[2];
		
		resp[0] = (num1[0]);
		resp[1] = ((-1)*num1[1]);
	
		return (resp);
	}
	
	
	double modulo(double[] num1){
		
		double[] elemento3 = new double[2];
		double soma;
		
		elemento3[0] = (Math.pow(num1[0],2));
		elemento3[1] = (Math.pow(num1[1],2));
		soma = elemento3[0] + elemento3[1];
		
		return (Math.sqrt(soma));
	}
} 

class L6_7{
	public static void main(String[] args){
		
		double[] n1 = {1,2}; 
		double[] n2 = {1,-2}; 
		
		Complexo comp = new Complexo();
		
		double[] resp = comp.soma(n1, n2);
		System.out.println("soma: "+resp[0]+" + "+resp[1]+"i");
		
		double[] resp1 = comp.sub(n1, n2);
		System.out.println("sub: "+resp1[0]+" + "+resp1[1]+"i");
		
		double[] resp2 = comp.multiplica(n1, n2);
		System.out.println("multi: "+resp2[0]+" + "+resp2[1]+"i");
		
		double[] resp3 = comp.divide(n1, n2);
		System.out.println("divide: "+resp3[0]+" + "+resp3[1]+"i");
		
		double[] resp4 = comp.conjugado(n1);
		System.out.println("conjugado: "+resp4[0]+" + ("+resp4[1]+")i");
		
		double[] resp5 = comp.conjugado(n2);
		System.out.println("conjugado: "+resp5[0]+" + ("+resp5[1]+")i");
		
		System.out.println("modulo: "+comp.modulo(n1));
		System.out.println("modulo: "+comp.modulo(n2));
		
		
	}
}
