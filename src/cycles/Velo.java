package cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private	Random genAlea; 
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {		
		DEFAUT_BRAQUET=dEFAUT_BRAQUET;
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet=braquet;
		this.diamRoue=diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet=braquet;
		diamRoue=40.0;
	}
	
	public Velo() {
		braquet=DEFAUT_BRAQUET;
		diamRoue=40.0;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea=genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet=braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue=diamRoue;
	}
	
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue +"]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue *genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Velo v1 = new Velo();
		System.out.println(v1);
		setDEFAUT_BRAQUET(14.0);
		System.out.println("braquet par defaut : " + DEFAUT_BRAQUET);
		Velo v2 = new Velo();
		System.out.println(v2);
		Velo v3 = new Velo(10.0);
		System.out.println(v3);
		v3.setBraquet(15.0);
		System.out.println("braquet : " + v3.getBraquet());
		System.out.println(v3);
		Velo v4 = new Velo(14.0,44.0);
		System.out.println(v4);
		v4.setDiamRoue(45.0);
		System.out.println("diamètre de la roue : " + v4.getDiamRoue());
		System.out.println(v4);
	}
}