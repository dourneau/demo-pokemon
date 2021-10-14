package formation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon p1 = new Pokemon("Leuphorie",200,50);
		Pokemon p2 = new Pokemon("Leveinard",200,60);
		System.out.println(p1);
		System.out.println(p2);
		p2.attaquer(p1);
		System.out.println(p1);

	}

}
