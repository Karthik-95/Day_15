package Tasks;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;

import javax.imageio.ImageIO;

public class ScreenShoot {
	public static final long serialVersionUID=1L;
	public static void main(String[] args) throws Exception{
		Desktop desk=Desktop.getDesktop();
		desk.browse(new URI("https://www.bing.com/search?q=utc+time+now&cvid=78a9af6761724cbe9522f80b70141fb4&aqs=edge.1.69i59i450l8...8.3085529619j0j4&FORM=ANAB01&PC=LCTS"));
		try {
		Thread.sleep(2000);
		Robot r=new Robot();
		String path="D:\\Log\\javaScreenShot_2.jpg";
		Rectangle capture=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage image=r.createScreenCapture(capture);
		ImageIO.write(image, "jpg", new File(path));
		System.out.println("------- ScreenShot Saved -------");
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
