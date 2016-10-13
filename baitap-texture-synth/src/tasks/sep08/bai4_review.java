package tasks.sep08;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class bai4_review 
{

	public static void main(String[] args) 
	throws Exception
	{
		URL u = new URL("https://www.dropbox.com/s/g8ddpwoqoy2r0c4/snow%20island.jpg?dl=0&raw=1");
		BufferedImage t = ImageIO.read(u);
		System.out.print(t);
		
//		File f = new File("D:\\113.jpg");
//	    BufferedImage img = ImageIO.read(f);
//
//        int[][] pixelData = new int[img.getHeight() * img.getWidth()][3];
//
//	    int counter = 0;
//        for(int i = 0; i < img.getHeight(); i++)
//        for(int j = 0; j < img.getWidth(); j++){
//                Color c = new Color(img.getRGB(j, i));
//                pixelData[counter][0] = c.getRed();
//                pixelData[counter][1] = c.getGreen();
//                pixelData[counter][2] = c.getBlue();
//                counter++;
//        }
	}
}
