class L4_3b{
// subtração de número complexo
 	
	public static void main(String[] args){
		float[] elementos1 = {1,2};
		float[] elementos2 = {2,2};
		float[] resp;
		
		resp = sub(elementos1, elementos2);
		
		System.out.println("resposta: "+resp[0]+"+"+resp[1]+"i");
	
	}
	
	
	
	static float[] sub(float[] num1, float[]num2){
		float[] resp = new float[2];
		
		resp[0] = num1[0] - num2[0];
		resp[1] = num1[1] - num2[1];
			
		
		return (resp);
	} 
		
}
 