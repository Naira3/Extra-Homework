
public class BankAccount {
	final String BankName = "World Bank";
	String ClientName;
	double ClientMoney;

	public BankAccount(String name, double money){
		this.ClientName=name;
		this.ClientMoney=money;
	}
	String GetClient(){
		return this.ClientName;
	}
	int GetMoney(){
		int b=(int)this.ClientMoney;
		return b;
	}
     public  String toString() {
		 return "Dear "+ GetClient()+", You have "+ GetMoney()+" left on your" + this.BankName + "account"; 
     }
}
	



	
    		
	
