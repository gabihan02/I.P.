class L4_8{
	public static void main(String[] args){
		int[] n={1,2,3};
		int[] m={4,5,6};
		int[] vc = elementos(n,m);
		
		for(int i = 0; i < vc.length; i++){
			System.out.print(vc[i]);
		}
		
		System.out.println();
	}

	static int[] elementos(int[] va, int[] vb){
		
		int pos = 0;		
		int[] vc = new int[va.length + vb.length];
		
		for (int i = 0; i < va.length; i++){
			vc[i] = va[i];
			pos += 1;	
		}
		
		int semi = pos;
		
		
		for (int i = 0; i < vb.length; i++){
			vc[semi] = vb[i];
			semi += 1;
			
		}

		return(vc);
		
	}




}