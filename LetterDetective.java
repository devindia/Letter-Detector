import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class LetterDetective extends JFrame{
	
	int[] larr = new int[26];
	
	BufferedImage image,image1,image2,image3,image4,image5;
	BufferedImage image6,image7,image8,image9,image10;
	BufferedImage image11,image12,image13,image14,image15;
	BufferedImage image16,image17,image18,image19,image20;
	BufferedImage image21,image22,image23,image24,image25,image26,image27;
	
	int height1,width1,height2,width2,height3,width3,height4,width4,height5,width5;
	int height6,width6,height7,width7,height8,width8,height9,width9,height10,width10;
	int height11,width11,height12,width12,height13,width13,height14,width14,height15,width15;
	int height16,width16,height17,width17,height18,width18,height19,width19,height20,width20;
	int height21,width21,height22,width22,height23,width23,height24,width24,height25,width25,height26,width26,height27,width27;
	
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	ArrayList<Integer> al2 = new ArrayList<Integer>();
	ArrayList<Integer> al3 = new ArrayList<Integer>();
	ArrayList<Integer> al4 = new ArrayList<Integer>();
	
	
	ArrayList<Integer> Alist = new ArrayList<Integer>();
	int maxDif=51,minDif=-1;
	
	ArrayList<Integer> arrX1 = new ArrayList<Integer>();
	ArrayList<Integer> arrY1 = new ArrayList<Integer>();
	ArrayList<Integer> arrX2 = new ArrayList<Integer>();
	ArrayList<Integer> arrY2 = new ArrayList<Integer>();
	ArrayList<Integer> arrX3 = new ArrayList<Integer>();
	ArrayList<Integer> arrY3 = new ArrayList<Integer>();
	ArrayList<Integer> arrX4 = new ArrayList<Integer>();
	ArrayList<Integer> arrY4 = new ArrayList<Integer>();
	ArrayList<Integer> arrX5 = new ArrayList<Integer>();
	ArrayList<Integer> arrY5 = new ArrayList<Integer>();
	ArrayList<Integer> arrX6 = new ArrayList<Integer>();
	ArrayList<Integer> arrY6 = new ArrayList<Integer>();
	ArrayList<Integer> arrX7 = new ArrayList<Integer>();
	ArrayList<Integer> arrY7 = new ArrayList<Integer>();
	ArrayList<Integer> arrX8 = new ArrayList<Integer>();
	ArrayList<Integer> arrY8 = new ArrayList<Integer>();
	ArrayList<Integer> arrX9 = new ArrayList<Integer>();
	ArrayList<Integer> arrY9 = new ArrayList<Integer>();
	ArrayList<Integer> arrX10 = new ArrayList<Integer>();
	ArrayList<Integer> arrY10 = new ArrayList<Integer>();
	ArrayList<Integer> arrX11 = new ArrayList<Integer>();
	ArrayList<Integer> arrY11 = new ArrayList<Integer>();
	ArrayList<Integer> arrX12 = new ArrayList<Integer>();
	ArrayList<Integer> arrY12 = new ArrayList<Integer>();
	ArrayList<Integer> arrX13 = new ArrayList<Integer>();
	ArrayList<Integer> arrY13 = new ArrayList<Integer>();
	ArrayList<Integer> arrX14 = new ArrayList<Integer>();
	ArrayList<Integer> arrY14 = new ArrayList<Integer>();
	ArrayList<Integer> arrX15 = new ArrayList<Integer>();
	ArrayList<Integer> arrY15 = new ArrayList<Integer>();
	ArrayList<Integer> arrX16 = new ArrayList<Integer>();
	ArrayList<Integer> arrY16 = new ArrayList<Integer>();
	ArrayList<Integer> arrX17 = new ArrayList<Integer>();
	ArrayList<Integer> arrY17 = new ArrayList<Integer>();
	ArrayList<Integer> arrX18 = new ArrayList<Integer>();
	ArrayList<Integer> arrY18 = new ArrayList<Integer>();
	ArrayList<Integer> arrX19 = new ArrayList<Integer>();
	ArrayList<Integer> arrY19 = new ArrayList<Integer>();
	ArrayList<Integer> arrX20 = new ArrayList<Integer>();
	ArrayList<Integer> arrY20 = new ArrayList<Integer>();
	ArrayList<Integer> arrX21 = new ArrayList<Integer>();
	ArrayList<Integer> arrY21 = new ArrayList<Integer>();
	ArrayList<Integer> arrX22 = new ArrayList<Integer>();
	ArrayList<Integer> arrY22 = new ArrayList<Integer>();
	ArrayList<Integer> arrX23 = new ArrayList<Integer>();
	ArrayList<Integer> arrY23 = new ArrayList<Integer>();
	ArrayList<Integer> arrX24 = new ArrayList<Integer>();
	ArrayList<Integer> arrY24 = new ArrayList<Integer>();
	ArrayList<Integer> arrX25 = new ArrayList<Integer>();
	ArrayList<Integer> arrY25 = new ArrayList<Integer>();
	ArrayList<Integer> arrX26 = new ArrayList<Integer>();
	ArrayList<Integer> arrY26 = new ArrayList<Integer>();
	ArrayList<Integer> arrX27 = new ArrayList<Integer>();
	ArrayList<Integer> arrY27 = new ArrayList<Integer>();
	
	
	ArrayList<Integer> arrZX1 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY1 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX2 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY2 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX3 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY3 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX4 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY4 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX5 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY5 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX6 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY6 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX7 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY7 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX8 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY8 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX9 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY9 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX10 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY10 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX11 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY11 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX12 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY12 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX13 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY13 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX14 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY14 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX15 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY15 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX16 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY16 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX17 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY17 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX18 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY18 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX19 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY19 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX20 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY20 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX21 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY21 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX22 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY22 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX23 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY23 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX24 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY24 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX25 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY25 = new ArrayList<Integer>();
	ArrayList<Integer> arrZX26 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY26 = new ArrayList<Integer>();	
	ArrayList<Integer> arrZX27 = new ArrayList<Integer>();
	ArrayList<Integer> arrZY27 = new ArrayList<Integer>();	
	
	
	ArrayList<Integer> arrL1 = new ArrayList<Integer>();
	ArrayList<Integer> arrW1 = new ArrayList<Integer>();
	
	
	public LetterDetective() throws IOException{
		
		setTitle("Image Processing"); 
		setSize(1200,700);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		File input1 = new File("A1.jpg"); 
		File input2 = new File("B1.jpg");
		File input3 = new File("C1.jpg"); 
		File input4 = new File("D1.jpg"); 
		File input5 = new File("E1.jpg");
		File input6 = new File("F1.jpg");
		File input7 = new File("G1.jpg");
		File input8 = new File("H1.jpg"); 
		File input9 = new File("I1.jpg");
		File input10 = new File("J1.jpg");
	 	File input11 = new File("K1.jpg");
		File input12 = new File("L1.jpg"); 
		File input13 = new File("M1.jpg");
		File input14 = new File("N1.jpg");
		File input15 = new File("O1.jpg"); 
		File input16 = new File("P1.jpg"); 
		File input17 = new File("Q1.jpg");
		File input18 = new File("R1.jpg");
		File input19 = new File("S1.jpg");
		File input20 = new File("T1.jpg");
		File input21 = new File("U1.jpg");
		File input22 = new File("V1.jpg");
		File input23 = new File("W1.jpg");
		File input24 = new File("X1.jpg"); 
		File input25 = new File("Y1.jpg");
		File input26 = new File("Z1.jpg"); 
		File input27 = new File("Y1.jpg"); 
		 
		image1 = ImageIO.read(input1);
		image2 = ImageIO.read(input2);
		image3 = ImageIO.read(input3);
		image4 = ImageIO.read(input4);
		image5 = ImageIO.read(input5);
		image6 = ImageIO.read(input6);
		image7 = ImageIO.read(input7);
		image8 = ImageIO.read(input8);
		image9 = ImageIO.read(input9);
		image10 = ImageIO.read(input10);
		image11 = ImageIO.read(input11);
		image12 = ImageIO.read(input12);
		image13 = ImageIO.read(input13);
		image14 = ImageIO.read(input14);
		image15 = ImageIO.read(input15);
		image16 = ImageIO.read(input16);
		image17 = ImageIO.read(input17);
		image18 = ImageIO.read(input18);
		image19 = ImageIO.read(input19);
		image20 = ImageIO.read(input20);
		image21 = ImageIO.read(input21);
		image22 = ImageIO.read(input22);
		image23 = ImageIO.read(input23);
		image24 = ImageIO.read(input24);
		image25 = ImageIO.read(input25);
		image26 = ImageIO.read(input26);
		image27 = ImageIO.read(input27);
		
		width1 = image1.getWidth();
		height1 = image1.getHeight();
		
		width2 = image2.getWidth();
		height2 = image2.getHeight();
		
		width3 = image3.getWidth();
		height3 = image3.getHeight();
		
		width4 = image4.getWidth();
		height4 = image4.getHeight();
		
		width5 = image5.getWidth();
		height5 = image5.getHeight();
		
		width6 = image6.getWidth();
		height6 = image6.getHeight();
		
		width7 = image7.getWidth();
		height7 = image7.getHeight();
		
		width8 = image8.getWidth();
		height8 = image8.getHeight();
		
		width9 = image9.getWidth();
		height9 = image9.getHeight();
		
		width10 = image10.getWidth();
		height10 = image10.getHeight();
		
		width11 = image11.getWidth();
		height11 = image11.getHeight();
		
		width12 = image12.getWidth();
		height12 = image12.getHeight();
		
		width13 = image13.getWidth();
		height13 = image13.getHeight();
		
		width14 = image14.getWidth();
		height14 = image14.getHeight();
		
		width15 = image15.getWidth();
		height15 = image15.getHeight();
		
		width16 = image16.getWidth();
		height16 = image16.getHeight();
		
		width17 = image17.getWidth();
		height17 = image17.getHeight();
		
		width18 = image18.getWidth();
		height18 = image18.getHeight();
		
		width19 = image19.getWidth();
		height19 = image19.getHeight();
		
		width20 = image20.getWidth();
		height20 = image20.getHeight();
        
		width21 = image21.getWidth();
		height21 = image21.getHeight();
		
		width22 = image22.getWidth();
		height22 = image22.getHeight();
		
		width23 = image23.getWidth();
		height23 = image23.getHeight();
		
		width24 = image24.getWidth();
		height24 = image24.getHeight();
		
		width25 = image25.getWidth();
		height25 = image25.getHeight();
		
		width26 = image26.getWidth();
		height26 = image26.getHeight();
		
		width27 = image27.getWidth();
		height27 = image27.getHeight();
	
		int maxHeight1=0;
		int maxWidth1=0;
		int minHeight1=2000;
		int minWidth1=2000;
		int maxHeight2=0;
		int maxWidth2=0;
		int minHeight2=2000;
		int minWidth2=2000;
		int maxHeight3=0;
		int maxWidth3=0;
		int minHeight3=2000;
		int minWidth3=2000;
		int maxHeight4=0;
		int maxWidth4=0;
		int minHeight4=2000;
		int minWidth4=2000;
		int maxHeight5=0;
		int maxWidth5=0;
		int minHeight5=2000;
		int minWidth5=2000;
		int maxHeight6=0;
		int maxWidth6=0;
		int minHeight6=2000;
		int minWidth6=2000;
		int maxHeight7=0;
		int maxWidth7=0;
		int minHeight7=2000;
		int minWidth7=2000;
		int maxHeight8=0;
		int maxWidth8=0;
		int minHeight8=2000;
		int minWidth8=2000;
		int maxHeight9=0;
		int maxWidth9=0;
		int minHeight9=2000;
		int minWidth9=2000;
		int maxHeight10=0;
		int maxWidth10=0;
		int minHeight10=2000;
		int minWidth10 = 2000;
		int maxHeight11=0;
		int maxWidth11=0;
		int minHeight11=2000;
		int minWidth11=2000;
		int maxHeight12=0;
		int maxWidth12=0;
		int minHeight12=2000;
		int minWidth12=2000;
		int maxHeight13=0;
		int maxWidth13=0;
		int minHeight13=2000;
		int minWidth13=2000;
		int maxHeight14=0;
		int maxWidth14=0;
		int minHeight14=2000;
		int minWidth14=2000;
		int maxHeight15=0;
		int maxWidth15=0;
		int minHeight15=2000;
		int minWidth15=2000;
		int maxHeight16=0;
		int maxWidth16=0;
		int minHeight16=2000;
		int minWidth16=2000;
		int maxHeight17=0;
		int maxWidth17=0;
		int minHeight17=2000;
		int minWidth17=2000;
		int maxHeight18=0;
		int maxWidth18=0;
		int minHeight18=2000;
		int minWidth18=2000;
		int maxHeight19=0;
		int maxWidth19=0;
		int minHeight19=2000;
		int minWidth19=2000;
		int maxHeight20=0;
		int maxWidth20=0;
		int minHeight20=2000;
		int minWidth20=2000;
		int maxHeight21=0;
		int maxWidth21=0;
		int minHeight21=2000;
		int minWidth21=2000;
		int maxHeight22=0;
		int maxWidth22=0;
		int minHeight22=2000;
		int minWidth22=2000;
		int maxHeight23=0;
		int maxWidth23=0;
		int minHeight23=2000;
		int minWidth23=2000;
		int maxHeight24=0;
		int maxWidth24=0;
		int minHeight24=2000;
		int minWidth24=2000;
		int maxHeight25=0;
		int maxWidth25=0;
		int minHeight25=2000;
		int minWidth25=2000;
		int maxHeight26=0;
		int maxWidth26=0;
		int minHeight26=2000;
		int minWidth26=2000;
		int maxHeight27=0;
		int maxWidth27=0;
		int minHeight27=2000;
		int minWidth27=2000;
		
		for(int i=0; i<height1; i++){
			for(int j=0; j<width1; j++){
				int clr=  image1.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight1 = Math.max(maxHeight1, j);
				    maxWidth1 = Math.max(maxWidth1, i);
					minHeight1 = Math.min(minHeight1, j);
				    minWidth1 = Math.min(minWidth1, i);
					
					arrX1.add(j);
					arrY1.add(i);
					
				   }
				
					
				   }
			}
		
		for(int i=0; i<height2; i++){
			for(int j=0; j<width2; j++){
				int clr=  image2.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					
					maxHeight2 = Math.max(maxHeight2, j);
					maxWidth2 = Math.max(maxWidth2, i);
					minHeight2 = Math.min(minHeight2, j);
					minWidth2 = Math.min(minWidth2, i);
					
					arrX2.add(j);
					arrY2.add(i);
					
				}
				
				
					
				}
				}
		
		for(int i=0; i<height3; i++){
			for(int j=0; j<width3; j++){
				int clr=  image3.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight3 = Math.max(maxHeight3, j);
				    maxWidth3 = Math.max(maxWidth3, i);
					minHeight3 = Math.min(minHeight3, j);
				    minWidth3 = Math.min(minWidth3, i);
					
					arrX3.add(j);
					arrY3.add(i);  
					
				   }
				
					
				   }
			}
		for(int i=0; i<height4; i++){
			for(int j=0; j<width4; j++){
				int clr=  image4.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight4 = Math.max(maxHeight4, j);
				    maxWidth4 = Math.max(maxWidth4, i);
					minHeight4 = Math.min(minHeight4, j);
				    minWidth4 = Math.min(minWidth4, i);
					
					arrX4.add(j);
					arrY4.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height5; i++){
			for(int j=0; j<width5; j++){
				int clr=  image5.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight5 = Math.max(maxHeight5, j);
				    maxWidth5 = Math.max(maxWidth5, i);
					minHeight5 = Math.min(minHeight5, j);
				    minWidth5 = Math.min(minWidth5, i);
					
					arrX5.add(j);
					arrY5.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height6; i++){
			for(int j=0; j<width6; j++){
				int clr=  image6.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight6 = Math.max(maxHeight6, j);
				    maxWidth6 = Math.max(maxWidth6, i);
					minHeight6 = Math.min(minHeight6, j);
				    minWidth6 = Math.min(minWidth6, i);
					
					arrX6.add(j);
					arrY6.add(i);
					
				   }
				
					
				   }
			}
		
		for(int i=0; i<height7; i++){
			for(int j=0; j<width7; j++){
				int clr=  image7.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					
					maxHeight7 = Math.max(maxHeight7, j);
					maxWidth7 = Math.max(maxWidth7, i);
					minHeight7 = Math.min(minHeight7, j);
					minWidth7 = Math.min(minWidth7, i);
					
					arrX7.add(j);
					arrY7.add(i);
					
				}
				
				
					
				}
				}
		
		for(int i=0; i<height8; i++){
			for(int j=0; j<width8; j++){
				int clr=  image8.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight8 = Math.max(maxHeight8, j);
				    maxWidth8 = Math.max(maxWidth8, i);
					minHeight8 = Math.min(minHeight8, j);
				    minWidth8 = Math.min(minWidth8, i);
					
					arrX8.add(j);
					arrY8.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height9; i++){
			for(int j=0; j<width9; j++){
				int clr=  image9.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight9 = Math.max(maxHeight9, j);
				    maxWidth9 = Math.max(maxWidth9, i);
					minHeight9 = Math.min(minHeight9, j);
				    minWidth9 = Math.min(minWidth9, i);
					
					arrX9.add(j);
					arrY9.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height10; i++){
			for(int j=0; j<width10; j++){
				int clr=  image10.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight10 = Math.max(maxHeight10, j);
				    maxWidth10 = Math.max(maxWidth10, i);
					minHeight10 = Math.min(minHeight10, j);
				    minWidth10 = Math.min(minWidth10, i);
					
					arrX10.add(j);
					arrY10.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height11; i++){
			for(int j=0; j<width11; j++){
				int clr=  image11.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight11 = Math.max(maxHeight11, j);
				    maxWidth11 = Math.max(maxWidth11, i);
					minHeight11 = Math.min(minHeight11, j);
				    minWidth11 = Math.min(minWidth11, i);
					
					arrX11.add(j);
					arrY11.add(i);
					
				   }
				 
					
				   }
			}
		
		for(int i=0; i<height12; i++){
			for(int j=0; j<width12; j++){
				int clr=  image12.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					
					maxHeight12 = Math.max(maxHeight12, j);
					maxWidth12 = Math.max(maxWidth12, i);
					minHeight12 = Math.min(minHeight12, j);
					minWidth12 = Math.min(minWidth12, i);
					
					arrX12.add(j);
					arrY12.add(i);
					
				}
				
				
					
				}
				}
		
		for(int i=0; i<height13; i++){
			for(int j=0; j<width13; j++){
				int clr=  image13.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight13 = Math.max(maxHeight13, j);
				    maxWidth13 = Math.max(maxWidth13, i);
					minHeight13 = Math.min(minHeight13, j);
				    minWidth13 = Math.min(minWidth13, i);
					
					arrX13.add(j);
					arrY13.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height14; i++){
			for(int j=0; j<width14; j++){
				int clr=  image14.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight14 = Math.max(maxHeight14, j);
				    maxWidth14 = Math.max(maxWidth14, i);
					minHeight14 = Math.min(minHeight14, j);
				    minWidth14 = Math.min(minWidth14, i);
					
					arrX14.add(j);
					arrY14.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height15; i++){
			for(int j=0; j<width15; j++){
				int clr=  image15.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight15 = Math.max(maxHeight15, j);
				    maxWidth15 = Math.max(maxWidth15, i);
					minHeight15 = Math.min(minHeight15, j);
				    minWidth15 = Math.min(minWidth15, i);
					
					arrX15.add(j);
					arrY15.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height16; i++){
			for(int j=0; j<width16; j++){
				int clr=  image16.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight16 = Math.max(maxHeight16, j);
				    maxWidth16 = Math.max(maxWidth16, i);
					minHeight16 = Math.min(minHeight16, j);
				    minWidth16 = Math.min(minWidth16, i);
					
					arrX16.add(j);
					arrY16.add(i);
					
				   }
				
					
				   }
			}
		
		for(int i=0; i<height17; i++){
			for(int j=0; j<width17; j++){
				int clr=  image17.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					
					maxHeight17 = Math.max(maxHeight17, j);
					maxWidth17 = Math.max(maxWidth17, i);
					minHeight17 = Math.min(minHeight17, j);
					minWidth17 = Math.min(minWidth17, i);
					
					arrX17.add(j);
					arrY17.add(i);
					
				}
				
				
					
				}
				}
		
		for(int i=0; i<height18; i++){
			for(int j=0; j<width18; j++){
				int clr=  image18.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight18 = Math.max(maxHeight18, j);
				    maxWidth18 = Math.max(maxWidth18, i);
					minHeight18 = Math.min(minHeight18, j);
				    minWidth18 = Math.min(minWidth18, i);
					
					arrX18.add(j);
					arrY18.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height19; i++){
			for(int j=0; j<width19; j++){
				int clr=  image19.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight19 = Math.max(maxHeight19, j);
				    maxWidth19 = Math.max(maxWidth19, i);
					minHeight19 = Math.min(minHeight19, j);
				    minWidth19 = Math.min(minWidth19, i);
					
					arrX19.add(j);
					arrY19.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height20; i++){
			for(int j=0; j<width20; j++){
				int clr=  image20.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight20 = Math.max(maxHeight20, j);
				    maxWidth20 = Math.max(maxWidth20, i);
					minHeight20 = Math.min(minHeight20, j);
				    minWidth20 = Math.min(minWidth20, i);
					
					arrX20.add(j);
					arrY20.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height21; i++){
			for(int j=0; j<width21; j++){
				int clr=  image21.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight21 = Math.max(maxHeight21, j);
				    maxWidth21 = Math.max(maxWidth21, i);
					minHeight21 = Math.min(minHeight21, j);
				    minWidth21 = Math.min(minWidth21, i);
					
					arrX21.add(j);
					arrY21.add(i);
					
				   }
				
					
				   }
			}
		
		for(int i=0; i<height22; i++){
			for(int j=0; j<width22; j++){
				int clr=  image22.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					
					maxHeight22 = Math.max(maxHeight22, j);
					maxWidth22 = Math.max(maxWidth22, i);
					minHeight22 = Math.min(minHeight22, j);
					minWidth22 = Math.min(minWidth22 ,i);
					
					arrX22.add(j);
					arrY22.add(i);
					
				}
				
				
					
				}
				}
		
		for(int i=0; i<height23; i++){
			for(int j=0; j<width23; j++){
				int clr=  image23.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight23 = Math.max(maxHeight23, j);
				    maxWidth23 = Math.max(maxWidth23, i);
					minHeight23 = Math.min(minHeight23, j);
				    minWidth23 = Math.min(minWidth23, i);
					
					arrX23.add(j);
					arrY23.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height24; i++){
			for(int j=0; j<width24; j++){
				int clr=  image24.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight24 = Math.max(maxHeight24, j);
				    maxWidth24 = Math.max(maxWidth24, i);
					minHeight24 = Math.min(minHeight24, j);
				    minWidth24 = Math.min(minWidth24, i);
					
					arrX24.add(j);
					arrY24.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height25; i++){
			for(int j=0; j<width25; j++){
				int clr=  image25.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight25 = Math.max(maxHeight25, j);
				    maxWidth25 = Math.max(maxWidth25, i);
					minHeight25 = Math.min(minHeight25, j);
				    minWidth25 = Math.min(minWidth25, i);
					
					arrX25.add(j);
					arrY25.add(i);
					
				   }
				
					
				   }
			}
		
		for(int i=0; i<height26; i++){
			for(int j=0; j<width26; j++){
				int clr=  image26.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight26 = Math.max(maxHeight26, j);
				    maxWidth26 = Math.max(maxWidth26, i);
					minHeight26 = Math.min(minHeight26, j);
				    minWidth26 = Math.min(minWidth26, i);
					
					arrX26.add(j);
					arrY26.add(i);
					
				   }
				
					
				   }
			}
		for(int i=0; i<height27; i++){
			for(int j=0; j<width27; j++){
				int clr=  image27.getRGB(j,i); 
				int  r   = (clr & 0x00ff0000) >> 16;
				int  g = (clr & 0x0000ff00) >> 8;
				int  b  =  clr & 0x000000ff;
				if(r<200&&g<200&&b>100){
					
					maxHeight27 = Math.max(maxHeight27, j);
				    maxWidth27 = Math.max(maxWidth27, i);
					minHeight27 = Math.min(minHeight27, j);
				    minWidth27 = Math.min(minWidth27, i);
					
					arrX27.add(j);
					arrY27.add(i);
					
				   }
				
					
				   }
			}
		//System.out.println("count: "+c);
		//System.out.println(arrX);
		//System.out.println(arrZX);
		//System.out.println(arrY);
		//System.out.println(arrZY);
		//System.out.println(arrX.size());
		//System.out.println(arrY.size());
		//System.out.println(width);
		//System.out.println(height);
		//System.out.println(maxHeight+" "+minHeight+" "+maxWidth+" "+minWidth);
		
		 
		
		for(int i=0;i<arrX1.size();i++){
			int nH = arrX1.get(i)- minHeight1;
			int per = (nH*100)/(maxHeight1-minHeight1);
			
			arrZX1.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY1.size();j++){
			int nW = arrY1.get(j)-minWidth1;
			int per = (nW*100)/(maxWidth1-minWidth1);
			
				arrZY1.add(per);
			
		}
		
		
		
		for(int i=0;i<arrX2.size();i++){
			int nH = arrX2.get(i)- minHeight2;
			int per = (nH*100)/(maxHeight2-minHeight2);
			
				arrZX2.add(per);
			
		}
		
		
		for(int j=0;j<arrY2.size();j++){
			int nW = arrY2.get(j)-minWidth2;
			int per = (nW*100)/(maxWidth2-minWidth2);
			
				arrZY2.add(per);
			
		}
		
	
		for(int i=0;i<arrX3.size();i++){
			int nH = arrX3.get(i)- minHeight3;
			int per = (nH*100)/(maxHeight3-minHeight3);
			
			arrZX3.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY3.size();j++){
			int nW = arrY3.get(j)-minWidth3;
			int per = (nW*100)/(maxWidth3-minWidth3);
			
				arrZY3.add(per);
			
		}
		for(int i=0;i<arrX4.size();i++){
			int nH = arrX4.get(i)- minHeight4;
			int per = (nH*100)/(maxHeight4-minHeight4);
			
			arrZX4.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY4.size();j++){
			int nW = arrY4.get(j)-minWidth4;
			int per = (nW*100)/(maxWidth4-minWidth4);
			
				arrZY4.add(per);
			
		}
		
		for(int i=0;i<arrX5.size();i++){
			int nH = arrX5.get(i)- minHeight5;
			int per = (nH*100)/(maxHeight5-minHeight5);
			
			arrZX5.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY5.size();j++){
			int nW = arrY5.get(j)-minWidth5;
			int per = (nW*100)/(maxWidth5-minWidth5);
			
				arrZY5.add(per);
			
		}
		
		for(int i=0;i<arrX6.size();i++){
			int nH = arrX6.get(i)- minHeight6;
			int per = (nH*100)/(maxHeight6-minHeight6);
			
			arrZX6.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY6.size();j++){
			int nW = arrY6.get(j)-minWidth6;
			int per = (nW*100)/(maxWidth6-minWidth6);
			
				arrZY6.add(per);
			
		}
		
		
		
		for(int i=0;i<arrX7.size();i++){
			int nH = arrX7.get(i)- minHeight7;
			int per = (nH*100)/(maxHeight7-minHeight7);
			
				arrZX7.add(per);
			
		}
		
		
		for(int j=0;j<arrY7.size();j++){
			int nW = arrY7.get(j)-minWidth7;
			int per = (nW*100)/(maxWidth7-minWidth7);
			
				arrZY7.add(per);
			
		}
		
	
		for(int i=0;i<arrX8.size();i++){
			int nH = arrX8.get(i)- minHeight8;
			int per = (nH*100)/(maxHeight8-minHeight8);
			
			arrZX8.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY8.size();j++){
			int nW = arrY8.get(j)-minWidth8;
			int per = (nW*100)/(maxWidth8-minWidth8);
			
				arrZY8.add(per);
			
		}
		for(int i=0;i<arrX9.size();i++){
			int nH = arrX9.get(i)- minHeight9;
			int per = (nH*100)/(maxHeight9-minHeight9);
			
			arrZX9.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY9.size();j++){
			int nW = arrY9.get(j)-minWidth9;
			int per = (nW*100)/(maxWidth9-minWidth9);
			
				arrZY9.add(per);
			
		}
		
		for(int i=0;i<arrX10.size();i++){
			int nH = arrX10.get(i)- minHeight10;
			int per = (nH*100)/(maxHeight10-minHeight10);
			
			arrZX10.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY10.size();j++){
			int nW = arrY10.get(j)-minWidth10;
			int per = (nW*100)/(maxWidth10-minWidth10);
			
				arrZY10.add(per);
			
		}
		for(int i=0;i<arrX11.size();i++){
			int nH = arrX11.get(i)- minHeight11;
			int per = (nH*100)/(maxHeight11-minHeight11);
			
			arrZX11.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY11.size();j++){
			int nW = arrY11.get(j)-minWidth11;
			int per = (nW*100)/(maxWidth11-minWidth11);
			
				arrZY11.add(per);
			
		}
		
		
		
		for(int i=0;i<arrX12.size();i++){
			int nH = arrX12.get(i)- minHeight12;
			int per = (nH*100)/(maxHeight12-minHeight12);
			
				arrZX12.add(per);
			
		}
		
		
		for(int j=0;j<arrY12.size();j++){
			int nW = arrY12.get(j)-minWidth12;
			int per = (nW*100)/(maxWidth12-minWidth12);
			
				arrZY12.add(per);
			
		}
		
	
		for(int i=0;i<arrX13.size();i++){
			int nH = arrX13.get(i)- minHeight13;
			int per = (nH*100)/(maxHeight13-minHeight13);
			
			arrZX13.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY13.size();j++){
			int nW = arrY13.get(j)-minWidth13;
			int per = (nW*100)/(maxWidth13-minWidth13);
			
				arrZY13.add(per);
			
		}
		for(int i=0;i<arrX14.size();i++){
			int nH = arrX14.get(i)- minHeight14;
			int per = (nH*100)/(maxHeight14-minHeight14);
			
			arrZX14.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY14.size();j++){
			int nW = arrY14.get(j)-minWidth14;
			int per = (nW*100)/(maxWidth14-minWidth14);
			
				arrZY14.add(per);
			
		}
		
		for(int i=0;i<arrX15.size();i++){
			int nH = arrX15.get(i)- minHeight15;
			int per = (nH*100)/(maxHeight15-minHeight15);
			
			arrZX15.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY15.size();j++){
			int nW = arrY15.get(j)-minWidth15;
			int per = (nW*100)/(maxWidth15-minWidth15);
			
				arrZY15.add(per);
			
		}
		
		for(int i=0;i<arrX16.size();i++){
			int nH = arrX16.get(i)- minHeight16;
			int per = (nH*100)/(maxHeight16-minHeight16);
			
			arrZX16.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY16.size();j++){
			int nW = arrY16.get(j)-minWidth16;
			int per = (nW*100)/(maxWidth16-minWidth16);
			
				arrZY16.add(per);
			
		}
		
		
		
		for(int i=0;i<arrX17.size();i++){
			int nH = arrX17.get(i)- minHeight17;
			int per = (nH*100)/(maxHeight17-minHeight17);
			
				arrZX17.add(per);
			
		}
		
		
		for(int j=0;j<arrY17.size();j++){
			int nW = arrY17.get(j)-minWidth17;
			int per = (nW*100)/(maxWidth17-minWidth17);
			
				arrZY17.add(per);
			
		}
		
	
		for(int i=0;i<arrX18.size();i++){
			int nH = arrX18.get(i)- minHeight18;
			int per = (nH*100)/(maxHeight18-minHeight18);
			
			arrZX18.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY18.size();j++){
			int nW = arrY18.get(j)-minWidth18;
			int per = (nW*100)/(maxWidth18-minWidth18);
			
				arrZY18.add(per);
			
		}
		for(int i=0;i<arrX19.size();i++){
			int nH = arrX19.get(i)- minHeight19;
			int per = (nH*100)/(maxHeight19-minHeight19);
			
			arrZX19.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY19.size();j++){
			int nW = arrY19.get(j)-minWidth19;
			int per = (nW*100)/(maxWidth19-minWidth19);
			
				arrZY19.add(per);
			
		}
		
		for(int i=0;i<arrX20.size();i++){
			int nH = arrX20.get(i)- minHeight20;
			int per = (nH*100)/(maxHeight20-minHeight20);
			
			arrZX20.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY20.size();j++){
			int nW = arrY20.get(j)-minWidth20;
			int per = (nW*100)/(maxWidth20-minWidth20);
			
				arrZY20.add(per);
			
		}
		
		for(int i=0;i<arrX21.size();i++){
			int nH = arrX21.get(i)- minHeight21;
			int per = (nH*100)/(maxHeight21-minHeight21);
			
			arrZX21.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY21.size();j++){
			int nW = arrY21.get(j)-minWidth21;
			int per = (nW*100)/(maxWidth21-minWidth21);
			
				arrZY21.add(per);
			
		}
		
		
		
		for(int i=0;i<arrX22.size();i++){
			int nH = arrX22.get(i)- minHeight22;
			int per = (nH*100)/(maxHeight22-minHeight22);
			
				arrZX22.add(per);
			
		}
		
		
		for(int j=0;j<arrY22.size();j++){
			int nW = arrY22.get(j)-minWidth22;
			int per = (nW*100)/(maxWidth22-minWidth22);
			
				arrZY22.add(per);
			
		}
		
	
		for(int i=0;i<arrX23.size();i++){
			int nH = arrX23.get(i)- minHeight23;
			int per = (nH*100)/(maxHeight23-minHeight23);
			
			arrZX23.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY23.size();j++){
			int nW = arrY23.get(j)-minWidth23;
			int per = (nW*100)/(maxWidth23-minWidth23);
			
				arrZY23.add(per);
			
		}
		for(int i=0;i<arrX24.size();i++){
			int nH = arrX24.get(i)- minHeight24;
			int per = (nH*100)/(maxHeight24-minHeight24);
			
			arrZX24.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY24.size();j++){
			int nW = arrY24.get(j)-minWidth24;
			int per = (nW*100)/(maxWidth24-minWidth24);
			
				arrZY24.add(per);
			
		}
		
		for(int i=0;i<arrX25.size();i++){
			int nH = arrX25.get(i)- minHeight25;
			int per = (nH*100)/(maxHeight25-minHeight25);
			
			arrZX25.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY25.size();j++){
			int nW = arrY25.get(j)-minWidth25;
			int per = (nW*100)/(maxWidth25-minWidth25);
			
				arrZY25.add(per);
			
		}
		
		for(int i=0;i<arrX26.size();i++){
			int nH = arrX26.get(i)- minHeight26;
			int per = (nH*100)/(maxHeight26-minHeight26);
			
			arrZX26.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY26.size();j++){
			int nW = arrY26.get(j)-minWidth26;
			int per = (nW*100)/(maxWidth26-minWidth26);
			
				arrZY26.add(per);
			
		}
		for(int i=0;i<arrX27.size();i++){
			int nH = arrX27.get(i)- minHeight27;
			int per = (nH*100)/(maxHeight27-minHeight27);
			
			arrZX27.add(per);
			
		}
		
		
		
		for(int j=0;j<arrY27.size();j++){
			int nW = arrY27.get(j)-minWidth27;
			int per = (nW*100)/(maxWidth27-minWidth27);
			
				arrZY27.add(per);
			
		}
		
		
		
		
		
		recognise_A();
		recognise_B();
		recognise_C();
		recognise_D();
		recognise_E();
		recognise_F();
		recognise_G();
		recognise_H();
		recognise_I();
		recognise_J();
		recognise_K();
		recognise_L();
		recognise_M();
		recognise_N();
		recognise_O();
		recognise_P();
		recognise_Q();
		recognise_R();
		recognise_S();
		recognise_T();
		recognise_U();
		recognise_V();
		recognise_W();
		recognise_X();
		recognise_Y();
		recognise_Z();
		
		/*
		if(Alist.size()>1){
			int[] array1 = new int[5];
			int[] array2 = new int[5];
			int[] array3 = new int[5];
			int[] array4 = new int[5];
			
			for(int i=0;i<5;i++) array1[i]=al1.get(i);
			for(int i=0;i<5;i++) array2[i]=al2.get(i);
			for(int i=0;i<5;i++) array3[i]=al3.get(i);
			for(int i=0;i<5;i++) array4[i]=al4.get(i);
		
			Arrays.sort(array1);
			Arrays.sort(array2);
	        Arrays.sort(array3);
			Arrays.sort(array4);
			
		}
		*/
		

		
	}
	
	
	
	
	
	
	
	public void recognise_A(){
		
		int[] x5p={0,25,50,75,92};
		int pCount[] = new int[5];
		//int pCount=0;
		for(int p=0;p<5;p++){
			int pC =0;
			for(int i=0;i<101;i++){
		    	 for(int j=x5p[p];j<x5p[p]+6;j++){
		    		 for(int k=0;k<arrZX1.size();k++){
		    			 if(arrZX1.get(k)==i&&arrZY1.get(k)==j){
		    			     arrL1.add(j);
		    				 arrW1.add(i);
		    				 pC++;
		    			 }
		    				
		    		 }
		    	 }
		     }
			pCount[p]= (pC*100)/arrZX1.size();
		}
	     
	     
		int dCount[] = new int[5];
		
		for(int p=0;p<5;p++){
			 int dC=0;
		     for(int i=0;i<101;i++){
		    	 for(int j=x5p[p];j<x5p[p]+6;j++){
		    		 for(int k=0;k<arrZX27.size();k++){
		    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
		    				// arrL1.add(j);
		    				// arrW1.add(i);
		    				 dC++;
		    			 }
		    				
		    		 }
		    	 }
		     }
		     dCount[p] = (dC*100)/arrZX27.size();
		     
		}
	     
	
		int sum=0;
		
		for(int l=0;l<5;l++){
			int maxNo = Math.max(pCount[l], dCount[l]);
			int minNo = Math.min(pCount[l], dCount[l]);
			int dif = ((maxNo-minNo)*100)/maxNo;
			if(dif>51) sum+=0;
			else 
				sum+=1;
				
				
						
			
		}
		
		if(sum>4){
			
			larr[0]=1;
			System.out.println("It is A");
			
			
		}
		
		else {
			larr[0]=0;
			System.out.println("It is not A");
		}
	 	
			//System.out.println(pCount[4]);
			//System.out.println(dCount[4]);
	}
	
	
public void recognise_B(){
		
		int[] x5p={0,25,50,75,92};
		int pCount[] = new int[5];
		//int pCount=0;
		for(int p=0;p<5;p++){
			int pC =0;
			for(int i=0;i<101;i++){
		    	 for(int j=x5p[p];j<x5p[p]+6;j++){
		    		 for(int k=0;k<arrZX2.size();k++){
		    			 if(arrZX2.get(k)==i&&arrZY2.get(k)==j){
		    				// arrL1.add(j);
		    				 //arrW1.add(i);
		    				 pC++;
		    			 }
		    				
		    		 }
		    	 }
		     }
			pCount[p]= (pC*100)/arrZX2.size();
		}
	     
	     
		int dCount[] = new int[5];
		
		for(int p=0;p<5;p++){
			 int dC=0;
		     for(int i=0;i<101;i++){
		    	 for(int j=x5p[p];j<x5p[p]+6;j++){
		    		 for(int k=0;k<arrZX27.size();k++){
		    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
		    				// arrL1.add(j);
		    				// arrW1.add(i);
		    				 dC++;
		    			 }
		    				
		    		 }
		    	 }
		     }
		     dCount[p] = (dC*100)/arrZX27.size();
		     
		}
	     
	
		int sum=0;
		
		for(int l=0;l<5;l++){
			int maxNo = Math.max(pCount[l], dCount[l]);
			int minNo = Math.min(pCount[l], dCount[l]);
			int dif = ((maxNo-minNo)*100)/maxNo;
			if(dif>51) sum+=0;
			else {
				if(l==2){
					if(dif<31) sum+=1;
					else sum+=0;
				}
				else sum+=1;
			}
				
			
		}
		
		if(sum>4){
			larr[1]=1;
			System.out.println("It is B");
		
		}
		else {
			larr[1]=0;
			System.out.println("It is not B");
		}
	 	
			
	}
	
