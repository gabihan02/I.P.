package L11_1;

public class teste{
	public static void main(String[] args){
		
		Figura2D q = new Quadrado();
		Figura2D r = new Retangulo();
		Figura2D c = new Circulo();
		
		q.calculaArea();
		r.calculaArea();
		c.calculaArea();
		
		q.calculaPerimetro();
		r.calculaPerimetro();
		c.calculaPerimetro();
		
		q.mudaCor("azul");
		r.mudaCor("preto");
		c.mudaCor("rosa");
		
		q.pegaCor();
		r.pegaCor();
		c.pegaCor();
	}
	
}