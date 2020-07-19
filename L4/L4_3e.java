class L4_3e{
// retornar conjugado
 	
	public static void main(String[] args){
		float[] elementos1 = {1,2};
		float[] elemento3;
		
		elemento3 = conjugado(elementos1) ;
		
		System.out.print("resposta: "+elemento3[0]+"+("+elemento3[1]+")i");
	
	}
	
	
	
	static float[] conjugado(float[] num1){
		
		float[] elemento3 = new float[2];
		
		elemento3[0] = (num1[0]);
		elemento3[1] = ((-1)*num1[1]);
	
		return (elemento3);
	}
		
		
}
 