package zadatak1;

public class KoncertnaDvorana {
	public final static int KAPACITET = 50;
	private boolean[] sedista = new boolean[KAPACITET];

	public KoncertnaDvorana() {
		super();
		for (int i = 0; i < sedista.length; i++) {
			sedista[i] = true;
		}
	}

	public void noviGledalac(int brojSedista) {
		if (sedista[brojSedista] == true && brojSedista > 0 && brojSedista <= this.sedista.length) {
			sedista[brojSedista] = false;
			System.out.println("Uveden je novi gledalac na mesto " + brojSedista);
		} else
			System.out.println("Mesto je zauzeto ili ste uneli broj mesta van granica!");
	}

	public boolean dovoljnaPopunjenost() {
		int i = 0, prviDeo = 0, drugiDeo = 0, ukupno = 0;
		for ( i = 0; i < sedista.length / 2 ; i++) {
			if (this.sedista[i] == false) {
				prviDeo++;
				ukupno++;

			}
		}
		for (int j = i; j < sedista.length; j++) {
			if (this.sedista[i] == false) {
				drugiDeo++;
				ukupno++;
			}
		}
		if (prviDeo > 0.5*(this.sedista.length)
				&& drugiDeo > 0.4*(this.sedista.length) 
				&& ukupno > 0.55*(this.sedista.length)) {
			return true;
		}
		return false;
	}
	
	public void slobodnaMesta() {
		int red = 10, slobodna = 0;
		
		for (int i = 0; i < sedista.length/10; i++) {
			for (int j = 0; j < red; j++) {
				if (this.sedista[i*10 + j] == true) {
					slobodna ++;
				}
			}
			System.out.println("Broj slobodnih mesta u " + i + ". redu je :" + slobodna);
			slobodna = 0;
		}
	}

}
