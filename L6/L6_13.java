// done
class IntervaloDeTempo{
	
	int horas;
	int min;
	int seg;
	
	
	IntervaloDeTempo(int tempo){
		
		if (tempo >= 3600){
			horas = tempo/3600;
			int resth = 0;
			resth = (tempo-(3600*horas));
				if (resth >= 60 && resth < 3600){
					min = resth/60;
					int restmin = 0;
					restmin = (resth-(60*min));
					if (restmin < 60 && restmin >= 0){
						seg = restmin;
					}
				}
		}
		
		if (tempo < 3600 && tempo >= 60){
			min = tempo/60;
			int restmin = 0;
			restmin = (tempo-(60*min));
				if (restmin < 60 && restmin >= 0){
					seg = restmin;
				}	
		}
		
		
		if (tempo < 60 && tempo >= 0) seg = tempo;
	
		System.out.printf("Horas: %d\nMinutos: %d\nSegundos: %d\n",horas, min, seg);
		
	}
	
	
}



class L6_13{
	public static void main(String[] args){
	
		IntervaloDeTempo temp = new IntervaloDeTempo(50);
		System.out.println();
		IntervaloDeTempo temp2 = new IntervaloDeTempo(456780);
		System.out.println();
		IntervaloDeTempo temp3 = new IntervaloDeTempo(3267);
	
	}


}








