package model;

public class Animal {
	
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private float velocidade;

	public Animal() {
		super();
		this.patas = 4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void alteraNome(String nome) {
		setNome(nome);
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public void alteraComprimento(int comprimento) {
		setComprimento(comprimento);
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public void alteraPatas(int patas) {
		setPatas(patas);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void alteraCor(String cor) {
		setCor(cor);
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public void alteraAmbiente(String ambiente) {
		setAmbiente(ambiente);
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public void alteraVelocidade(float velocidade) {
		setVelocidade(velocidade);
	}
	
	public void dados() {
		System.out.printf("Animal: %s\nComprimento: %d cm\nPatas: %d\nCor: %s\nAmbiente: %s\nVelocidade: %.1f m/s\n",getNome(), getComprimento(), getPatas(), getCor(), getAmbiente(), getVelocidade());
	}

}
