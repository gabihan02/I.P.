class L3_1{
	public static void main(String[] args){
		
		/*a*/
		int soma = 33;
		int cont = 1;
		while (cont < 12) {
			soma = soma + cont;
			cont = cont + 2;
		}
			System.out.println("Os n´umeros s~ao: "+cont+" e "+soma);
		
		
		/*b*/
		int num = 0;
		while (num <= 5) {
			num = num + 1;
			System.out.println(num);
		}

		
		/*c*/
		int dest1 = 15;
		int dest2 = 27;
		int local1 = 20;
		int local2 = 20;
		boolean chegou1 = false;
		boolean chegou2 = false;

		while ((!chegou1) && (!chegou2)) {
			local1 = local1 - 1; /*se move uma unidade por instante*/
			local2 = local2 + 2; /*se move 2 X mais r´apido*/
			chegou1 = (local1 <= dest1);
			chegou2 = (local2 >= dest2);
			System.out.println("Os viajantes est~ao em "+local1+" e "+local2);
		}
		System.out.println("As posicoes finais dos viajantes sao "+local1+" e "+local2);

	
	
	}


}