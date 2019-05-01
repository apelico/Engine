package com.game;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.engine.Engine;
import com.engine.MainGame;
import com.engine.SoundClip;

public class Game extends MainGame{
	SoundClip clip = new SoundClip("/testSound.wav");
	private Image image;
	private Image tileSet;
	
	public Game() {
		//clip.loop();
		try {
			image = ImageIO.read(Image.class.getResourceAsStream("/testImage.png"));
			tileSet = ImageIO.read(Image.class.getResourceAsStream("/tileset.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	int imageX = -250;
	int imageY = -250;
	@Override
	public void update(Engine e) {	
		imageX ++;
		imageY ++;
	}

	@Override
	public void render(Graphics2D g) {
		int xTile = 0;
		int yTile = 1;
		//Draws Image to center of screen
		g.drawImage(tileSet, imageX, imageY, imageX + 32, imageY + 32, xTile * 32, yTile * 32, (xTile * 32) + 32, (yTile * 32) + 32, null);
		
		//Draws Image to center of screen
		g.drawImage(image, imageX + 100, imageY + 100, null);
		
	}

}
