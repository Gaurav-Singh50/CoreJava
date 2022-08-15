package com.io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageRead_Write {
	BufferedImage img=null;
public void read() throws IOException
{

	File f=new File("F:\\award_2019\\precursor\\pic1.JPG");
	
	
	img=ImageIO.read(f);
			

	
}


public void write()throws IOException

{
	File f=new File("F:\\award_2019\\precursor\\copypic1.JPG");
	
boolean status=	ImageIO.write(img,"jpg",f);

if(status)
	
{
	
System.out.println("Image copied");}
	
	
}

public static void main(String[] args) throws IOException {
	
	ImageRead_Write im=new ImageRead_Write();
	
	im.read();
	im.write();
	
	
}
}
