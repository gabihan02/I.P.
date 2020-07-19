class L4_3d{
// divisão de número complexo
	public static void main(String[] args){
		float[] elementos1 = {2,2};
		float[] elementos2 = {1,2};
		float[] elemento3;
		float[] elemento4;
		float[] resp;
		
		elemento3 = divide(elementos1, elementos2);
		elemento4 = divide(elementos2, elementos2);
		resp = divide (elemento3, elemento4);
		
		System.out.print("resposta: "+resp[0]+"+("+resp[1]+")i");
	
	}
	
	static float[] divide(float[] num1, float[]num2){
		float[] elemento3 = new float[2];//numerador
		float[] elemento4 = new float[2];//denominador
		float[] resp = new float[2]; // resposta final = numerador/denominador
		
		
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
		
		
}
 