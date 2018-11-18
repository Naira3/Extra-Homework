
public class ManageMoney {
	String ClientName;
	double Input;
	double Output;
	 public ManageMoney(double Input, double Output, String name){
		 this.Input=Input;
		 this.Output=Output;
		 this.ClientName=name;

	 }
	 public double NetPrice(){
		 return this.Input-this.Output;
	 }
	public String toString(){
		return "Dear client, you have" + this.NetPrice() +"dollars left";
	}
	
}
