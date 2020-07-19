package L11_1;

public class Retangulo implements Figura2D{
	String cor;

	public double calculaArea(){
		System.out.println("calculaArea Retangulo");
	}
	
	public double calculaPerimetro(){
		System.out.println("calculaPerimetro Retangulo");
	}
	
	public void mudaCor(String cor){
		this.cor = cor;
		System.out.println("cor Retangulo"+cor);
	}
	
	public String pegaCor(){
		System.out.println("pega cor Retangulo");
	}
}