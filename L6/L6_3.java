// done

class Simples{

	int inicializaArranjo (int[] a, int v){
		int cont = 0;
		for(int i = 0; i < a.length; i++){
			a[i] = v;
			cont += 1;
		} 
		return (cont);	 
	}
	
	void imprimeArranjo (int[] a){
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();	
	}
	
	boolean estaNoArranjo (int[] a, int v){	
		
		for (int i = 0; i < a.length; i++){
			if (a[i] == v) return true;
		}
		return false;
	}
}

public class L6_3{
	public static void main(String[] args){
		
		int[] array = {0,2,4,76,18,143,145};
		int num = 10;
		
		Simples s1 = new Simples();
		
		s1.estaNoArranjo(array, num);
		System.out.println(s1.estaNoArranjo(array, num));
		
		s1.inicializaArranjo(array, num);
		System.out.println(s1.inicializaArranjo(array, num));
		
		s1.imprimeArranjo(array);
		
	}
	
}