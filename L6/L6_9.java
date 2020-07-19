//done
class PlanoCartesiano{
	
	double x;
	double y;

	void ponto(){
		if (x==0 && y==0) System.out.print("centro");
		if (x>=0 && y>0 || x>0 &&y>00) System.out.print("Primeiro Quadrante");
		if (x<=0 && y>0 || x<0 && y>=0) System.out.print("Segundo Quadrante");
		if (x<=0 && y<0 || x<0 && y<=0) System.out.print("Terceiro Quadrante");
		if (x>=0 && y<0 || x>0 && y<=0) System.out.print("Quarto Quadrante");
	}



}





class L6_9{
	public static void main(String[] args){
		PlanoCartesiano pc = new PlanoCartesiano();
		
		pc.x = 0;
		pc.y = 0;
		System.out.println("O ponto esta no: ");
		pc.ponto();
		System.out.println();
		System.out.println();
		
		pc.x = 6;
		pc.y = 7;
		System.out.println("O ponto esta no: ");
		pc.ponto();
		System.out.println();
		System.out.println();
		
		pc.x = -6;
		pc.y = 8;
		System.out.println("O ponto esta no: ");
		pc.ponto();
		System.out.println();
		System.out.println();
		
		pc.x = -9;
		pc.y = -8;
		System.out.println("O ponto esta no: ");
		pc.ponto();
		System.out.println();
		System.out.println();
		
		pc.x = 6;
		pc.y = -8;
		System.out.println("O ponto esta no: ");
		pc.ponto();
		System.out.println();
		System.out.println();
	}
	
}




