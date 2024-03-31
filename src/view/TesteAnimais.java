package view;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class TesteAnimais {

	public static void main(String[] args) {
		//Atributos padrões não serão alterados
		Animal c = new Animal();
		c.alteraNome("Camelo");
		c.alteraComprimento(150);
		c.alteraCor("Amarelo");
		c.alteraAmbiente("Terra");
		c.alteraVelocidade(2);
		
		Peixe p = new Peixe();
		p.alteraNome("Tubarão");
		p.alteraComprimento(300);
		p.alteraVelocidade(1.5f);
		p.alteraCaracteristica("Barbatanas e cauda.");
		
		Mamifero m = new Mamifero();
		m.alteraNome("Urso-do-canadá");
		m.alteraComprimento(180);
		m.alteraCor("Vermelho");
		m.alteraVelocidade(0.5f);
		m.alteraAlimento("Mel");
		
		System.out.println("Zoo:");
		System.out.println("\n------------------------------\n");
		c.dados();
		System.out.println("\n------------------------------\n");
		p.dados();
		System.out.println("\n------------------------------\n");
		m.dados();
		
	}

}
