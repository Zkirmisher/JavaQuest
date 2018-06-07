public class AdventurerCalculator extends PlayerCalculator {

	// METHODS
	public int hp(int level) {
		return 100 * level;
	}

	public int mp(int level) {
		return 75 * level;
	}

	public int attack(int str) {
		return str * 4;
	}

	public int spell(int intel) {
		return intel * 5;
	}

	public int crit(int dex) {
		return dex * 444;
	}

}
