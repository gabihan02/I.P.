package especificadores1;

public class AlphaSub1 extends Alpha{

	public static void main(String[]args){
		Alpha.alphaPublic();
		Alpha.alphaProtected();
		Alpha.alphaNada();
		// Alpha.alphaPrivate();
	}
	
}

/*
	(b) A seguinte subclasse ira rodar? Por que?
	
		A seguinte nn ira rodar porque Alpha.alphaPrivate();
*/