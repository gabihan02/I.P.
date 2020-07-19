class L2_8{
	public static void main(String[] args){
		int num /*maior data*/ = datam(22,05,74,22,03,74);
		System.out.println("A data cronologicamente maior de duas datas e = "+num);
	}
	
	static int datam(int d1, int m1, int a1, int d2, int m2, int a2){ /*
	d1m1a1(dia, mes e ano 1); d2m2a2(dia, mes e ano 2)*/
		
		String maior1 = "" + d1+m1+a1;/*maior data*/
		String maior2 = "" + d2+m2+a2;/*maior data*/
		int ma1 = Integer.parseInt (maior1);
		int ma2 = Integer.parseInt (maior2);
		
		if (a1<a2) return (ma1);
		if (a2<a1) return (ma2);
		
		if (a1==a2 && m1>m2) return (ma1);
		if (a1==a2 && m1<m2) return (ma2);
		
		
		if (a1==a2 && m1==m2 && d1>d2) return (ma1);
		if (a1==a2 && m1==m2 && d1<d2) return (ma2);
		
		if (a1==a2 && m1==m2 && d1==d2) return (ma1);
		else {
			return -1;
		}
	}
}