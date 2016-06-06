package kr.mohi.rpgcore.stat;

public class PlayerStat {

	public static final int MAX_HP = 0;
	public static final int MAX_MP = 1;
	public static final int STR = 2; // 공격력
	public static final int INT = 3; // 마법력
	public static final int DEX = 4; // 민첩
	public static final int LUK = 5; // 행운

	public static final int SP = 6; // Skill point
	public static final int HP = 7;
	public static final int MP = 8;
	public static final int AP = 9; // Ability point
	public static final int EXP = 10;

	private int maxHP;
	private int maxMP;
	private int str;
	private int int_;
	private int dex;
	private int luk;
	private int sp;
	private int mp;
	private int ap;
	private int exp;
	private float expBarPercent;
	private int maxExp;
	private int level;

	public PlayerStat(int[] defaultStat) {
		this.setMaxHP(defaultStat[MAX_HP]);
		this.setMaxMP(defaultStat[MAX_MP]);
		this.setSTR(defaultStat[STR]);
		this.setINT(defaultStat[INT]);
		this.setDEX(defaultStat[DEX]);
		this.setLUK(defaultStat[LUK]);
		this.setSP(defaultStat[SP]);
		this.setMP(defaultStat[MP]);
		this.setAP(defaultStat[AP]);
	}

	public PlayerStat() {

	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int _maxHP) {
		this.maxHP = _maxHP;
	}

	public int getMaxMP() {
		return maxMP;
	}

	public void setMaxMP(int _maxMP) {
		this.maxMP = _maxMP;
	}

	public int getSTR() {
		return str;
	}

	public void setSTR(int _str) {
		this.str = _str;
	}

	public int getINT() {
		return int_;
	}

	public void setINT(int _int) {
		this.int_ = _int;
	}

	public int getDEX() {
		return dex;
	}

	public void setDEX(int _dex) {
		this.dex = _dex;
	}

	public int getLUK() {
		return luk;
	}

	public void setLUK(int _luk) {
		this.luk = _luk;
	}

	public int getSP() {
		return sp;
	}

	public void setSP(int _sp) {
		this.sp = _sp;
	}

	public int getMP() {
		return mp;
	}

	public void setMP(int _mp) {
		if(this.getMaxMP() > _mp) {
			_mp = this.getMaxMP();
		}
		this.maxMP = _mp;
	}

	public int getAP() {
		return ap;
	}

	public void setAP(int _ap) {
		this.ap = _ap;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		if( this.getMaxExp() > mp) {
			mp = this.getMaxExp();
		}
		this.maxMP = mp;
	}

	public float getExpBarPercent() {
		return expBarPercent;
	}

	public void setExpBarPercent(float expBarPercent) {
		if (expBarPercent < 0) {
			expBarPercent = 0;
		}
		if (expBarPercent > 1) {
			expBarPercent = 1;
		}
		this.expBarPercent = expBarPercent;
	}

	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
