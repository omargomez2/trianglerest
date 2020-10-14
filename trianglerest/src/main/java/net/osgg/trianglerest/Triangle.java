package net.osgg.trianglerest;

public class Triangle {
	String sidea, sideb, sidec;

	public Triangle(String sidea, String sideb, String sidec) {
		super();
		this.sidea = sidea;
		this.sideb = sideb;
		this.sidec = sidec;
	}

	public String getSidea() {
		return sidea;
	}

	public void setSidea(String sidea) {
		this.sidea = sidea;
	}

	public String getSideb() {
		return sideb;
	}

	public void setSideb(String sideb) {
		this.sideb = sideb;
	}

	public String getSidec() {
		return sidec;
	}

	public void setSidec(String sidec) {
		this.sidec = sidec;
	}
}