public void recognise_C(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX3.size();k++){
	    			 if(arrZX3.get(k)==i&&arrZY3.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				 
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX3.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
  
	
	int sum=0;
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else{
			if(l==2){
				if(dif<31) sum+=1;
				else sum+=0;
			}
			else sum+=1;
		}
			
			
		
	}
	
	if(sum>4){
		larr[2]=1;
		System.out.println("It is C");
		
	}
	else {
		larr[2]=0;
		System.out.println("It is not C");
	}
 	
		//System.out.println(pCount[4]);
		//System.out.println(dCount[4]);
}

public void recognise_D(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX4.size();k++){
	    			 if(arrZX4.get(k)==i&&arrZY4.get(k)==j){
	    				 //arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX4.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     
	  
	
	int sum=0;
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else {
			if(l==0||l==4){
				if(dif<31) sum+=1;
				else sum+=0;
			}
			else sum+=1;
		}
			
		
	}
	
	if(sum>4){
		larr[3]=1;
		System.out.println("It is D");
		
	}
	else {
		larr[3]=0;
		System.out.println("It is not D");
	}

  }
	

public void recognise_E(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX5.size();k++){
	    			 if(arrZX5.get(k)==i&&arrZY5.get(k)==j){
	    				 //arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX5.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     
	  
	
	int sum=0;
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
			sum+=1;
		
	}
	
	if(sum>4){
		larr[4]=1;
		System.out.println("It is E");
		
	}
	else {
		larr[4]=0;
		System.out.println("It is not E");
	}

  }
	
