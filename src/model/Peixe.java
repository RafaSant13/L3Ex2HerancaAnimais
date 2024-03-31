package model;

public class Peixe extends Animal{
	
	private String caracteristica;

	public Peixe() {
		super();
		super.setPatas(0);
		super.setCor("Cinzento");
		super.setAmbiente("Mar");
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void alteraCaracteristica(String caracteristica) {
		setCaracteristica(caracteristica);
	}
	
	@Override
	public void dados() {
		System.out.printf("Animal: %s\nComprimento: %d cm\nPatas: %d\nCor: %s\nAmbiente: %s\nVelocidade: %.1f m/s\nCaracterística: %s\n",getNome(), getComprimento(), getPatas(), getCor(), getAmbiente(), getVelocidade(), getCaracteristica());
	}
}
