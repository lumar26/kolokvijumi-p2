package autobuska_stanica.rezervacije;

import java.util.GregorianCalendar;

public interface RezervacijaKarata {
	public boolean rezervisiKartu(String destinacija, GregorianCalendar vreme);
	public void proslediRezervaciju(RezervacijaKarata[] drugeStanice, String destinacija, int brKarata);
}
