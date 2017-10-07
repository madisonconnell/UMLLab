
public class Account extends Customer {
	String dateCreated;
	int accountNum;
	String password;
	String state;
	
	public String getDateCreated()
	{
		return dateCreated;
	}
	public int getAccountNum()
	{
		return accountNum;
	}
	public String setPass( String newPass)
	{
		password = newPass;
		return password;
	}
	public String getState()
	{
		return state;
	}
}
