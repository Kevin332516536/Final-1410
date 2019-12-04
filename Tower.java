import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

@SuppressWarnings("serial")
public class Tower extends TowerDefenceObject{
	
	private int tx;
	private int ty;
	private BufferedImage Timg;
	private int tWi;
	private int tHi;
	private Bullet zidan;
	private int shootRadius;
	private int delayspeed;
	private int delaytime;

	public  Tower(int x, int y, BufferedImage img, int Wi, int Hi, Bullet zidan, int shootR, int dlspeed, int dltime, int damage,int pvelo,
				  double xvelo, double yvelo,int enemyhealth) 
	{	
		super(x, y, img, Wi, Hi, zidan, shootR, dlspeed, dltime, damage,pvelo, xvelo, yvelo, enemyhealth);
		tx=x;
		ty=y;
		Timg=img;
		tWi=Wi;
		tHi=Hi;
		shootRadius=shootR;
		delayspeed=30;
		delaytime=20;
		this.zidan=zidan;
	}
	
	public void drawTheImage(Graphics g) throws IOException {
		super.drawTheImage(g);
		delaytime--;
	}

	public int getShootRadius() {return shootRadius;}

	public void setShootRadius(int shootRadius) {this.shootRadius = shootRadius;}

	public int getDelayspeed() {return delayspeed;}

	public void setDelayspeed(int delayspeed) {this.delayspeed = delayspeed;}

	public int getDelaytime() {return delaytime;}

	public void setDelaytime(int delaytime) {this.delaytime = delaytime;}

	public int getTx() {return tx;}

	public void setTx(int tx) {this.tx = tx;}

	public int getTy() {return ty;}

	public void setTy(int ty) {this.ty = ty;}

	public BufferedImage getTimg() {return Timg;}

	public void setTimg(BufferedImage timg) {Timg = timg;}

	public int gettWi() {return tWi;}

	public void settWi(int tWi) {this.tWi = tWi;}

	public int gettHi() {return tHi;}

	public void settHi(int tHi) {this.tHi = tHi;}

	public Bullet getPaodan() {return zidan;}

	public void setPaodan(Bullet paodan) {this.zidan = paodan;}
	
	public Bullet fireAtEnemy(Enemy e) {
		delaytime=delayspeed;
		Bullet paodan1=new Bullet(zidan);
		paodan1.fireAtEnemy(e);
		return zidan;
	}
	
	public boolean canFire() {
		if(delaytime<=1) {
			return true;
		} else {
			return false;
		}
	}
}
