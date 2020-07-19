class L5_7{
	public static void  main(String[] args){
		int[][] matriz ={{1,2,3},
						 {5,4,2},
						 {2,6,1}};

	
		System.out.println(determinante(matriz));
	}

	
	static int determinante(int[][] num){
		
		int a = num[0][0] * num[1][1] * num[2][2];
		int b = num[0][1] * num[1][2] * num[2][0];
		int c = num[0][2] * num[1][0] * num[2][1];
		int d = num[0][2] * num[1][1] * num[2][0];
		int e = num[0][0] * num[1][2] * num[2][1];
		int f = num[0][1] * num[1][0] * num[2][2];
		
		int resultado = a + b + c - d - e - f;
		
		return (resultado);
		
	}

}