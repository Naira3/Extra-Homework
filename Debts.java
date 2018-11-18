
public class Debts{
	String Month;
	int Year;
	double DebtAmount;
	
	 public Debts(String Month, int year, int amount) {
		 this.Month=Month;
		 this.Year=year;
		 this.DebtAmount=amount;
				 
		  }
	 public  String toString() {
		 return "You have taken"+this.DebtAmount+" on"+ this.Month +","+ this.Year;
	 }
		 
}
