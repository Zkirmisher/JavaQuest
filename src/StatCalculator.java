/**
 * Stats Calculator for JavaQuest Characters
 */
public interface StatCalculator {

	// METHODS
	public long exp(int level);
	public int hp(int level);
	public int mp(int level);
	public int attack(int str);
	public int spell(int intel);
	public int crit(int dex);

}
