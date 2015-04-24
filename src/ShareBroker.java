public class ShareBroker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareData sdata = new ShareData();
		Client  c1 = new Client("Ahamd",sdata);
		Client  c2 = new Client("Mohammad",sdata);
		Client  c3 = new Client("Abdalla",sdata);
		// create Other Observers here
		sdata.setNewValues("ABC", 1000);
		sdata.setNewValues("XYZ",2000);
	}
}
