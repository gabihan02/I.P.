class L1_7
{
	public static void main(String[] args)
	{
	
	
	double So = 3;	/*posicao inicial*/
	double Vo = 0; /*velocidade inical*/
	double t = 1; /*tempo que o um objeto leva para ir da posicao inicial 
	S0 para a final S, a partir de uma velocidade inicial V0 a
	uma aceleracao constante a*/
	double a = 9.8; /*aceleracao constante*/
	double S = So + Vo*t + ((a*t*t)/2); /*poosicao final*/
	
	System.out.println (S);
	
	
	
	
	}
}