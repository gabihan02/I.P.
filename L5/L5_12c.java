// (c) A campea de vendas em um unico mes

class L5_12c{
	
	/* FILIAL */
	static final int AQUI = 0;
	static final int LA = 1;
	static final int ACOLA = 2;
	static final int POR = 3; // POR AI
	
	/* MESES */
	static final int JAN = 0;
	static final int FEV = 1;
	static final int MAR = 2;
	static final int ABR = 3;
	static final int MAI = 4;
	static final int JUN = 5;
	static final int JUL = 6;
	static final int AGO = 7;
	static final int SET = 8;
	static final int OUT = 9;
	static final int NOV = 10;
	static final int DEZ = 11;
	
	/* PRECOS */
	static double[] pAQUI = {20000, 35000, 2000.20, 20832, 10500, 12000};
	static double[] pLA = {15453, 53000, 42000, 135832, 18580.35, 85200};
	static double[] pACOLA = {14320, 55800, 12356, 2563, 100000, 62325};
	static double[] pPOR = {12345, 44823, 15863.25, 56483.55, 93000, 4852.33};
	
	public static void main(String[] args){
		
		double[][] vendas = {{20000.00, 35000.00, 2000.20, 20832.00, 10500.00, 12000.00},
							{15453.00, 5300.00, 42000.00, 135832.00, 18580.36, 85200.00},
							{14320.00, 55800.00, 12356.00, 2563.00, 100000.00, 62325.00},
							{12345.00, 44823.00, 15863.25, 56483.55, 93000.00, 4852.33}};
		
		int[] posicao = Campea(vendas);
		System.out.print("A campea de vendas e um unico mes e, respectivamente em filial e mes e = ");
			for(int i = 0; i <posicao.length; i++){
				System.out.print(posicao[i] + " ");
			}
				System.out.println();	
		}
	
	
	static int[] Campea(double[][] num){
		int[] posicao = new int[2];
	
		for (int i=0; i<num.length; i++){ // linha
			for (int j=0; j<num.length; j++) // coluna
				if (num[posicao[0]][posicao[1]] < num[i][j]){
				posicao[0] = i;
				posicao[1] = j;
				}
		}
		return(posicao); 
	}	
	
	

	
}