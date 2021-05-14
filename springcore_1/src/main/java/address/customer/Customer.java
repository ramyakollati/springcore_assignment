package address.customer;

public class Customer {
	private int cid;
	private String cname;
	private long ccontact;
	private String caddress;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCcontact() {
		return ccontact;
	}
	public void setCcontact(long ccontact) {
		this.ccontact = ccontact;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
	public void cust()
	{
		System.out.println("cid is : "+this.cid+", "+ "cname is :"+this.cname+", "+ "ccontact is :"+this.ccontact+", "+ " addressis :"+this.caddress);
	}
}
