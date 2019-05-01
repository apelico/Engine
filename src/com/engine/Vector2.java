package com.engine;

public class Vector2 {
	public float x;
	public float y;
	
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
}
