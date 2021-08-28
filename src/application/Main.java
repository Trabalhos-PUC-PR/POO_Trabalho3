package application;

import character.Character;
import items.Weapon;
import system.Roll;

public class Main {
	public static void main(String[] args) {

		int quantidadeDeVidaPrausarPocao = 10;
		
		Character hero = new Character("Sir Gallahad", 15, 5, 1, new Weapon("Broadsword", new Roll(1, 8)));

		var monster = Character.createGoblin();

		// A BATALHA ATE A MORTE!!!!
		while (hero.isAlive() && monster.isAlive()) {

			if (hero.getLife() <= quantidadeDeVidaPrausarPocao && hero.getHeal() > 0) {
				hero.heal();
			} else {
				hero.attack(monster);
			}

			if (monster.getLife() <= quantidadeDeVidaPrausarPocao && monster.getHeal() > 0 && monster.isAlive()) {
				monster.heal();
			} else {
				if (monster.isAlive()) {
					monster.attack(hero);
				}

			}

			System.out.println();
		}
	}
}
