// done
class FigurasEfericas{
	double raio;
	
	double area(){
		double Area = Math.PI*Math.pow(raio,2);
		return (Area);
		
	}
	
	double volume(){
		double vol = (4*Math.PI*Math.pow(raio,3))/3;
		return (vol);
	}

}

class L6_6{
	public static void main(String[] args){
		
		FigurasEfericas fg = new FigurasEfericas();
		
		fg.raio = 3;
		System.out.println(fg.area());
		System.out.println(fg.volume());
		
		System.out.println();
		
		fg.raio = 2;
		System.out.println(fg.area());
		System.out.println(fg.volume());
	}
}