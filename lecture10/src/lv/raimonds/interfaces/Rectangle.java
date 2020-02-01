package lv.raimonds.interfaces;

public class Rectangle implements Shape{
	private int length;
	private int width;
	private String color;
	public Rectangle(int l, int w){
		this.length = l;
		this.width = w;
	}
	public Rectangle(){
		this.color = "red";
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public String getColor() {
		return color;
	}
	
	
	
	
	
	
}
