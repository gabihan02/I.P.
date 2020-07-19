package especificadores2;
import especificadores1.Alpha;

public class AlphaSub2 extends especificadores1.Alpha{
	public static void main(String[]args) {
		Alpha.alphaPublic();
		Alpha.alphaProtected();
		// Alpha.alphaNada();
		// Alpha.alphaPrivate();
	}
}

/**
	(d) E essa, vai rodar? Por que?
	
	nn porque "nada" é friendly só com os clases, contrutores, 
	atributor ou métodos que pertencem ao mesmo pacote.
	
	e private só "funciona" com os elementos de dentro da
	mesma classe

*/