package model;

public class Mamifero extends Animal{
	
	private String alimento;

	public Mamifero() {
		super();
		super.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void alteraAlimento(String alimento) {
		setAlimento(alimento);
	}
	
	@Override
	public void dados() {
		System.out.printf("Animal: %s\nComprimento: %d cm\nPatas: %d\nCor: %s\nAmbiente: %s\nVelocidade: %.1f m/s\nAlimento: %s\n",getNome(), getComprimento(), getPatas(), getCor(), getAmbiente(), getVelocidade(), getAlimento());
	}

}