public void recognise_F(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX6.size();k++){
	    			 if(arrZX6.get(k)==i&&arrZY6.get(k)==j){
	    				 //arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX6.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     
	  
	
	int sum=0;
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
			sum+=1;
		
	}
	
	if(sum>4){
		larr[5]=1;
		System.out.println("It is F");
		
	}
	else {
		larr[5]=0;
		System.out.println("It is not F");
	}

  }
public void recognise_G(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX7.size();k++){
	    			 if(arrZX7.get(k)==i&&arrZY7.get(k)==j){
	    				 //arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX7.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     
	  
	
	int sum=0;
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
			sum+=1;
		
	}
	
	if(sum>4){
		larr[6]=1;
		System.out.println("It is G");
		
	}
	else {
		larr[6]=0;
		System.out.println("It is not G");
	}

  }
	
public void recognise_H(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX8.size();k++){
	    			 if(arrZX8.get(k)==i&&arrZY8.get(k)==j){
	    				 //arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX8.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     
	  
	
	int sum=0;
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
			sum+=1;
		
	}
	
	if(sum>4){
		larr[7]=1;
		System.out.println("It is H");
		
	}
	else {
		larr[7]=0;
		System.out.println("It is not H");
	}

  }

public void recognise_I(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX9.size();k++){
	    			 if(arrZX9.get(k)==i&&arrZY9.get(k)==j){
	    				 //arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX9.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     
	  
	
	int sum=0;
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
			sum+=1;
		
	}
	
	if(sum>4){
		larr[8]=1;
		System.out.println("It is I");
		
	}
	else {
		larr[8]=0;
		System.out.println("It is not I");
	}

  }
