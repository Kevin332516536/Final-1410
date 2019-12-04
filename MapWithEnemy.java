import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MapWithEnemy extends JFrame {

	private Enemy e1;
	private Enemy e2;
	private Bullet p1;

	public MapWithEnemy(){
		try {
			BufferedImage enemyImage1 =ImageIO.read(new File("enemy1.png"));
			BufferedImage enemyImage2 =  ImageIO.read(new File("enemy2.png"));
			BufferedImage Bullet =  ImageIO.read(new File("Sphere.png"));
			
			p1 = new Bullet(0, 150, Bullet, 15, 15, null, 0, 0, 0, 0, 0, 6.0, 3.0, 0);
			e1 = new Enemy(10, 200, enemyImage1, 100, 75, null, 0, 0, 0, 0, 0, 2.0, 1,100);
			e2 = new Enemy(10, 700, enemyImage2, 100, 85, null, 0, 0, 0, 0, 0, 2.0, -1,100);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void paint(Graphics g){		
		super.paint(g);

		try{	
			p1.drawTheImage(g);
			e1.drawTheImage(g);	
			e2.drawTheImage(g);
			
			Thread.sleep(10);		
			repaint();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}

	}

	/*public static void main (String [] args){
		MapWithEnemy m = new MapWithEnemy();
		m.setSize(1370, 1000);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
	}*/
}

