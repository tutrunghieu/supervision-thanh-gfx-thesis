package tasks.sep08;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class bai4_review 
{

	public static void main(String[] args) 
	throws Exception
	{
		File f = new File("D:\\113.jpg");
	    BufferedImage img = ImageIO.read(f);

        int[][] pixelData = new int[img.getHeight() * img.getWidth()][3];

	    int counter = 0;
        for(int i = 0; i < img.getHeight(); i++)
        for(int j = 0; j < img.getWidth(); j++){
                Color c = new Color(img.getRGB(j, i));
                pixelData[counter][0] = c.getRed();
                pixelData[counter][1] = c.getGreen();
                pixelData[counter][2] = c.getBlue();
                counter++;
        }
	}
}
