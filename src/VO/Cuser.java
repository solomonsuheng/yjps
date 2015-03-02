package VO;

/**
 * @author mac
 *
 */
public class Cuser {
	private String cuname;
	private String cupwd;
	private String cutype;

	public Cuser(String cuname, String cupwd, String cutype) {
		this.cuname = cuname;
		this.cupwd = cupwd;
		this.cutype = cutype;
	}

	public String toString() {
		return this.cuname + " " + this.cupwd + " " + this.cutype;
	}

	// Getter and Setter
	public String getCuname() {
		return cuname;
	}

	public void setCuname(String cuname) {
		this.cuname = cuname;
	}

	public String getCupwd() {
		return cupwd;
	}

	public void setCupwd(String cupwd) {
		this.cupwd = cupwd;
	}

	public String getCutype() {
		return cutype;
	}

	public void setCutype(String cutype) {
		this.cutype = cutype;
	}

}
