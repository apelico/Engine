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
	
	public Game() {
		clip.loop();
		try {
			image = ImageIO.read(Image.class.getResourceAsStream("/testImage.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	int imageX = 0;
	int imageY = 0;
	@Override
	public void update(Engine e) {
		imageX ++;
		imageY ++;
	}

	@Override
	public void render(Graphics2D g) {
		//Draws Image to center of screen
		g.drawImage(image, imageX, imageY, null);
		
	}

}