public void recognise_J(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX10.size();k++){
	    			 if(arrZX10.get(k)==i&&arrZY10.get(k)==j){
	    				 //arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX10.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     
	  
	
	int sum=0;
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
			sum+=1;
		
	}
	
	if(sum>4){
		larr[9]=1;
		System.out.println("It is J");
		
	}
	else {
		larr[9]=0;
		System.out.println("It is not J");
	}

  }

public void recognise_K(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX11.size();k++){
	    			 if(arrZX11.get(k)==i&&arrZY11.get(k)==j){
	    			     //arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX11.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     

	int sum=0;
	
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else {
			if(l==0||l==4){
				if(dif<31){
					sum+=1;
				}
				else sum+=0;
			}else
			 sum+=1;
		}
			
					 
		
	}
	
	if(sum>4){
		larr[10]=1;
		System.out.println("It is K");
		
	}
	else {
		larr[10]=0;
		System.out.println("It is not K");
	}
 	
		//System.out.println(pCount[4]);
		//System.out.println(dCount[4]);
}


public void recognise_L(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX12.size();k++){
	    			 if(arrZX12.get(k)==i&&arrZY12.get(k)==j){
	    				// arrL1.add(j);
	    				 //arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX12.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     

	int sum=0;
	
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
		  if(l==0||l==4){
			  if(dif<31) sum+=1;
			  else sum+=0;
		  }else{
			  sum+=1; 
		  }
			
		
	}
	
	if(sum>4){
		larr[11]=1;
		System.out.println("It is L");
	
	}
	else {
		larr[11]=0;
		System.out.println("It is not L");
	}
 	
		
}

