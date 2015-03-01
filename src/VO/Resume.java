package VO;

/**
 * @author mac
 *
 */
public class Resume {
	private String rid;
	private String rposition;
	private String rmoney;
	private String rname;
	private String rsex;
	private String rbirthday;
	private String ridcard;
	private String rtel;

	public Resume(String rid, String rposition, String rmoney, String rname,
			String rsex, String rbirthday, String ridcard, String rtel) {
		this.rid = rid;
		this.rposition = rposition;
		this.rmoney = rmoney;
		this.rname = rname;
		this.rsex = rsex;
		this.rbirthday = rbirthday;
		this.ridcard = ridcard;
		this.rtel = rtel;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getRposition() {
		return rposition;
	}

	public void setRposition(String rposition) {
		this.rposition = rposition;
	}

	public String getRmoney() {
		return rmoney;
	}

	public void setRmoney(String rmoney) {
		this.rmoney = rmoney;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRsex() {
		return rsex;
	}

	public void setRsex(String rsex) {
		this.rsex = rsex;
	}

	public String getRbirthday() {
		return rbirthday;
	}

	public void setRbirthday(String rbirthday) {
		this.rbirthday = rbirthday;
	}

	public String getRidcard() {
		return ridcard;
	}

	public void setRidcard(String ridcard) {
		this.ridcard = ridcard;
	}

	public String getRtel() {
		return rtel;
	}

	public void setRtel(String rtel) {
		this.rtel = rtel;
	}
	
	
}
