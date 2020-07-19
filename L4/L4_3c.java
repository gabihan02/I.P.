class L4_3c{
// multiplicação de número complexo
 	
	public static void main(String[] args){
		float[] elementos1 = {1,2};
		float[] elementos2 = {1,2};
		float[] resp;
		
		resp = multiplica(elementos1, elementos2);
       
        System.out.println("resposta: "+resp[0]+"+"+resp[1]+"i");
	
	}

	
	static float[] multiplica(float[] num1, float[]num2){
		float[] resp = new float[2];
		
		resp[0] = (num1[0]*num2[0]) + ((-1)*num1[1]*num2[1]);
		resp[1] = (num1[0]*num2[1]) + (num1[1]*num2[0]);
			
		
		return (resp);
		}
		
		
}
 