public class Singleton{

	private static Singleton copia;
		

	public static Singleton copia(){
	
		if(copia != null) return copia;
		
		copia = new Singleton();
			return copia;
		}
}
