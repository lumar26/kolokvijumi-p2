package zadatak1;

public class TestKoncertnaDvorana {
	public static void main(String[] args) {
		KoncertnaDvorana kd = new KoncertnaDvorana();
		
		kd.noviGledalac(21);
		kd.noviGledalac(23);
		kd.noviGledalac(27);
		kd.noviGledalac(33);
		kd.noviGledalac(34);
		
		if (kd.dovoljnaPopunjenost()) {
			System.out.println("Koncertna dvorana je dovoljno popunjena");
		} else System.out.println("Koncertna dvorana nije dovoljno popunjena");
		
		System.out.println();
		kd.slobodnaMesta();

	}
}
