package items;

import system.Roll;

public class LifePotion {

	private int heal;
	private Roll d6;
	
	public LifePotion() {
		heal = 10;
		d6 = new Roll(1, 6);
	}

	public int getHeal() {
		return heal;
	}
	
	public int heal() {
		
		if(this.heal == 0) {
			System.out.println("ULTIMA POÇÃO");
			return 0;
		}
		
		int totalCurado = d6.roll();
		
		if(totalCurado < heal) {
			this.heal -= totalCurado;
		}else {
			totalCurado = heal;
			this.heal = 0;
		}
		return totalCurado;
	}
	
}
