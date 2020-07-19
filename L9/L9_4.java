class Substancia{ 
	private String nome; 
	private int tipo; // 1=simples 2=nobre 
	private double preco;
	public static int contador;
	final int cotacao = 3;
	
	public int Cont(){
		return contador++;
	}

	void setNome(String nome){
		this.nome = nome; 
	} 
	
	String getNome(){
		return nome; 
	} 
	
	void setTipo(int tipo){ 
		this.tipo = tipo; 
	} 
	
	int getTipo(){
		return tipo; 
	} 
	
	void setPreco(int preco){
		this.preco = preco; 
	} 
	
	double getPreco(){
		return preco; 
	}
	
	public void ShowAtributos(){
		System.out.println("Nome: "+nome);
		System.out.println("Tipo: "+tipo);
		System.out.println("Preco: "+preco);
		System.out.println("Contador: "+contador);
		System.out.println("Cotacao: "+cotacao);
	}
	
	
}

class Remedios{
	private String nome;
	private int quantidade;
	private double precoFinal;
	
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	String getNome(){
		return nome; 
	} 
	
	void setQuant(int quantidade){
		this.quantidade = quantidade;
	}
	
	int getQuant(){
		return quantidade;
	}
	
	void Valor(Substancia s1){
		precoFinal = s1.getTipo()*s1.getPreco()*quantidade;		
		
	}
		
	void Imprimir(){	
		System.out.println("Preco de uma unidade do remedio "+getNome()+" = "+precoFinal);
		
	}
	
}

class L9_4{
	public static void main(String[] args){
		
		Substancia s1 = new Substancia();		
		s1.setNome("heey!");
		s1.setTipo(2);
		s1.setPreco(5);
		s1.ShowAtributos();
		
		System.out.println();
		
		Remedios r1 = new Remedios();
		r1.setNome("Consegui?");
		r1.setQuant(2);
		r1.Valor(s1);
		r1.Imprimir();
	}	

}











