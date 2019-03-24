package com.engine;

public class Vector2 {
	private float x;
	private float y;
	
	public Vector2(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Vector2() {
		this.x = 0;
		this.y = 0;
	}
	
	public void add(Vector2 vec)
	{
		x += vec.x;
		y += vec.y;
	}
	
	public void subtract(Vector2 vec)
	{
		x -= vec.x;
		y -= vec.y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
}
