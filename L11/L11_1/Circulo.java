package L11_1;

public class Circulo implements Figura2D{
	String cor;
	
	public double calculaArea(){
		System.out.println("calculaArea Circulo");
	}
	
	public double calculaPerimetro(){
		System.out.println("calculaPerimetro Circulo");
	}
	
	public void MudaCor(String cor){
		this.cor = cor;
		System.out.println("cor Circulo"+cor);
	}
	
	public String pegaCor(){
		System.out.println("pega cor Circulo");
	}
}