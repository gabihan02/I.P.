class Ponto{ 
	double x,y;
	
	public void limpa(){
		this.x = 0; this.y = 0; 
	}
}

class Pixel extends Ponto { 
	Color cor;
}

//Qual a diferenc¸a entre elas, em termos do que elas fazem?
// class Ponto é uma classe mãe da classe Pixel. A classe Pixel 
// herda tudo que Ponto possui.