package br.com.caelum.modelo;

public class Romano {

	private String numeroInteiro;
	private String numeroRomano;

	public String getNumeroInteiro() {
		return numeroInteiro;
	}

	public void setNumeroInteiro(String numeroInteiro) {
		this.numeroInteiro = numeroInteiro;
	}

	public String getNumeroRomano() {
		return numeroRomano;
	}

	public boolean checkIsIsInteger(String x) {

		try {
			Integer.parseInt(x);
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	public void converteInteiroEmRomano() {
		// TODO Auto-generated method stub

		if (this.numeroInteiro == "0") {

			throw new RuntimeException("O numero nao pode ser nulo");
		} 
		else if (checkIsIsInteger( this.numeroInteiro)==false) {

			//System.out.print("jentrousidusd");
			throw new RuntimeException("O numero nao pode ser nulo");
		}

		else

		if (this.numeroInteiro == "1") {
			this.numeroRomano = "I";
		}

	}

}
