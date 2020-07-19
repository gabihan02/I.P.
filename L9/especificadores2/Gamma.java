package especificadores2;
import especificadores1.Alpha;

public class Gamma{
	public static void main(String[] args){
		Alpha.alphaPublic();
		//Alpha.alphaProtected();
		//Alpha.alphaNada();
		//Alpha.alphaPrivate();
	}


}

/**
	(e) E essa, vai rodar? Por que?
	
	nn porque Gamma nn é uma subclasse de Aplha... e 
	Alpha.alphaProtected() é protected. Só da para usar
	protected (em construtor, atributo ou metodo) se as classes
	estiverem no mesmo pacote ou as subcalsses(independentemente
	do pacote)
	
	e "nada" é friendly só com os clases, contrutores, 
	atributor ou métodos que pertencem ao mesmo pacote.
	
	e private só "funciona" com os elementos de dentro da
	mesma classe

*/