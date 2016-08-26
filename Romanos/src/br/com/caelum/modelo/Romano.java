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
		String numeroConvertidoEmRomano = "";
		int numeroInteiroASerConvertido = Integer.parseInt(this.numeroInteiro);

		if (numeroInteiroASerConvertido < 4000) {
			while (numeroInteiroASerConvertido >= 1000) {
				numeroConvertidoEmRomano += "M";
				numeroInteiroASerConvertido -= 1000;
			}

			while (numeroInteiroASerConvertido >= 900) {
				numeroConvertidoEmRomano += "CM";
				numeroInteiroASerConvertido -= 900;
			}

			while (numeroInteiroASerConvertido >= 500) {
				numeroConvertidoEmRomano += "D";
				numeroInteiroASerConvertido -= 500;
			}

			while (numeroInteiroASerConvertido >= 400) {
				numeroConvertidoEmRomano += "CD";
				numeroInteiroASerConvertido -= 400;
			}

			while (numeroInteiroASerConvertido >= 100) {
				numeroConvertidoEmRomano += "C";
				numeroInteiroASerConvertido -= 100;
			}

			while (numeroInteiroASerConvertido >= 90) {
				numeroConvertidoEmRomano += "XC";
				numeroInteiroASerConvertido -= 90;
			}

			while (numeroInteiroASerConvertido >= 50) {
				numeroConvertidoEmRomano += "L";
				numeroInteiroASerConvertido -= 50;
			}

			while (numeroInteiroASerConvertido >= 40) {
				numeroConvertidoEmRomano += "XL";
				numeroInteiroASerConvertido -= 40;
			}

			while (numeroInteiroASerConvertido >= 10) {
				numeroConvertidoEmRomano += "X";
				numeroInteiroASerConvertido -= 10;
			}

			while (numeroInteiroASerConvertido >= 9) {
				numeroConvertidoEmRomano += "IX";
				numeroInteiroASerConvertido -= 9;
			}

			while (numeroInteiroASerConvertido >= 5) {
				numeroConvertidoEmRomano += "V";
				numeroInteiroASerConvertido -= 5;
			}

			while (numeroInteiroASerConvertido >= 4) {
				numeroConvertidoEmRomano += "IV";
				numeroInteiroASerConvertido -= 4;
			}

			while (numeroInteiroASerConvertido >= 1) {
				numeroConvertidoEmRomano += "I";
				numeroInteiroASerConvertido -= 1;
			}
			this.numeroRomano = numeroConvertidoEmRomano;
		}

	};

}
