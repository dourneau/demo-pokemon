package formation;

public class Pokemon {
	
	private String nom;
	private int hp;
	private int atk;
	
	public Pokemon( ) {}

	public Pokemon(String nom, int hp, int atk) {
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
	}
	
	public boolean isDead() {
		boolean etat = false;
		if (this.hp == 0) {
			etat = true;
		}
		return etat;
	}
	
}
	
	


