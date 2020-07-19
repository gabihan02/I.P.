package L11_1;

public class Quadrado implements Figura2D{
	
	String cor;
	
	public double calculaArea(){
		return System.out.println("calculaArea Quadrado");
	}
	
	public double calculaPerimetro(){
		return System.out.println("calculaPerimetro Quadrado");
	}
	
	public void mudaCor(String cor){
		this.cor = cor;
		System.out.println("cor Quadrado"+cor);
	}
	
	public String pegaCor(){
		return System.out.println("pega cor Quadrado");
	}
}