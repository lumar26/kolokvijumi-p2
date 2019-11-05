package autobuska_stanica;

import java.util.GregorianCalendar;

import autobuska_stanica.rezervacije.RezervacijaKarata;

public class AutobuskaStanica implements RezervacijaKarata {

	public AutobuskaStanica(AutobuskaStanica as) {
		super();
		this.polasci = as.polasci;
	}

	public AutobuskaStanica() {
		super();
	}

	Polazak[] polasci = new Polazak[100];

	public void unesiPolazak(Polazak noviPolazak) {
		if (noviPolazak != null) {
			int i = 0;
			while (polasci[i] != null) {
				i++;
			}
			if (i != 99) {
				// ovde da se vidi samo da li treba preko setera i getera
				// ali ne bi trebalo jer se dodeljuju pokazivaci
				polasci[i] = noviPolazak;
			} else
				System.out.println("Nema vise slobodnih mesta");
		} else
			System.out.println("Uneli ste lose informacije o polasku");
	}
	
	public void izlistajPolaske() {
		for (int i = 0; i < polasci.length; i++) {
			if (polasci[i] == null) break;
			System.out.println(polasci[i].toString());
		}
	}

	@Override
	public boolean rezervisiKartu(String destinacija, GregorianCalendar vreme) {
//		for (Polazak polazak : polasci) {
//			if (destinacija.equals(polazak.getDestinacija()) && polazak.getBrojSlobodnihMesta() > 0) {
//				polazak.setBrojSlobodnihMesta(polazak.getBrojSlobodnihMesta() - 1);
//				return true;
//			}
//		}
		for (int i = 0; i < polasci.length; i++) {
			if (destinacija.equals(polasci[i].getDestinacija()) && polasci[i].getBrojSlobodnihMesta() > 0) {
				polasci[i].setBrojSlobodnihMesta(polasci[i].getBrojSlobodnihMesta() - 1);
				return true;
			}
		}
		return false;
	}

	@Override
	public void proslediRezervaciju(RezervacijaKarata[] drugeStanice, String destinacija, int brKarata) {
		for (int i = 0; i < drugeStanice.length; i++) {
			GregorianCalendar vreme = new GregorianCalendar(2019, 11, 24);
			boolean status = rezervisiKartu(destinacija, vreme);
			if (status) {
				System.out.println("Karta je uspesno rezervisana");
				return;
			}
		}
		System.out.println("NEma slobodnih mesta za datu destinaciju ni na jednoj stanici");
	}

}