public void recognise_M(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX13.size();k++){
    			 if(arrZX13.get(k)==i&&arrZY13.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX13.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}


int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else {
		if(l==2){
			if(dif<5) sum+=1;
			else sum+=0;
		}else{
			sum+=1;
		}
	}
		
		
	
}

if(sum>4){
	larr[12]=1;
	System.out.println("It is M");
	
}
else {
	larr[12]=0;
	System.out.println("It is not M");
}
	
	//System.out.println(pCount[4]);
	//System.out.println(dCount[4]);
}

public void recognise_N(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX14.size();k++){
    			 if(arrZX14.get(k)==i&&arrZY14.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX14.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) 
		sum+=0;
	
	else {
		if(l==0){
			if(dif<11)sum+=1;
			else sum+=0;
		}else{
			sum+=1;
		}
		
		
	}
		
	
}

if(sum>4){
	larr[13]=1;
	System.out.println("It is N");
	
}
else {
	larr[13]=0;
	System.out.println("It is not N");
}

}


public void recognise_O(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX15.size();k++){
    			 if(arrZX15.get(k)==i&&arrZY15.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX15.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
	
}

if(sum>4){
	larr[14]=1;
	System.out.println("It is O");
	
}
else {
	larr[14]=0;
	System.out.println("It is not O");
}

}

