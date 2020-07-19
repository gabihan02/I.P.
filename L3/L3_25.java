class L3_25{
	public static void main(String[] args){
		tabuada(6);
	}	
		
	static void tabuada (int n){
		
		for (int i=1; i <= n; i++){
			for(int j=1; j <= n; j++){
				System.out.print(i*j + "\t");
			}
			System.out.println();
			
		}
		
	}
}