package domaci9;

public class Pismo {

	private String posiljalac;
	private String primalac;
	private int postanski;
	private double tezinaGr;
	private boolean prioritetno;

	public void pismo(String posilj, String prim, int pBr, double t, boolean pri) {
		posiljalac = posilj;
		primalac = prim;
		postanski = pBr;
		tezinaGr = t;
		prioritetno = pri;

	}

	public static double cena(double tezinaGr, boolean prioritetno) {
		double cena = 0;
		if (tezinaGr <= 20) {
			if (prioritetno == true)
				cena = 23 + 46;
			else
				cena = 23;
		} else if (21 <= tezinaGr && tezinaGr < 100) {
			if (prioritetno == true)
				cena = 35 + 46;
			else
				cena = 35;
		} else if (100 <= tezinaGr && tezinaGr < 250) {
			if (prioritetno == true)
				cena = 46 + 46;
			else
				cena = 46;
		} else if (250 <= tezinaGr && tezinaGr < 500) {
			if (prioritetno == true)
				cena = 81 + 46;
			else
				cena = 81;
		} else if (500 <= tezinaGr && tezinaGr < 1000) {
			if (prioritetno == true)
				cena = 92 + 46;
			else
				cena = 92;
		} else if (1000 <= tezinaGr && tezinaGr < 2000) {
			if (prioritetno == true)
				cena = 127 + 46;
			else
				cena = 127;
		} else if (tezinaGr >= 2000) {
			if (prioritetno == true)
				cena = 250 + 46;
			else
				cena = 250;
		}
		return cena;
	}

	public String getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(String posiljalac) {
		this.posiljalac = posiljalac;
	}

	public String getPrimalac() {
		return primalac;
	}

	public void setPrimalac(String primalac) {
		this.primalac = primalac;
	}

	public int getPostanski() {
		return postanski;
	}

	public void setPostanski(int postanski) {
		this.postanski = postanski;
	}

	public double getTezinaGr() {
		return tezinaGr;
	}

	public void setTezinaGr(double tezinaGr) {
		this.tezinaGr = tezinaGr;
	}

	public boolean isPrioritetno() {
		return prioritetno;
	}

	public void setPrioritetno(boolean prioritetno) {
		this.prioritetno = prioritetno;
	}

	public String toString() {
		String ispis = posiljalac + "-> " + primalac + ":" + postanski + "," + tezinaGr + "g" + "=> "
				+ cena(tezinaGr, prioritetno) + "din.";
		return ispis;
	}

}