public void recognise_P(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX16.size();k++){
    			 if(arrZX16.get(k)==i&&arrZY16.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX16.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
	
}

if(sum>4){
	larr[15]=1;
	System.out.println("It is P");
	
}
else {
	larr[15]=0;
	System.out.println("It is not P");
}

}
public void recognise_Q(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX17.size();k++){
    			 if(arrZX17.get(k)==i&&arrZY17.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX17.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
	
}

if(sum>4){
	larr[16]=1;
	System.out.println("It is Q");
	
}
else {
	larr[16]=0;
	System.out.println("It is not Q");
}

}

public void recognise_R(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX18.size();k++){
    			 if(arrZX18.get(k)==i&&arrZY18.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX18.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
	
}

if(sum>4){
	larr[17]=1;
	System.out.println("It is R");
	
}
else {
	larr[17]=0;
	System.out.println("It is not R");
}

}

public void recognise_S(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX19.size();k++){
    			 if(arrZX19.get(k)==i&&arrZY19.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX19.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
	
}

if(sum>4){
	larr[18]=1;
	System.out.println("It is S");
	
}
else {
	larr[18]=0;
	System.out.println("It is not S");
}

}
public void recognise_T(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX20.size();k++){
    			 if(arrZX20.get(k)==i&&arrZY20.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX20.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
	
}

if(sum>4){
	larr[19]=1;
	System.out.println("It is T");
	
}
else{
	larr[19]=0;
	System.out.println("It is not T");
}

}
	
