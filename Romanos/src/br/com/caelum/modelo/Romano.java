package br.com.caelum.modelo;

public class Romano {

	private int numeroInteiro;
private String numeroRomano;

	public int getNumeroInteiro() {
		return numeroInteiro;
	}

	public void setNumeroInteiro(int numeroInteiro) {
		this.numeroInteiro = numeroInteiro;
	}

	public String getNumeroRomano() {
		return numeroRomano;
	}
	
	public void converteInteiroEmRomano()  {
		// TODO Auto-generated method stub
		
		
		if(this.numeroInteiro==0)
			
			throw new RuntimeException("O numero nao pode ser nulo");
			
		if(this.numeroInteiro==1) 
			this.numeroRomano="I";
/*		switch(this.numeroInteiro){
		case 1: return "I";
		case 2: return "II";
		case 3: return "III";
		case 4: return "IV";
		case 5: return "V";*/
		
		

	}



	
}
