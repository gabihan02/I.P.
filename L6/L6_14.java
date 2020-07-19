//done
class Pessoa{

		String nome;
		String sexo;
		int NumeroIdentidade;
		int[] DataNascimento; //dia, mes, ano
		
		Pessoa(String nome, String sexo, int NumeroIdentidade, int[] DataNascimento){
			this.nome = nome;
			this.sexo = sexo;
			this.NumeroIdentidade = NumeroIdentidade;
			this.DataNascimento = DataNascimento;

		}
		
		int idade(int[] DataAtual){
			
			if (DataAtual[2] >= DataNascimento[2]){
				if(DataAtual[1] >= DataNascimento[1]){
					if(DataAtual[0] >= DataNascimento[0]) return (DataAtual[2] - DataNascimento[2]);
				}
				return (DataAtual[2] - DataNascimento[2]-1);
			}
			
			return (-1);
		}
	
	
}



class L6_14{
	public static void main(String[] args){
		
		int[] TodayDate = {22,05,2020};
		int[] ani1 = {22,05,2001};
		
		Pessoa person1 = new Pessoa("Jubs", "F", 345678, ani1);
		System.out.println("Idade: "+person1.idade(TodayDate));
		
	}
	
	
}

