public void recognise_U(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX21.size();k++){
	    			 if(arrZX21.get(k)==i&&arrZY21.get(k)==j){
	    			    // arrL1.add(j);
	    				// arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX21.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     

	int sum=0;
	
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
			sum+=1;
			
			
					
		
	}
	
	if(sum>4){
		larr[20]=1;
		System.out.println("It is U");
		
	}
	else {
		larr[20]=0;
		System.out.println("It is not U");
	}
 	
		//System.out.println(pCount[4]);
		//System.out.println(dCount[4]);
}


public void recognise_V(){
	
	int[] x5p={0,25,50,75,92};
	int pCount[] = new int[5];
	//int pCount=0;
	for(int p=0;p<5;p++){
		int pC =0;
		for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX22.size();k++){
	    			 if(arrZX22.get(k)==i&&arrZY22.get(k)==j){
	    				// arrL1.add(j);
	    				 //arrW1.add(i);
	    				 pC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
		pCount[p]= (pC*100)/arrZX22.size();
	}
     
     
	int dCount[] = new int[5];
	
	for(int p=0;p<5;p++){
		 int dC=0;
	     for(int i=0;i<101;i++){
	    	 for(int j=x5p[p];j<x5p[p]+6;j++){
	    		 for(int k=0;k<arrZX27.size();k++){
	    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
	    				// arrL1.add(j);
	    				// arrW1.add(i);
	    				 dC++;
	    			 }
	    				
	    		 }
	    	 }
	     }
	     dCount[p] = (dC*100)/arrZX27.size();
	     
	}
     

	int sum=0;
	
	for(int l=0;l<5;l++){
		int maxNo = Math.max(pCount[l], dCount[l]);
		int minNo = Math.min(pCount[l], dCount[l]);
		int dif = ((maxNo-minNo)*100)/maxNo;
		if(dif>51) sum+=0;
		else 
			sum+=1;
		
	}
	
	if(sum>4){
		larr[21]=1;
		System.out.println("It is V");
	
	}
	else {
		larr[21]=0;
		System.out.println("It is not V");
	}
 	
		
}

public void recognise_W(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX23.size();k++){
    			 if(arrZX23.get(k)==i&&arrZY23.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX23.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}


int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
		
	
}

if(sum>4){
	larr[22]=1;
	System.out.println("It is W");
	
}
else{
	larr[22]=0;
	System.out.println("It is not W");
}
	
	//System.out.println(pCount[4]);
	//System.out.println(dCount[4]);
}

public void recognise_X(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX24.size();k++){
    			 if(arrZX24.get(k)==i&&arrZY24.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX24.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else {
		if(l==0||l==4){
			if(dif<11) sum+=1;
			else sum+=0;
		}
		else sum+=1;
	}
	
}

if(sum>4){
	larr[23]=1;
	System.out.println("It is X");
	 
}
else {
	larr[23]=0;
	System.out.println("It is not X");
}

}


