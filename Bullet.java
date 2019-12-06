//Kaiwen Zhang
//12/4/19
//TD
import java.awt.image.BufferedImage;

@SuppressWarnings("serial")
public class Bullet extends MovingTowerDefenseObject{

	private int Damage;
	private int proVelo;
	private int proX;
	private int proY;

	public Bullet(int newx, int newy, BufferedImage img, int Wd, int Hi, Bullet b1, int range, int delyspeed, int delytime,int damage, int pvelo,
					double xvelo, double yvelo, int enemyhealth) {
		super(newx, newy, img, Wd, Hi, b1, range, delyspeed, delytime, damage, pvelo, xvelo, yvelo, enemyhealth);
		// TODO Auto-generated constructor stub
		Damage=damage;
		proVelo=pvelo;
		proX=newx;
		proY=newy;
	}

	public Bullet(Bullet P) {}
	
	public int getDamage() {return Damage;}
	
	public void setDamage(int damage) {Damage = damage;}
	
	public int getProVelo() {return proVelo;}
	
	public void setProVelo(int proVelo) {this.proVelo = proVelo;}

	public void getDamageOnEnemy() {}

	public void fireAtEnemy(Enemy e) {
		this.setXv((e.getTxZB()+25-proX)/25);
		this.setYv((e.getTyZB()+25-proY)/25);
	}

}
