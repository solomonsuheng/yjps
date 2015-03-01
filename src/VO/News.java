package VO;

/**
 * @author mac
 *
 */
public class News {
	// 新闻id
	private String nid;
	// 新闻标题
	private String ntitle;
	// 新闻发布日期
	private String ndata;
	// 内容
	private String ncontent;
	// 新闻的类型为1是为新闻，2为市场动态
	private String ntype;
	private String npublisher;

	public News(String nid, String ntitle, String ndata, String ncontent,
			String ntype, String npublisher) {
		this.nid = nid;
		this.ntitle = ntitle;
		this.ndata = ndata;
		this.ncontent = ncontent;
		this.ntype = ntype;
		this.npublisher = npublisher;
	}

	public String toString() {
		return "nid :" + this.nid + " ntitle:" + this.ntitle + " ndata:"
				+ this.ndata;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNdata() {
		return ndata;
	}

	public void setNdata(String ndata) {
		this.ndata = ndata;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNtype() {
		return ntype;
	}

	public void setNtype(String ntype) {
		this.ntype = ntype;
	}

	public String getNpublisher() {
		return npublisher;
	}

	public void setNpublisher(String npublisher) {
		this.npublisher = npublisher;
	}

}
