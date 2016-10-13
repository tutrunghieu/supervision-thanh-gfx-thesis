package tasks.oct13;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class task1_color_replace {

	public static void main(String[] args) 
	throws Exception
	{
		BufferedImage img = readImage();
		img = processImage(img);
		writeImage(img, new File("c:/opt/image1.png"));
	}

	private static BufferedImage processImage(BufferedImage img) 
	{
		int Rx = img.getWidth(), Ry = img.getHeight();
		
		int blue = Color.blue.getRGB();
		int red = Color.red.getRGB();
		
		for(int x=0; x<Rx; x++)
		for(int y=0; y<Ry; y++)
		{
			Color cxy = new Color(img.getRGB(x, y));		
			if( colorDiff(cxy, Color.white) < 20 ) img.setRGB(x, y, blue);
			else if( colorDiff(cxy, Color.black) < 20 ) img.setRGB(x, y, red);
		}
		
		return img;
	}

	private static double colorDiff(Color x, Color y) 
	{
		int r = x.getRed() - y.getRed();
		int g = x.getGreen() - y.getGreen();
		int b = x.getBlue() - y.getBlue();
		
		return Math.sqrt( (r*r + g*g + b*b) / 3.0 );
	}



	private static void writeImage(BufferedImage img, File f) 
	throws Exception
	{
		ImageIO.write(img, "png", f);
		Desktop.getDesktop().open(f);
	}

	private static BufferedImage readImage() 
	throws Exception
	{
		URL uk = new URL("https://www.dropbox.com/s/3f3hzx1tjjadng0/cabine%20cafeteria.jpg?dl=0&raw=1");
		
		BufferedImage img = ImageIO.read(uk);
		System.out.println(img.getWidth() + ":" + img.getHeight());
		
		return img;
	}

}
