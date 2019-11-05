package autobuska_stanica;

import java.util.GregorianCalendar;

public class Polazak {
	private String destinacija;
	private GregorianCalendar vreme;
	private int brojSlobodnihMesta;
	
	
	public String getDestinacija() {
		return destinacija;
	}
	public void setDestinacija(String destinacija) {
		if (destinacija != null && !destinacija.equals("")) {
			this.destinacija = destinacija;
		}else System.out.println("ERROR");
		
	}
	@Override
	public String toString() {
		return "Destinacija: " + destinacija + ", vreme : " + vreme.getTime() + ", brojSlobodnihMesta: " + brojSlobodnihMesta
				+ "]";
	}
	
	//konstruktor
	public Polazak(String destinacija, GregorianCalendar vreme) {
		super();
		this.destinacija = destinacija;
		this.vreme = vreme;
		this.brojSlobodnihMesta = 100;
	}
	
	//geteri i seteri
	public GregorianCalendar getVreme() {
		return vreme;
	}
	public void setVreme(GregorianCalendar vreme) {
		if (vreme.after(new GregorianCalendar())) {
			this.vreme = vreme;
		}else System.out.println("ERROR");
		
	}
	public int getBrojSlobodnihMesta() {
		return brojSlobodnihMesta;
	}
	public void setBrojSlobodnihMesta(int brojSlobodnihMesta) {
		if (brojSlobodnihMesta >= 0) {
			this.brojSlobodnihMesta = brojSlobodnihMesta;
		}else System.out.println("ERROR");
		
	}
}
