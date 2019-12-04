import java.awt.image.BufferedImage;

@SuppressWarnings("serial")
public class Enemy extends MovingTowerDefenseObject{
	
	public int Ehealth;
	
	public Enemy (int x, int y, BufferedImage img, int Wid, int Hi, Bullet pro, int range, int delyspeed, int delaytime, int damage, int pvelo,
				  double xvelo, double yvelo, int ehealth)
		{
			super(x, y, img, Wid, Hi, pro, range, delyspeed, delaytime, damage,pvelo, xvelo, yvelo, ehealth);
		this.Ehealth=ehealth;
	}
	
	public int getEhealth() {return Ehealth;}
	
	public void getHit() {}
	
	public void setEhealth(int ehealth) {Ehealth = ehealth;}
	
}
