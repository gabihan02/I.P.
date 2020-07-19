//done
class L8_2{
 	public static void main(String[] args){
			
	String[] v = {"ai", "capotei", "bem", "feio"};
		
	
		Bolha(v);
		for(int i = 0; i < v.length; i++){
			System.out.print(v[i]);
		}
		System.out.println();
	
	}
	
	
	static void Bolha(String[] v){
				
		for(int ult = v.length-1; ult>0; ult--){
			for(int i = 0; i<ult; i++){
				String a = v[i];
				String b = v[i+1];
					if(a.compareTo(b) > 0){
						String aux = v[i];
						v[i] = v[i+1];
						v[i+1] = aux;
					}
				
			}	
		}	
		
	}
	
	

}