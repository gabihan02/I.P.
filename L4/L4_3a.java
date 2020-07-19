class L4_3a{
// soma de número complexo
	
	public static void main(String[] args){
		float[] elementos1 = {5,2};
		float[] elementos2 = {1,2};
		float[] elemento3;
		
		elemento3 = soma(elementos1, elementos2);
		
		System.out.println("resposta:" + elemento3[0]+ "+" +elemento3[1]+ "i");
	
	}
	
	
	
	static float[] soma(float[] num1, float[]num2){
		
		float[] elemento3 = new float[2];
		
		elemento3[0] = num1[0] + num2[0];
		elemento3[1] = num1[1] + num2[1];
			
		
		return (elemento3);
	} 
		
}
 