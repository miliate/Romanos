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
		} else if (checkIsIsInteger(this.numeroInteiro) == false) {

			// System.out.print("jentrousidusd");
			throw new RuntimeException("O numero nao pode ser nulo");
		}

		else {

			conversor();
		}

	}

	public void conversor() {
		String roman = "";
		int numeroInteiroASerConvertido = Integer.parseInt(this.numeroInteiro);

		if (numeroInteiroASerConvertido < 4000) {
			while (numeroInteiroASerConvertido >= 1000) {
				roman += "M";
				numeroInteiroASerConvertido -= 1000;
			}

			while (numeroInteiroASerConvertido >= 900) {
				roman += "CM";
				numeroInteiroASerConvertido -= 900;
			}

			while (numeroInteiroASerConvertido >= 500) {
				roman += "D";
				numeroInteiroASerConvertido -= 500;
			}

			while (numeroInteiroASerConvertido >= 400) {
				roman += "CD";
				numeroInteiroASerConvertido -= 400;
			}

			while (numeroInteiroASerConvertido >= 100) {
				roman += "C";
				numeroInteiroASerConvertido -= 100;
			}

			while (numeroInteiroASerConvertido >= 90) {
				roman += "XC";
				numeroInteiroASerConvertido -= 90;
			}

			while (numeroInteiroASerConvertido >= 50) {
				roman += "L";
				numeroInteiroASerConvertido -= 50;
			}

			while (numeroInteiroASerConvertido >= 40) {
				roman += "XL";
				numeroInteiroASerConvertido -= 40;
			}

			while (numeroInteiroASerConvertido >= 10) {
				roman += "X";
				numeroInteiroASerConvertido -= 10;
			}

			while (numeroInteiroASerConvertido >= 9) {
				roman += "IX";
				numeroInteiroASerConvertido -= 9;
			}

			while (numeroInteiroASerConvertido >= 5) {
				roman += "V";
				numeroInteiroASerConvertido -= 5;
			}

			while (numeroInteiroASerConvertido >= 4) {
				roman += "IV";
				numeroInteiroASerConvertido -= 4;
			}

			while (numeroInteiroASerConvertido >= 1) {
				roman += "I";
				numeroInteiroASerConvertido -= 1;
			}
			this.numeroRomano = roman;
		}

	};

}
