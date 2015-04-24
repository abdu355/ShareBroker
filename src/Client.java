public class Client implements Observer{
	private String cname;
	private String sname;
	private int svalue;
	private Subject shareData;
    public Client(String cname,Subject shareData)
	{
    this.cname = cname;
	this.shareData = shareData;
	shareData.registerObserver(this);
	}
	public void update(String sname, int svalue) {
	// TODO Auto-generated method stub
	this.sname = sname;
	this.svalue = svalue;
	display();
	}
	public void display () 
	{
	// TODO Auto-generated method stub
	System.out.println(cname + " observed change in " +
	" share  "+ sname + " and its new value  " + svalue);
	}

}
