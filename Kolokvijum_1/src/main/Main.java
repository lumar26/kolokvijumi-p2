package main;

import java.util.GregorianCalendar;

import autobuska_stanica.*;
import autobuska_stanica.rezervacije.*;

public class Main {

	public static void main(String[] args) {
		AutobuskaStanica bas = new AutobuskaStanica();
		RezervacijaKarata r = new AutobuskaStanica(bas);
		
		GregorianCalendar datum1 = new GregorianCalendar(2019, 9, 25);
		GregorianCalendar datum2 = new GregorianCalendar(2019, 10, 20);
		GregorianCalendar datum3 = new GregorianCalendar(2019, 11, 11);
		GregorianCalendar datum4 = new GregorianCalendar(2019, 12, 31);
		GregorianCalendar datum5 = new GregorianCalendar(2019, 12, 30);
		
		bas.unesiPolazak(new Polazak("Kopaonik", datum1));
		bas.unesiPolazak(new Polazak("Krezbinac", datum2));
		bas.unesiPolazak(new Polazak("Grza", datum3));
		bas.unesiPolazak(new Polazak("Zlatibor", datum4));
		bas.unesiPolazak(new Polazak("Zlatibor", datum5));
		
		
		r.rezervisiKartu("Zlatibor", datum4);
		r.rezervisiKartu("Zlatibor", datum5);
		r.rezervisiKartu("Krezbinac", datum2);
		r.rezervisiKartu("Kopaonik", datum1);
		
		bas.izlistajPolaske();
	}

}
