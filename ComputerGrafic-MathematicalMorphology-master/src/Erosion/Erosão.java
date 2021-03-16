package Erosion;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junin
 */
public class Erosão {
    BufferedImage imagem;
    double teta;
    int largura = 0;
    int altura = 0;
    double R;
    double G;
    double B;
    BufferedImage imagemFinal;
    
    public void calcularErosão() throws IOException {
                BufferedImage imagem;
                imagem = ImageIO.read(new File("imagem.png"));
		WritableRaster raster = imagem.getRaster();
		BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);
		WritableRaster rasterNovo = novaImagem.getRaster();  

		int[] pixel = new int[4];
		for(int c=0; c<10; c++){
		for (int i = 1; i < imagem.getWidth()-1; i++) {
			for (int j = 1; j < imagem.getHeight()-1; j++) {
	
				raster.getPixel(i, j, pixel);
				
				//SE PIXEL FOR BRANCO
				 if(pixel[0] == 255){
					 pixel[0] = 255;
					 pixel[1] = 255;
					 pixel[2] = 255;
						 
				     rasterNovo.setPixel(i, j, pixel);//centro
					 rasterNovo.setPixel(i+1, j, pixel);//cima ok
					 rasterNovo.setPixel(i-1, j, pixel);//baixo ok
					 rasterNovo.setPixel(i, j+1, pixel);//direita ok
					 rasterNovo.setPixel(i , j-1, pixel);//esquerda ok
				 }
			}
		}
                }
		try {
			novaImagem.setData(rasterNovo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
                ImageIO.write(novaImagem, "jpg", new File("ImagemFinal.jpg"));
	}
    
}