public void recognise_Y(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX25.size();k++){
    			 if(arrZX25.get(k)==i&&arrZY25.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX25.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
	
}

if(sum>4){
	larr[24]=1;
	System.out.println("It is Y");
	
}
else {
	larr[24]=0;
	System.out.println("It is not Y");
}

}

public void recognise_Z(){

int[] x5p={0,25,50,75,92};
int pCount[] = new int[5];
//int pCount=0;
for(int p=0;p<5;p++){
	int pC =0;
	for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX26.size();k++){
    			 if(arrZX26.get(k)==i&&arrZY26.get(k)==j){
    				 //arrL1.add(j);
    				// arrW1.add(i);
    				 pC++;
    			 }
    				
    		 }
    	 }
     }
	pCount[p]= (pC*100)/arrZX26.size();
}
 
 
int dCount[] = new int[5];

for(int p=0;p<5;p++){
	 int dC=0;
     for(int i=0;i<101;i++){
    	 for(int j=x5p[p];j<x5p[p]+6;j++){
    		 for(int k=0;k<arrZX27.size();k++){
    			 if(arrZX27.get(k)==i&&arrZY27.get(k)==j){
    				// arrL1.add(j);
    				// arrW1.add(i);
    				 dC++;
    			 }
    				
    		 }
    	 }
     }
     dCount[p] = (dC*100)/arrZX27.size();
     
}
 
  

int sum=0;
for(int l=0;l<5;l++){
	int maxNo = Math.max(pCount[l], dCount[l]);
	int minNo = Math.min(pCount[l], dCount[l]);
	int dif = ((maxNo-minNo)*100)/maxNo;
	if(dif>51) sum+=0;
	else 
		sum+=1;
	
}

if(sum>4){
	larr[25]=1;
	System.out.println("It is Z");
	
}
else {
	larr[25]=0;
	System.out.println("It is not Z");
}

}


	public void paint(Graphics g){
		
		//g.drawImage(image, 100,100,this);
		//g.drawImage(image2, 100,250,this);
		g.setColor(Color.blue);
		g.fillOval(100,150,5,5);
		g.fillOval(100,50,5,5);
		g.fillOval(50, 50, 5, 5);	
		g.fillOval(100, 100, 5, 5);
		g.fillOval(0,150,5,5);
		
		
		
		
				
			
		
		
		
		
		
		
		
		
		
		
		
		if(larr[0]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX1.size();i++){
				
			g.fillOval(arrZX1.get(i), arrZY1.get(i)+50, 3, 3);
		}
		
		if(larr[1]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}

		for(int i=0;i<arrZX2.size();i++){
				
			g.fillOval(arrZX2.get(i)+110, arrZY2.get(i)+50, 3, 3);
		}
		
		if(larr[2]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}

		for(int i=0;i<arrZX3.size();i++){
				
			g.fillOval(arrZX3.get(i)+220, arrZY3.get(i)+50, 3, 3);
		}
		
		if(larr[3]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}

		for(int i=0;i<arrZX4.size();i++){
				
			g.fillOval(arrZX4.get(i)+330, arrZY4.get(i)+50, 3, 3);
		}
		
		if(larr[4]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX5.size();i++){
				
			g.fillOval(arrZX5.get(i)+440, arrZY5.get(i)+50, 3, 3);
		}
		
		if(larr[5]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX6.size();i++){
				
			g.fillOval(arrZX6.get(i)+550, arrZY6.get(i)+50, 3, 3);
		}
		
		if(larr[6]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX7.size();i++){
				
			g.fillOval(arrZX7.get(i)+660, arrZY7.get(i)+50, 3, 3);
		}
		
		if(larr[7]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX8.size();i++){
				
			g.fillOval(arrZX8.get(i)+770, arrZY8.get(i)+50, 3, 3);
		}
		
		if(larr[8]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX9.size();i++){
			
			g.fillOval(arrZX9.get(i)+880, arrZY9.get(i)+50, 3, 3);
		}
		
		if(larr[9]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX10.size();i++){
				
			g.fillOval(arrZX10.get(i), arrZY10.get(i)+200, 3, 3);
		}
		
		if(larr[10]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}

		for(int i=0;i<arrZX11.size();i++){
			
			g.fillOval(arrZX11.get(i)+110, arrZY11.get(i)+200, 3, 3);
		}

		if(larr[11]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX12.size();i++){
				
			g.fillOval(arrZX12.get(i)+220, arrZY12.get(i)+200, 3, 3);
		}
		
		if(larr[12]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}

		for(int i=0;i<arrZX13.size();i++){
			
			g.fillOval(arrZX13.get(i)+330, arrZY13.get(i)+200, 3, 3);
		}
		
		if(larr[13]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX14.size();i++){
				
			g.fillOval(arrZX14.get(i)+440, arrZY14.get(i)+200, 3, 3);
		}
		
		if(larr[14]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX15.size();i++){
			
			g.fillOval(arrZX15.get(i)+550, arrZY15.get(i)+200, 3, 3);
		}
		
		if(larr[15]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		
		for(int i=0;i<arrZX16.size();i++){
			
			g.fillOval(arrZX16.get(i)+660, arrZY16.get(i)+200, 3, 3);
		}
		if(larr[16]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX17.size();i++){
				
			g.fillOval(arrZX17.get(i)+770, arrZY17.get(i)+200, 3, 3);
		}
		
		if(larr[17]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX18.size();i++){
				
			g.fillOval(arrZX18.get(i)+880, arrZY18.get(i)+200, 3, 3);
		}
		
		if(larr[18]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX19.size();i++){
				
			g.fillOval(arrZX19.get(i), arrZY19.get(i)+350, 3, 3);
		}

		if(larr[19]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX20.size();i++){
				
			g.fillOval(arrZX20.get(i)+110, arrZY20.get(i)+350, 3, 3);
		}

		if(larr[20]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX21.size();i++){
			
			g.fillOval(arrZX21.get(i)+220, arrZY21.get(i)+350, 3, 3);
		}

		if(larr[21]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX22.size();i++){
				
			g.fillOval(arrZX22.get(i)+330, arrZY22.get(i)+350, 3, 3);
		}
		
		if(larr[22]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX23.size();i++){
				
			g.fillOval(arrZX23.get(i)+440, arrZY23.get(i)+350, 3, 3);
		}
		
		if(larr[23]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX24.size();i++){
			
			g.fillOval(arrZX24.get(i)+550, arrZY24.get(i)+350, 3, 3);
		}
		if(larr[24]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		for(int i=0;i<arrZX25.size();i++){
			
			g.fillOval(arrZX25.get(i)+660, arrZY25.get(i)+350, 3, 3);
		}
		
		if(larr[25]==1){
			g.setColor(Color.green);
		}else{
			g.setColor(Color.black);
		}
		
		for(int i=0;i<arrZX26.size();i++){
				
			g.fillOval(arrZX26.get(i)+770, arrZY26.get(i)+350, 3, 3);
		}
		
		
		
		
		
		/*g.setColor(Color.green);	
		for(int i=0;i<arrZX27.size();i++){
			g.fillOval(arrZX27.get(i), arrZY27.get(i)+50, 3, 3);
		}*/
		
		/*
		g.setColor(Color.RED);	
		for(int i=0;i<arrL1.size();i++){
			g.fillOval(arrW1.get(i), arrL1.get(i)+200, 3, 3);
		}
		*/
		
		
		//g.fillOval(30, 100, 30, 30);
		repaint();
	}
	

	public static void main(String[] args) throws Exception{
		new LetterDetective();
		
		
	}
}


