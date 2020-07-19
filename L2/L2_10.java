
class L2_10{ 
	public static void main(String[] args){
		int classi = velocidade(120);
		
		System.out.println("A classificacao da tempestade e = "+classi);
	}

	static int velocidade (double velo){
		
		if (velo >= 62 && velo <= 118) return (0);
		if (velo >= 119 && velo <= 153) return (1);
		if (velo >= 154 && velo <= 177) return (2);
		if (velo >= 178 && velo <= 209) return (3);
		if (velo >= 210 && velo <= 249) return (4);
		if (velo > 249)return (5);
		
		return (-1);	
	}

}
