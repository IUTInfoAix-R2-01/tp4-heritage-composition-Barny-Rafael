package cycles;

public class VeloElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double facteurPuissance) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur=facteurPuissance;
	}
	
	public VeloElec(double diamRoue, double facteurPuissance) {
		super(diamRoue);
		this.facteurPuissanceMoteur=facteurPuissance;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur=DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR=dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double facteurMoteurPuissance) {
		this.facteurPuissanceMoteur=facteurMoteurPuissance;
	}
	
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec vE1 = new VeloElec();
		System.out.println(vE1);
		System.out.println("braquet : " + vE1.getBraquet());
		System.out.println("diamètre de la roue : " + vE1.getDiamRoue());
		System.out.println("facteur puissance du moteur : " + vE1.getFacteurPuissanceMoteur());
		VeloElec vE2 = new VeloElec(40.0, 12.15);
		System.out.println(vE2);
	}
}
