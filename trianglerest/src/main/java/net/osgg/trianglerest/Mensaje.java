package net.osgg.trianglerest;

public class Mensaje {
	String type;
	String perimeter;
	
	public Mensaje(String type, String perimeter) {
		super();
		this.type = type;
		this.perimeter = perimeter;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPerimeter() {
		return perimeter;
	}
	
	public void setPerimeter(String perimeter) {
		this.perimeter = perimeter;
	}
}
