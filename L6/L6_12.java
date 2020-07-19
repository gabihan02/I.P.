//done
class MediaAlunoDisciplina{
	
	int NumeroAluno;
	static String Disciplina;
	static int PesoTrabalhos;
	static int PesoProvas = 10 - PesoTrabalhos;
	double MediaTrabalhos;
	double MediaProvas;
	double MediaPonderada;
	
	MediaAlunoDisciplina(int NumeroAluno, String Disciplina){
		this.NumeroAluno = NumeroAluno;
		this.Disciplina = Disciplina;
		this.PesoTrabalhos = 5;
		this.PesoProvas = 5;
		
	}
	

	double calculaMediaPonderada(){
		if ((PesoTrabalhos+PesoProvas) != 10)return (this.MediaPonderada = -1);
		double ponderada = ((MediaTrabalhos*PesoTrabalhos)+(MediaProvas*PesoProvas))/10;
		if (ponderada <= 10) return (this.MediaPonderada = ponderada);
		return -1;
	}
	
	
	void imprimeDados(){
		System.out.printf("Numero do Aluno: %s\nDisciplina: %s\nPeso do Trabalho: %s\nPeso das Provas: %s\nMedia dos Trabalhos: %s\nMedia das Provas: %s\nMedia Ponderada: %s\n", NumeroAluno, Disciplina, PesoTrabalhos, PesoProvas, MediaTrabalhos, MediaProvas, MediaPonderada);
	}

}

class L6_12{
	public static void main(String[] args){
		
		MediaAlunoDisciplina aluno1 = new MediaAlunoDisciplina(213245365, "Mat");
		System.out.println();
		System.out.println();
		MediaAlunoDisciplina aluno2 = new MediaAlunoDisciplina(132455, "Mat");
	
		
		aluno1.MediaTrabalhos = 7.6;
		aluno1.MediaProvas = 8;
		aluno1.MediaPonderada = 6;
		aluno1.calculaMediaPonderada();
		aluno1.imprimeDados();
		
		System.out.println();
		System.out.println();
		
	
		aluno2.MediaTrabalhos = 7.6;
		aluno2.MediaProvas = 10;
		aluno2.MediaPonderada = 2;
		aluno2.calculaMediaPonderada();
		aluno2.imprimeDados();
		
	}

}




















