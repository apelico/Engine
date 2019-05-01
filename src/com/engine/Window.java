package com.engine;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Window {
    private BufferStrategy bufferStrategy;
    private Graphics2D g;
    private Canvas canvas;
    private JFrame frame;
    private MainGame game;
    

	public static final int WIDTH = 1024;
    public static final int HEIGHT = 768;
    
    //Scales the screen
    public static int Scale = 1;
    
    //Zoom variables
    private double zoom = 1;
    private double anchorX, anchorY;
    
    

    public Window(Engine engine, MainGame game) {
    	this.game = game;

        frame = new JFrame("Test Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas = new Canvas();
        canvas.setSize(WIDTH * Scale, HEIGHT * Scale);

        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        g = (Graphics2D)bufferStrategy.getDrawGraphics();
    }
    
    public void Render() {
    	AffineTransform at = new AffineTransform();
    	//set screen position to center after zoom
    	anchorX = (WIDTH - (WIDTH * (zoom))) / 2;
    	anchorY = (HEIGHT - (HEIGHT * (zoom))) / 2;
    	
    	//zooms the screen in and positions to center 
    	at.translate(anchorX, anchorY);
    	at.scale(zoom * Scale, zoom * Scale);
    	
    	g.setTransform(at);
    	
    	//Draws all objects
    	game.render(g);
        bufferStrategy.show();
        
        //Clears screen
        g.clearRect(-10000, -10000, 20000, 20000);
    }

    public Canvas getCanvas() {
        return canvas;
    }
    
    public JFrame getFrame() {
		return frame;
	}
    
    public void setZoom(int amount) {
    	zoom = amount;
    }
}