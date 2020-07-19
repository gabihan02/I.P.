//done
class ConversorMonetario{
	
	double dolar;
	double TC;
	double TV;
	
	void defineTaxaCompra(double TC){
		this.TC = TC;
	}
	

	void defineTaxaVenda(double TV){
		this.TV = TV;
	}
	
	
	void imprimeTaxas(){
		System.out.println("Taxa de compra: "+TC);
		System.out.println("Taxa de venda: "+TV); 
	}
	
	
	double vendeDolar(){
		
		double VD = dolar*TV;
		return (VD);
	}
	
	
	double compraDolar(){
		
		double CD = dolar*TC;
		return (CD);	
	}

}


class TestaConversorMonetario{
	public static void main(String[] args){
	
		ConversorMonetario CM = new ConversorMonetario();
		
		CM.dolar = 10;
		CM.TC = 0.011;
		CM.TV = 0.022;
		CM.imprimeTaxas();
		System.out.println("Vende Dolar: "+CM.vendeDolar());
		System.out.println("Compra Dolar: "+CM.compraDolar());
		
		
	}
}






























