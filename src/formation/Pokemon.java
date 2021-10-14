package formation;

public class Pokemon {
	
	private String nom;
	private int hp;
	private int atk;
	private Pokemon p;
	
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
	
	
	public int attaquer(Pokemon p) {
		p.hp -= this.atk;
		return p.hp;
	}

	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", hp=" + hp + ", atk=" + atk + ", Pokemon attaqué=" + p + "]";
	}


	
	
	
}
	
	


